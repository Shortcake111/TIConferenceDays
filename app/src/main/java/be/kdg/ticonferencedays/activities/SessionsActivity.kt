package be.kdg.ticonferencedays.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import be.kdg.ticonferencedays.R
import be.kdg.ticonferencedays.adapters.SessionsAdapter
import be.kdg.ticonferencedays.model.getTestSessions
import kotlinx.android.synthetic.main.activity_sessions.*

//const val CURRENT_SESSION: String = "CURRENT_SESSION"

class SessionsActivity : AppCompatActivity() {
    private lateinit var rvSessions:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessions)

        initialiseViews()
    }

    private fun initialiseViews() {
        rvSessions = findViewById<RecyclerView>(R.id.rvSessions)
            .apply{
                layoutManager = LinearLayoutManager(this@SessionsActivity)
                adapter = SessionsAdapter(getTestSessions())
            }
    }

    /*fun onSessionSelected(position: Int) {
        val intent = Intent(this, PhotoActivity::class.java)
        intent.putExtra(CURRENT_SESSION, position)
        startActivity(intent)
    }*/
}
