object FlattenArray {
  def flatten(x: List[Any]): List[Any] = {
    x.filter(_ != null)
      .flatMap {
        case list: List[Any] => flatten(list)
        case elem => List(elem)
      }
  }
}
