package s99.p04

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P04._

@RunWith(classOf[JUnitRunner])
class P04Suite extends FunSuite {

  test("length of empty list returns 0") {
    assert(0 === length(List()))
  }

  test("length of 1 element list") {
    assert(1 === length(List(11111)))
  }

  test("length of large list") {
    val input = (1 to 10000).toList
    assert(input.length === length(input))
  }

  test("length of multiple string element list") {
    val input = List("abc", "def", "geh")
    assert(3 === length(input))
  }

}