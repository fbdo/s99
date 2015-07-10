import org.scalatest.{FlatSpec, Matchers}


/**
 * Created by fabio on 14/06/15.
 */
class P02Spec extends FlatSpec with Matchers {
  "The last but one method" should "return the last-1 element of a list with more than 1 element" in {
    val list1 = List(4, 5)
    P02.lastButOneRecursive(list1) should be(4)

    val list2 = List(1, 2, 3)
    P02.lastButOneRecursive(list2) should be(2)
  }

  it should "throw NoSuchElementException if an list with one element is searched" in {
    val list = List(1)
    a[NoSuchElementException] should be thrownBy {
      P02.lastButOneRecursive(list)
    }
  }

  it should "throw NoSuchElementException if an empty list is searched" in {
    val emptyList = List()
    a[NoSuchElementException] should be thrownBy {
      P02.lastButOneRecursive(emptyList)
    }
  }
}
