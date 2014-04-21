package s99.p15

object P15 {

  def duplicateN[T](times: Int, input: List[T]): List[T] = {
    require(times > 0)
    input flatMap { e => List.fill(times)(e) }
  }
}