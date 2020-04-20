object Etl {
  def transform(data: Map[Int, Seq[String]]): Map[String, Int] =  {
    for {
      (key, seqValue) <- data
      v <- seqValue
    } yield {
      v.toLowerCase -> key
    }
  }
}

//object Etl {
//  def transform(data: Map[Int, Seq[String]]): Map[String, Int] = 
//    data.flatMap(x => x._2.map(_.toLowerCase -> x._1)).toMap
//}
