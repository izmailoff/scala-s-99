package s99.p13

object P13 {
  def encodeDirect[T](input: List[T]): List[(Int, T)] = {
    def encodeWithPrevious(remaining: List[T])(previous: Option[(Int, T)]): List[(Int, T)] =
      remaining match {
        case List() => if(previous.isEmpty) List() else List(previous.get)
        case head :: tail =>
          val nextIter = encodeWithPrevious(tail)(_)
          if (previous.isEmpty)
            nextIter(Some((1, head)))
          else if (head != previous.get._2)
            previous.get :: nextIter(Some((1, head)))
          else
            nextIter(Some((previous.get._1 + 1, head)))
      }
    encodeWithPrevious(input)(None)
  }
}