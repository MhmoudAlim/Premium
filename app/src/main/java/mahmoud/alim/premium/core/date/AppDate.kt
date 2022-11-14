package mahmoud.alim.premium.core.date

import org.threeten.bp.Duration
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

/**
 * @author Mahmoud Alim on 13/11/2022.
 */
object AppDateTime {
    enum class Format(val value: String) {
        UTC("yyyy-MM-dd'T'HH:mm:ss'Z'"),
        DD_MM_YYYY("dd-MM-yyyy"),
        YYYY_MM_DD("yyyy-MM-dd"),
        HH_MM("hh:mm");
    }

    fun formatDate(
        dateTime: String,
        format: Format = Format.UTC
    ): String {
        val date = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern(format.value))
        return date.format(DateTimeFormatter.ofPattern(Format.DD_MM_YYYY.value))
    }

    fun formatTime(
        dateTime: String,
        format: Format = Format.UTC,
    ): String {
        val date = LocalDateTime.parse(
            dateTime,
            DateTimeFormatter.ofPattern(format.value)
        )

        return date.format(DateTimeFormatter.ofPattern(Format.HH_MM.value))
    }


    fun durationInDaysOf(
        date: String
    ): Boolean {
        val now = LocalDate.parse(
            LocalDate.now().format(DateTimeFormatter.ofPattern(Format.YYYY_MM_DD.value))
        )
        val localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(Format.DD_MM_YYYY.value))
        val durationDiff =
            Duration.between(now.atStartOfDay(), localDate.atStartOfDay()).toDays()

        return durationDiff >= 0
    }


}