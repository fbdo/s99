/**
 * Created by fabio on 10/07/15.
 */
object P02 {
  def lastButOneRecursive[A](ls: List[A]): A = ls match {
    case h :: a :: Nil => h
    case _ :: tail => lastButOneRecursive(tail)
    case _ => throw new NoSuchElementException
  }

}
