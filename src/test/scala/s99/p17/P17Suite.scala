package s99.p17

import org.specs2.mutable.Specification

class P17Suite extends Specification {

  "Splitting list of n+1 elements" should {
    "return 2 lists of n and 1 element respectively if splitting on n" in {
      P17.split(3, 1 :: 2 :: 3 :: 4 :: Nil) must be equalTo (1 :: 2 :: 3 :: Nil, List(4))
    }

    "throw an exception if splitting on n larger than list size" in {
      P17.split(5, 1 :: 2 :: 3 :: 4 :: Nil) must throwAn[NoSuchElementException]
    }
  }
}
