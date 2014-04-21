package s99.p01

object P01Option {
  def last[T](xs: List[T]): Option[T] =
    xs match {
      case List() => None
      case x :: List() => Some(x)
      case _ :: t => last(t)
    }
}

