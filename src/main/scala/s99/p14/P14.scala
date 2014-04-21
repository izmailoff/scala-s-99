package s99.p14

object P14 {

  def duplicate[T](input: List[T]): List[T] =
    input flatMap { e => e :: e :: List() }

}