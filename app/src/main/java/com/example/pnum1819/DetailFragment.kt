package com.example.pnum1819

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }
    fun setSelectedItem(selectedItem: String?) {
        val infoTextView = view?.findViewById<TextView>(R.id.detail_textView)
        val imageView = view?.findViewById<ImageView>(R.id.imageViewPanda)

        when (selectedItem) {
            "Тракененская лошадь" -> {
                infoTextView?.text= getString(R.string.textTraken)
                imageView?.setImageResource(R.drawable.traken)
            }
            "Арабская лошадь"-> {
                infoTextView?.text= getString(R.string.textArab)
                imageView?.setImageResource(R.drawable.arab)
            }
            "Чистокровная верховая лошадь"-> {
                infoTextView?.text= getString(R.string.textChictokrov)
                imageView?.setImageResource(R.drawable.chistokrov)
            }
            "Орловский рысак"-> {
                infoTextView?.text= getString(R.string.textRisak)
                imageView?.setImageResource(R.drawable.risak)
            }
            "Фризская лошадь"-> {
                infoTextView?.text= getString(R.string.textFriz)
                imageView?.setImageResource(R.drawable.friz)
            }
            "Клейдесдаль"-> {
                infoTextView?.text= getString(R.string.textKlei)
                imageView?.setImageResource(R.drawable.klei)
            }
        }
    }

}