package be.kdg.ticonferencedays.model

import be.kdg.ticonferencedays.R
import java.util.*

fun getTestSessions():Array<Session> {
    return arrayOf(
        Session("The Actor Model", GregorianCalendar(2017,2,16), R.drawable.session1),
        Session("Kotlin, a new hope", GregorianCalendar(2017,2,16), R.drawable.session2),
        Session("Docker vs virtual machines", GregorianCalendar(2017,2,16), R.drawable.session3),
        Session("Crowdfunding blockchained", GregorianCalendar(2017,2,16), R.drawable.session4),
        Session("Datascience is knowledge", GregorianCalendar(2017,2,16), R.drawable.session5),
        Session("Concurrent programming in Akka.Net", GregorianCalendar(2017,2,16), R.drawable.session6),
        Session("Vulnerabilities", GregorianCalendar(2017,2,16), R.drawable.session7),
        Session("Conversational User Interfaces", GregorianCalendar(2017,2,16), R.drawable.session8),
        Session("Communicatie tussen microservices", GregorianCalendar(2017,2,16), R.drawable.session9),
        Session("Best practice bij Big Data analytics", GregorianCalendar(2017,2,16), R.drawable.session10)
    )
}