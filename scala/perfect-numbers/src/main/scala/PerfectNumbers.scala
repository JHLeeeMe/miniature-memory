object NumberType extends Enumeration {
  type NumberType = Value
  val Perfect, Abundant, Deficient = Value
}


object PerfectNumbers {
  import NumberType.NumberType
  def classify(number: Int): Either[String, NumberType] = {
    val a = (1 to number/2).filter(number % _ == 0).sum
    a match {
      case _ if number <= 0 => Left("Classification is only possible for natural numbers.")
      case x if x == number => Right(NumberType.Perfect)
      case x if x > number => Right(NumberType.Abundant)
      case x if x < number => Right(NumberType.Deficient)
    }
  }
}


//object NumberType extends Enumeration{
//
//  type NumberType = Value
//
//  val Deficient = Value(-1)
//  val Perfect = Value(0)
//  val Abundant = Value(1)
//
//}
//
//import NumberType._
//
//object PerfectNumbers{
//
//  def classify(n:Int):Either[String, NumberType]=
//    if (n > 0)
//      Right(NumberType(aliquot(n) compare n))
//    else
//      Left("Classification is only possible for natural numbers.")
//
//  def aliquot(n:Int):Int =
//    (1 to n/2).filter(n % _==0 ).sum
//
//}
