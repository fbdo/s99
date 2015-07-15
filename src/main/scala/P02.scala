object P02 {
  def penultimate[A](ls: List[A]): A = ls match {
    case h :: a :: Nil => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

}
