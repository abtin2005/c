package com.xcode.myretrofilt

import android.os.Bundle

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.b0 -> addmuber("0")
            R.id.btn1 -> addmuber("1")
            R.id.btn2 -> addmuber("2")
            R.id.btn3 -> addmuber("3")
            R.id.btncal4 -> addmuber("4")
            R.id.btncal5 -> addmuber("5")
            R.id.btncal6 -> addmuber("6")
            R.id.cal7 -> addmuber("7")
            R.id.cal8 -> addmuber("8")
            R.id.cal9 -> addmuber("9")
        // عمل گر
            R.id.btn_clear->clear()
            R.id.bnm_zarb->operator("*")
            R.id.btm_mimez->operator("-")
            R.id.mu_eqoal->calculat()
            R.id.s_ta->operator("/")
            R.id.btnalplas->operator("+")

        }
    }

    private fun clear() {

    }

    private fun addmuber(number: String) {
        R.id.txtcal.append(number)
    }

    private fun operator(OP:String) {

    }


    private fun calculat() {

    }
}

private fun Number.append(number: String) {

}







