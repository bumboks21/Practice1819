package com.example.pnum1819

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class ListFragment: Fragment(){
    internal interface OnFragmentSendDataListener {
        fun onSendData(data: String?)
    }
    private var fragmentSendDataListener: OnFragmentSendDataListener? = null
    var countries = arrayOf<String?>("Тракененская лошадь", "Арабская лошадь", "Чистокровная верховая лошадь", "Орловский рысак", "Фризская лошадь", "Клейдесдаль",)


    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            fragmentSendDataListener = context as OnFragmentSendDataListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                context.toString()
                        + " должен реализовывать интерфейс OnFragmentInteractionListener"
            )
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_list, container,
            false)
        val countriesList = view.findViewById<ListView>(R.id.animalListView)
        val adapter: ArrayAdapter<String?> =
            ArrayAdapter((context)!!, android.R.layout.simple_list_item_1,
                countries)
        countriesList.adapter = adapter
        countriesList.onItemClickListener =
            AdapterView.OnItemClickListener { parent, v, position, id ->
                val selectedItem: String = parent.getItemAtPosition(position)
                        as String
                fragmentSendDataListener!!.onSendData(selectedItem)
            }
        return view
    }
}