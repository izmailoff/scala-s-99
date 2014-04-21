package s99.p11

object P11 {
  def encodeModified[T](input: List[T]): List[Any] = {
    import s99.p10._
    P10.encode(input) map { case (1, char) => char; case other => other }
  }
}