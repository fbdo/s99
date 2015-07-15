/**
 * Created by fabio on 10/07/15.
 */
object P03 {
  def nth[A](i: Int, ls: List[A]): A = (i, ls) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

}
