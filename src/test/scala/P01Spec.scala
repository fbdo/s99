import java.util
import java.util.EmptyStackException

import org.scalatest.{Matchers, FlatSpec}


/**
 * Created by fabio on 14/06/15.
 */
class P01Spec extends FlatSpec with Matchers {
  "The last method" should "return the last element of a non-empty list" in {
    val list = List(1)
    P01.lastRecursive(list) should be (1)
    val list2 = List(1, 2, 3)
    P01.lastRecursive(list2) should be (3)
  }

  it should "throw NoSuchElementException if an empty list is searched" in {
    val emptyList = List()
    a [NoSuchElementException] should be thrownBy {
      P01.lastRecursive(emptyList)
    }
  }
}
