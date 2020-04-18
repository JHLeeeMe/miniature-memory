object Hamming {
  def distance(x: String, y: String): Option[Int] = {
    if (x.length == y.length) Some(x.zip(y).count(e => e._1 != e._2))
    else None
  }

}
