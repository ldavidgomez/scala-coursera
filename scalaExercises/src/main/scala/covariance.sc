trait Function1[-T, +U] {
  def apply(x: T): U
}



abstract class CarFactory[T >: Car] {
  def apply(x: Int) : Int
  def getCar(mark: String, price: Float) : Car
}



class AudiFactory extends CarFactory[Audi] {

  def apply(x: Int): Int = x
  def getCar(mark: String, price: Float): Car = new Audi("A", 2)

}
//class Seat[T, U] extends CarFactory[T, Seat] {
//  def apply(x: T): Car = new Seat
//}
//class D extends B {}
//
//class E extends C {}
//
//class F {}


object test {
  val b: AudiFactory = new AudiFactory

//  val c: Car = new Seat
//  val d: A = new D
//  val e: E = new E
//  val f: F = new F


}