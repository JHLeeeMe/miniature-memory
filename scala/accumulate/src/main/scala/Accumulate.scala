class Accumulate {
  def accumulate[A, B](f: (A) => B, list : List[A]): List[B] = list match {
    case head +: tail => f(head) +: accumulate(f, tail)
    case Nil => Nil
  }
}

// tailrec
//class Accumulate {
//  def accumulate[A, B](f: (A) => B, list : List[A]): List[B] = {
//
//    @annotation.tailrec
//    def acc(curr: List[A], result: List[B]): List[B] = curr match {
//      case head +: tail => acc(tail, result :+ f(head))
//      case Nil => result
//    }
//
//    acc(list, Nil)
//  }
//}

// map, for-yield
//class Accumulate {
//  def accumulate[A, B](f: (A) => B, list : List[A]): List[B] = {
//    //list.map(f)
//    for (elem <- list) yield f(elem)
//  }
//}
