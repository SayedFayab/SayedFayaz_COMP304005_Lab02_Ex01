package com.example.sayedfayaz_comp304005_lab02_ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences

class CheckOutActivity : AppCompatActivity() {
    private val sharedPreferenceFile = "kotlinsharedpreference"
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)
        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPreferenceFile, Context.MODE_PRIVATE)

        clearSharedPreferences()
        val selectProduct = findViewById<View>(R.id.selectProduct) as TextView
        selectProduct.visibility = View.INVISIBLE
        val nextBtn = findViewById<Button>(R.id.button)

        val titleTextView = findViewById<TextView>(R.id.tV)

        val myPreference = getSharedPreferences("info", MODE_PRIVATE)
        val dryerState = myPreference.getBoolean("dryerState", false)
        val dryerName = myPreference.getString("dryerName", "")
        val macroState = myPreference.getBoolean("macroState", false)
        val macroName = myPreference.getString("macroName", "")
        val washingState = myPreference.getBoolean("washingState", false)
        val washingName = myPreference.getString("washingName", "")

        val SamsungTvState = myPreference.getBoolean("SamsungTvState", false)
        val SamsungTvName = myPreference.getString("SamsungTvName", "")
        val hisenseTvState = myPreference.getBoolean("hisenseTvState", false)
        val hisenseTvName = myPreference.getString("hisenseTvName", "")
        val philipsTvState = myPreference.getBoolean("philipsTvState", false)
        val philipsTvName= myPreference.getString("philipsTvName", "")

        val lapTopCompState = myPreference.getBoolean("lapTopCompState", false)
        val lapTopCompName = myPreference.getString("lapTopCompName", "")
        val deskTopCompState = myPreference.getBoolean("deskTopCompState", false)
        val deskTopCompName = myPreference.getString("deskTopCompName", "")
        val miniDesktopState = myPreference.getBoolean("miniDesktopState", false)
        val miniDesktopName = myPreference.getString("miniDesktopName", "")

        val bedState = myPreference.getBoolean("bedState", false)
        val bedName = myPreference.getString("bedName", "")
        val sofaState = myPreference.getBoolean("sofaState", false)
        val sofaName = myPreference.getString("sofaName", "")
        val cabinetState = myPreference.getBoolean("cabinetState", false)
        val cabinetName = myPreference.getString("cabinetName", "")

        val seatState = myPreference.getBoolean("seatState", false)
        val seatName = myPreference.getString("seatName", "")
        val steeringState = myPreference.getBoolean("steeringState", false)
        val steerName = myPreference.getString("steerName", "")
        val wirelessState = myPreference.getBoolean("wirelessState", false)
        val wirelessName = myPreference.getString("wirelessName", "")

        var options_exist = false // to check whether there are selected options at all
        val rg = findViewById<View>(R.id.radioGroupCombo) as RadioGroup

        //checking every checkbox and adding radio button if it's checked
        if (dryerState) {
            val rb1 = RadioButton(this)
            rb1.setText(dryerName)
            rb1.id = 1
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb1, params)
            options_exist = true
        }
        if (macroState) {
            val rb2 = RadioButton(this)
            rb2.setText(macroName)
            rb2.id = 2
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb2, params)
            options_exist = true
        }

        if (washingState) {
            val rb12 = RadioButton(this)
            rb12.setText(washingName)
            rb12.id = 12
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb12, params)
            options_exist = true
        }

        if (SamsungTvState) {
            val rb3 = RadioButton(this)
            rb3.setText(SamsungTvName)
            rb3.id = 3
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb3, params)
            options_exist = true
        }
        if (hisenseTvState) {
            val rb4 = RadioButton(this)
            rb4.setText(hisenseTvName)
            rb4.id = 4
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb4, params)
            options_exist = true
        }

        if (philipsTvState) {
            val rb14 = RadioButton(this)
            rb14.setText(philipsTvName)
            rb14.id = 14
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb14, params)
            options_exist = true
        }

        if (lapTopCompState) {
            val rb5 = RadioButton(this)
            rb5.setText(lapTopCompName)
            rb5.id = 5
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb5, params)
            options_exist = true
        }

        if (deskTopCompState) {
            val rb6 = RadioButton(this)
            rb6.setText(deskTopCompName)
            rb6.id = 6
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb6, params)
            options_exist = true
        }

        if (miniDesktopState) {
            val rb11 = RadioButton(this)
            rb11.setText(miniDesktopName)
            rb11.id = 11
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb11, params)
            options_exist = true
        }

        if (bedState) {
            val rb7 = RadioButton(this)
            rb7.setText(bedName)
            rb7.id = 7
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb7, params)
            options_exist = true
        }

        if (sofaState) {
            val rb8 = RadioButton(this)
            rb8.setText(sofaName)
            rb8.id = 8
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb8, params)
            options_exist = true
        }

        if (cabinetState) {
            val rb13 = RadioButton(this)
            rb13.setText(cabinetName)
            rb13.id = 13
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb13, params)
            options_exist = true
        }

        if (seatState) {
            val rb9 = RadioButton(this)
            rb9.setText(seatName)
            rb9.id = 9
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb9, params)
            options_exist = true
        }

        if (steeringState) {
            val rb10 = RadioButton(this)
            rb10.setText(steerName)
            rb10.id = 10
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb10, params)
            options_exist = true
        }

        if (wirelessState) {
            val rb15 = RadioButton(this)
            rb15.setText(wirelessName)
            rb15.id = 15
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb15, params)
            options_exist = true
        }

        if (!options_exist) {
            nextBtn.visibility = View.INVISIBLE
            selectProduct.visibility = View.VISIBLE
        }

        nextBtn.setOnClickListener {
            if (options_exist==false){
                Toast.makeText(applicationContext,"Please select atleast one", Toast.LENGTH_SHORT).show()
            }else{
                intent = Intent(applicationContext,PaymentActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun clearSharedPreferences() {
        // Clear the shared preferences file
        val sharedPref = getSharedPreferences(sharedPreferenceFile, Context.MODE_PRIVATE)
        sharedPref.edit().clear().apply()
    }
}

