object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val a = for {
      f <- factors
      x <- f until limit by f
    } yield x
    a.sum
  }
}
