package s99.p16

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P16._

/**
 * I decided not to have checks for drop(n, list) assert n <= list.length
 * because this is similar to filtering and should always succeed.
 * In this case client expects filtering to be applied and some or no reduction
 * to happen.
 * Unlike that P15 has duplicate function that creates stuff which client
 * expects to be created, and thus has to be called with correct N and list.
 * Throwing exception in P15 guarantees that client gets what he expects or gets an
 * exception, never wrong/unexpected result.
 */
@RunWith(classOf[JUnitRunner])
class P16Suite extends FunSuite {

  test("Drop on empty list throws exception for N=0 because it makes sense to drop N>=1") {
    intercept[IllegalArgumentException] {
      val input = List()
      drop(0, input)
    }
  }

  /*
   * We could interpret negative index as starting from last element, but for now we don't.
   */
  test("Drop on empty list throws exception for negative N because it makes sense to drop N >= 1") {
    intercept[IllegalArgumentException] {
      val input = List()
      drop(-1, input)
    }
  }
  
  test("Drop on non-empty list throws exception for N=0 because it makes sense to drop N >= 1") {
    intercept[IllegalArgumentException] {
      val input = List(1, 2, 3)
      drop(0, input)
    }
  }
  
  test("Drop on non-empty list throws exception for negative N because it makes sense to drop N >= 1") {
    intercept[IllegalArgumentException] {
      val input = List(1, 2, 3)
      drop(-1, input)
    }
  }

  test("Drop on empty list with any N > 0 returns empty list") {
    val input = List()
    val answer = input
    assert(answer === drop(3, input))
  }
  
  test("Drop with N > list.length returns the same list") {
    val input = List(1, 2, 3)
    val answer = input
    assert(answer === drop(4, input))
  }
  
  test("Drop with N == list.length returns list without last element") {
    val input = List(9, 8, 7)
    val answer = List(9, 8)
    assert(answer === drop(3, input))
  }
  
  test("Drop with N < list.length removes appropriate elements") {
    val input = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val answer = List('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')
    assert(answer === drop(3, input))
  }

}