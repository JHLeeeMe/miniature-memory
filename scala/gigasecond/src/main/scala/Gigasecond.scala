import java.time.LocalDate
import java.time.LocalDateTime

object Gigasecond {

  val gigaSecond = 1000000000
  lazy val daysAndTime: List[Int] = calc(gigaSecond)

  def add(startDate: LocalDate): LocalDateTime = {
    val date = startDate.plusDays(daysAndTime(0))
    date.atTime(daysAndTime(1), daysAndTime(2), daysAndTime(3))
  }

  def add(startDateTime: LocalDateTime): LocalDateTime = {
    startDateTime.plusSeconds(gigaSecond)
  }

  def calc(x: Int): List[Int] = {
    val day = x / (60 * 60 * 24)
    val hour = (x - (day * 60 * 60 * 24)) / (60 * 60)
    val min = (x - (day * 60 * 60 * 24) - (hour * 60 * 60)) / 60
    val sec = x % 60
    List(day, hour, min, sec)
  }
}
