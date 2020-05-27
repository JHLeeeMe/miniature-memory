object Isogram {
  def isIsogram(str: String): Boolean = {
    val regex = "[^a-z]"
    val refinedStr = str.toLowerCase().replaceAll(regex, "")

    refinedStr.length == refinedStr.toSet.size
  }
}
