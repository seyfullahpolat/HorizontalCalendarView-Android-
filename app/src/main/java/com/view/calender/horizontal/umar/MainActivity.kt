package com.view.calender.horizontal.umar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.view.calender.horizontal.umar.horizontalcalendarview.DayDateMonthYearModel
import com.view.calender.horizontal.umar.horizontalcalendarview.HorizontalCalendarListener
import com.view.calender.horizontal.umar.horizontalcalendarview.HorizontalCalendarView

class MainActivity : AppCompatActivity() , HorizontalCalendarListener  {



    lateinit var textView : TextView
    lateinit var hcv : HorizontalCalendarView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.month)

        hcv = findViewById(R.id.hcv)
        hcv.setContext(this@MainActivity)
        hcv.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        hcv.showControls(false)
        hcv.showControls(true)
        hcv.setControlTint(R.color.colorAccent)
        hcv.changeAccent(R.color.white)
    }

    override fun updateMonthOnScroll(selectedDate: DayDateMonthYearModel?) {
//        Toast.makeText(this@MainActivity ,""+ selectedDate?.month + " " + selectedDate?.year , Toast.LENGTH_LONG).show()
        textView.text = ""+ selectedDate?.month + " " + selectedDate?.year

    }

    override fun newDateSelected(selectedDate: DayDateMonthYearModel?) {
        Toast.makeText(this@MainActivity ,selectedDate?.date +""+ selectedDate?.month + " " + selectedDate?.year , Toast.LENGTH_LONG).show()
    }

}