package be.kdg.ticonferencedays.model

import java.util.*

data class Session(
    val title: String,
    val date: GregorianCalendar,
    val imageId: Int
)