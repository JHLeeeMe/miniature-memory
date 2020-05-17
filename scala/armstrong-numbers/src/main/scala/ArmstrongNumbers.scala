import scala.math.pow


object ArmstrongNumbers {
  def isArmstrongNumber(num: Int): Boolean = {
    val num_arr = num.toString.map(_.asDigit)

    val result = num_arr.map { pow(_, num_arr.length) }.sum

    if (num == result) true else false
  }
}
