object options {
  val someValue: Option[String] = Some("I am wrapped in something")
  assert(someValue.equals(Some("I am wrapped in something")))

  val emptyValue: Option[String] = None
  assert(emptyValue.equals(None))



  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    if (flag) Some("Found value") else None
  }

  val value1 = maybeItWillReturnSomething(true)
  val value2 = maybeItWillReturnSomething(false)

  assert(value1.getOrElse("No value").equals("Found value"))
  assert(value2.getOrElse("No value").equals("No value"))
  assert(value2.getOrElse("default function").equals("default function"))



  val number: Option[Int] = Some(3)
  val noNumber: Option[Int] = None
  val result1 = number.map(_ * 1.5)
  val result2 = noNumber.map(_ * 1.5)

  assert(result1 == Some(4.5))
  assert(result2.equals(None))



  object Greeting {
    def english = "Hi"
    def espanol = "Hola"
    def deutsch = "Hallo"
    def magyar = "Szia"
  }

  val x = Greeting
  val y = x

  assert(x.eq(y))

  val z = Greeting

  assert(x.eq(z))



  def addWithoutSyntaxSugar(x: Int) = {
    new Function1[Int, Int]() {
      def apply(y: Int): Int = x + y
    }
  }

  assert(addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]].equals(true))
  assert(addWithoutSyntaxSugar(2)(3).equals(5))

  def fiveAdder = addWithoutSyntaxSugar(5)
  assert(fiveAdder(5).equals(10))


  val f = new Function[Int, Int] {
    def apply(x: Int) = x * x
  }

  f.apply(7)

}