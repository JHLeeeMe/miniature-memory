import scala.collection.mutable
import scala.util.control.Breaks

object Sieve {
  def primes(num: Int): List[Int] = {
    val result = new mutable.ListBuffer[Int]()
    val loop = new Breaks

    if (num==1) Nil
    else if (num==2) List(2)
    else {
      for (i <- 3 to num) {
        var isPrime = true

        loop.breakable {
          for {
            j <- 2 until i
            if i % j == 0
          } { isPrime = false; loop.break }
        }

        if (isPrime) result += i
      }

      2 +: result.toList
    }
  }
}
