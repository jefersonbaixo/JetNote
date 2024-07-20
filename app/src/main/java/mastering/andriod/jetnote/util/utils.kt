package mastering.andriod.jetnote.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun formatDate(time: Long): String = SimpleDateFormat(
    "EEE, d MMM hh:mm aaa", Locale.getDefault()
).format(Date(time))
