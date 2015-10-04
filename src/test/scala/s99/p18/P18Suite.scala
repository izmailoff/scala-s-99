package s99.p18

import org.specs2.mutable.Specification

class P18Suite extends Specification {

  "Slice of empty list" should {
    "return empty list for positive indexes" in {
      P18.slice(1, 2, Nil) must be equalTo Nil
    }

    "return empty list when both indexes are negative" in {
      P18.slice(-1, -2, Nil) must be equalTo Nil
    }

    "return empty list when 'from' is greater than 'to'" in {
      P18.slice(3, 1, Nil) must be equalTo Nil
    }

    "return empty list when 'from' is equal to 'to'" in {
      P18.slice(2, 2, Nil) must be equalTo Nil
    }
  }

  "Slice of non empty list" should {
    "return non empty sub-list if indexes are all contained within list" in {
      P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must be equalTo List('d, 'e, 'f, 'g)
    }

    "return non empty sub-list if from is negative and to is beyond list length" in {
      P18.slice(-5, 5, List(1, 2, 3)) must be equalTo List(1, 2, 3)
    }

    "return non empty sub-list if from is negative and to is within list length" in {
      P18.slice(-1, 2, List(1, 2, 3)) must be equalTo List(1, 2)
    }

    "return non empty sub-list if from is contained and to is beyond list length" in {
      P18.slice(1, 5, List(1, 2, 3)) must be equalTo List(2, 3)
    }

    "return empty list when both indexes are negative" in {
      P18.slice(-1, -2, List(1, 2, 3)) must be equalTo Nil
    }

    "return empty list when 'from' is greater than 'to'" in {
      P18.slice(3, 1, List(1, 2, 3)) must be equalTo Nil
    }

    "return empty list when 'from' is equal to 'to'" in {
      P18.slice(2, 2, List(1, 2, 3)) must be equalTo Nil
    }
  }

}
