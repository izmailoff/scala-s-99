package s99.p07

object P07 {

  /*
   * Type [T] also works instead of [Any]. However, it's not bounded so pretty much is Any anyway :).
   */
  def flatten(input: List[Any]): List[Any] =
    input match {
      case List() => List()
      case head :: tail =>
        head match {
          case list: List[_] => flatten(list) ::: flatten(tail)
          case elem => elem :: flatten(tail)
        }
    }
  
  /* This does not work because of static type matching. Maybe there are some clever ways to make it work.
   * It compiles, but always calls combine(Any, ...) because head appears as element of type Any.
  def combine(input: Any, remainder: List[Any]): List[Any] = input :: remainder
  def combine(input: List[Any], remainder: List[Any]): List[Any] = flattenPolymorphic(input) ::: remainder

  def flattenPolymorphic(input: List[Any]): List[Any] =
    input match {
      case List() => List()
      case head :: tail => combine(head, flatten(tail))
    }
  */
}