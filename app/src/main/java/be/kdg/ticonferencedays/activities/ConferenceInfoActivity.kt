package be.kdg.ticonferencedays.activities

import android.content.Intent
import android.os.Bundle
import android.se.omapi.Session
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import be.kdg.ticonferencedays.R

class ConferenceInfoActivity : AppCompatActivity() {
    private lateinit var lvChoices:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conference_info)

        initialiseViews()
        addEventHandlers()
    }

    private fun initialiseViews(){
        lvChoices = findViewById(R.id.lvChoices)
        lvChoices.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, resources.getStringArray(R.array.choices))
    }

    private fun addEventHandlers(){
        lvChoices.setOnItemClickListener { parent, view, pos, id ->
            if (pos == 0){
                startActivity(Intent(applicationContext, SessionsActivity::class.java))
            }
        }
    }
}
