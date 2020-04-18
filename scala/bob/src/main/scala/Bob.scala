object Bob {
  def response(statement: String): String = statement.trim match {
    case s if s.isEmpty => "Fine. Be that way!"
    case s if isShouting(s) && isAsking(s) => "Calm down, I know what I'm doing!"
    case s if isShouting(s) => "Whoa, chill out!"
    case s if isAsking(s) => "Sure."
    case _ => "Whatever."
  }

  def isShouting(statement: String): Boolean = statement.toUpperCase == statement && hasLetters(statement)
  def isAsking(statement: String): Boolean = statement.takeRight(1) == "?"
  def hasLetters(statement: String): Boolean = statement.exists((('a' to 'z') ++ ('A' to 'Z')).toSet.contains(_))
}
