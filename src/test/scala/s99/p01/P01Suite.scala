package s99.p01

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P01._

@RunWith(classOf[JUnitRunner])
class P01Suite extends FunSuite {

  test("last element on empty list throws exception") {
    intercept[NoSuchElementException] {
      last(List())
    }
  }
  
  test("last element on single element list returns head") {
    val xs = List(999)
    assert(xs.head === last(xs))
  }
  
  test("last element on multiple element list returns last element") {
    val xs = List(999, 66, 10)
    assert(xs.last === last(xs))
  }
  
  test("last element on multiple string element list returns last element") {
    val xs = List("abc", "def", "geh")
    assert(xs.last === last(xs))
  }

}
