import scala.collection.immutable.SortedMap

class School {
  type DB = Map[Int, Seq[String]]
  private var _data = Map[Int, Seq[String]]().withDefaultValue(Seq())

  def add(name: String, g: Int): Unit = {
    _data += g -> (grade(g) :+ name)
  }
  def db: DB = _data

  def grade(g: Int): Seq[String] = _data(g)

  def sorted: DB = {
    (SortedMap[Int, Seq[String]]() ++ _data.mapValues(_.sorted)).toMap
  }
}

