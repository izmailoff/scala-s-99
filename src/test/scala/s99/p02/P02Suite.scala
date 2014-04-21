package s99.p02

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P02._

@RunWith(classOf[JUnitRunner])
class P02Suite extends FunSuite {

  test("penultimate element on empty list throws exception") {
    intercept[NoSuchElementException] {
      penultimate(List())
    }
  }

  test("penultimate element on single element throws exception") {
    intercept[NoSuchElementException] {
      penultimate(List(999))
    }
  }

  test("penultimate on multiple element list returns next to last element") {
    val xs = List(999, 66, 10)
    assert(66 === penultimate(xs))
  }

  test("penultimate element on multiple string element list returns next to last element") {
    val xs = List("abc", "def", "geh")
    assert("def" === penultimate(xs))
  }

}
