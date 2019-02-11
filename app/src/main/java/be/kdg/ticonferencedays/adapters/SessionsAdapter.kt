package be.kdg.ticonferencedays.adapters

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import be.kdg.ticonferencedays.model.Session
import be.kdg.ticonferencedays.model.getTestSessions
import kotlinx.android.synthetic.main.session_list_item.view.*
import java.text.SimpleDateFormat
import java.util.*

private val dateformatter = SimpleDateFormat("dd/MM/yyyy", Locale.US)

class SessionsAdapter(private val sessions:Array<Session>/*, private val sessionSelectionListener: SessionSelectionListener*/) : Adapter<SessionsAdapter.SessionViewHolder>() {

    class SessionViewHolder(view: View): RecyclerView.ViewHolder(view){
        val ivImg:ImageView = view.picImageView
        val tvTitle:TextView = view.titleTextView
        val tvDate:TextView = view.dateTextView

        init {
            Log.i("Info", "Viewholder created")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionViewHolder {
        val sessionView = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return SessionViewHolder(sessionView)
    }

    override fun getItemCount() = getTestSessions().size

    override fun onBindViewHolder(sessionViewHolder: SessionViewHolder, pos: Int) {
        val currentSession:Session = getTestSessions()[pos]
        sessionViewHolder.ivImg.setImageDrawable(sessionViewHolder.itemView.context.getDrawable(currentSession.imageId))
        sessionViewHolder.tvTitle.text = currentSession.title
        sessionViewHolder.tvDate.text = dateformatter.format(currentSession.date.time)

        /*sessionViewHolder.itemView.setOnClickListener {
            sessionSelectionListener.onSessionSelected(pos)
        }*/
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    /*interface SessionSelectionListener {
        fun onSessionSelected(position: Int)
    }*/
}