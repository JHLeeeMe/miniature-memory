object CollatzConjecture {
  def steps(n: Int, cnt: Int = 0): Option[Int] = n match {
    case x if (x < 1) => None
    case x if (x % 2 == 0) => steps(x/2, cnt+1)
    case 1 => Some(cnt)
    case _ => steps(3*n+1, cnt+1)
  }
}

//object CollatzConjecture {
//  def steps(n: Int): Option[Int] = {
//    if (n < 1) None else Some(cnt(n))
//  }
//
//  @annotation.tailrec
//  def cnt(x: Int, result: Int = 0): Int = x match {
//    case x if (x % 2 == 0) => cnt(x/2, result+1)
//    case 1 => result
//    case _ => cnt(3*x+1, result+1)
//  }
//}
