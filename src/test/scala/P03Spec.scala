import org.scalatest.{FlatSpec, Matchers}


/**
 * Created by fabio on 14/06/15.
 */
class P03Spec extends FlatSpec with Matchers {
  "The Kth element method" should "return the Kth element of a list with K elements or more" in {
    val list1 = List(1, 4, 5)
    P03.nth(0, list1) should be(1)
    P03.nth(1, list1) should be(4)
    P03.nth(2, list1) should be(5)
  }

  it should "throw IllegalArgumentException if the Kth argument is less than zero" in {
    val list = List(1)
    a[NoSuchElementException] should be thrownBy {
      P03.nth(-1, list)
    }
  }

  it should "throw NoSuchElementException if an empty list is searched" in {
    val emptyList = List()
    a[NoSuchElementException] should be thrownBy {
      P03.nth(0, emptyList)
    }
  }

  it should "throw NoSuchElementException the Kth argument is larger than the size of the list" in {
    val list = List(1)
    a[NoSuchElementException] should be thrownBy {
      P03.nth(1, list)
    }
  }
}
