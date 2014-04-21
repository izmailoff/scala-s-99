package s99.p15

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P15._

@RunWith(classOf[JUnitRunner])
class P15Suite extends FunSuite {

  test("DuplicateN on empty list 1 times returns empty list") {
    val input = List()
    val answer = input
    assert(answer === duplicateN(1, input))
  }

  test("DuplicateN on empty list 2 times returns empty list") {
    val input = List()
    val answer = input
    assert(answer === duplicateN(2, input))
  }

  test("DuplicateN on empty list 0 times throws an exception") {
    intercept[IllegalArgumentException] {
      val input = List()
      duplicateN(0, input)
    }
  }

  test("DuplicateN on non-empty list 0 times throws an exception") {
    intercept[IllegalArgumentException] {
      val input = List(2)
      duplicateN(0, input)
    }
  }

  test("DuplicateN on empty list negative times throws an exception") {
    intercept[IllegalArgumentException] {
      val input = List()
      duplicateN(-1, input)
    }
  }

  test("DuplicateN on single element list negative times throws an exception") {
    intercept[IllegalArgumentException] {
      val input = List(7)
      duplicateN(-1, input)
    }
  }

  test("DuplicateN on non-empty list negative times throws an exception") {
    intercept[IllegalArgumentException] {
      val input = List(1, 2)
      duplicateN(-1, input)
    }
  }

  test("DuplicateN on single element list 1 time returns the same list") {
    val input = List(5)
    val answer = input
    assert(answer === duplicateN(1, input))
  }

  test("DuplicateN on single element list 2 times returns list with 2 elements") {
    val input = List(5)
    val answer = List(5, 5)
    assert(answer === duplicateN(2, input))
  }

  test("DuplicateN on single element list 3 times returns list with 3 elements") {
    val input = List(5)
    val answer = List(5, 5, 5)
    assert(answer === duplicateN(3, input))
  }

  test("DuplicateN on multiple element list times 3 returns list with duplicated elements") {
    val input = List('a', 'b', 'c', 'c', 'd')
    val answer = List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')
    assert(answer === duplicateN(3, input))
  }

  test("DuplicateN on large list does not fail with stack overflow") {
    val size = 100000
    val input = (1 to size).toList
    val result = duplicateN(2, input)
    assert(size * 2 === result.length)
    assert(input === result.distinct)
  }

}