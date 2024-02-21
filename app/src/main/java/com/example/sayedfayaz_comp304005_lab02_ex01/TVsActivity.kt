package com.example.sayedfayaz_comp304005_lab02_ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class TVsActivity : AppCompatActivity() {
    var SamsungTv:CheckBox? = null
    var hisenseTv:CheckBox? = null
    var philipsTv:CheckBox? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvs)

        SamsungTv = findViewById<CheckBox>(R.id.checkBoxSam)
        hisenseTv = findViewById<CheckBox>(R.id.checkBoxHisense)
        philipsTv = findViewById<CheckBox>(R.id.checkBoxPhilips)
        val checkoutBtn = findViewById<Button>(R.id.checkout)
        var title = "TVs"

        checkoutBtn.setOnClickListener {
            check(it)
            intent = Intent(applicationContext, CheckOutActivity::class.java)
            //intent.putExtra("selected", result)
            intent.putExtra("title",title)
            startActivity(intent)
        }


    }


    fun check(view: View?) { //saving information from checkboxes to further process on checkout page
        val myPreference = getSharedPreferences("info", 0)
        //prepare it for edit by creating an Edit object
        val preferenceEditor = myPreference.edit()
        val SamsungTvState = SamsungTv!!.isChecked
        val hisenseTvState = hisenseTv!!.isChecked
        val philipsTvState = philipsTv!!.isChecked
        preferenceEditor.putBoolean("SamsungTvState", SamsungTvState)
        preferenceEditor.putString("SamsungTvName", SamsungTv!!.text as String?)
        preferenceEditor.putBoolean("hisenseTvState", hisenseTvState)
        preferenceEditor.putString("hisenseTvName", hisenseTv!!.text as String?)
        preferenceEditor.putBoolean("philipsTvState", philipsTvState)
        preferenceEditor.putString("philipsTvName", philipsTv!!.text as String?)

        preferenceEditor.commit()
        Toast.makeText(this, "Added to checkout", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.product_type_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.m_appliances -> {
                Toast.makeText(this,"Displaying Apartments", Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,AppliancesActivity::class.java)
                startActivity(intent)
            }
            R.id.m_tvs ->{
                Toast.makeText(this,"Displaying Detached Homes",Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,TVsActivity::class.java)
                startActivity(intent)
            }
            R.id.m_computers -> {
                Toast.makeText(this,"Displaying Semi-detached Homes",Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,ComputerActivity::class.java)
                startActivity(intent)
            }
            R.id.m_furniture -> {
                Toast.makeText(this,"Displaying Condominum",Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,FurnitureActivity::class.java)
                startActivity(intent)
            }
            R.id.m_auto_accessories -> {
                Toast.makeText(this,"Displaying Town housed",Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,AutoActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}












