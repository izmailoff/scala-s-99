package s99.p03

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P03._

@RunWith(classOf[JUnitRunner])
class P03Suite extends FunSuite {

  test("0 nth element on empty list throws exception") {
    intercept[NoSuchElementException] {
      nth(0, List())
    }
  }

  test("1 nth element on empty list throws exception") {
    intercept[NoSuchElementException] {
      nth(1, List())
    }
  }
  
  test("out of bounds negative nth element on a list throws exception") {
    intercept[NoSuchElementException] {
      nth(-1, List(1, 2, 3))
    }
  }
  
  test("out of bounds non-negative nth element on a list throws exception") {
    intercept[NoSuchElementException] {
      nth(10, List(1, 2, 3))
    }
  }

  test("nth on multiple element list returns proper element") {
    val xs = List(999, 66, 10)
    assert(66 === nth(1, xs))
  }

  test("nth element on multiple string element list returns proper element") {
    val xs = List("abc", "def", "geh")
    assert("geh" === nth(2, xs))
  }

}
