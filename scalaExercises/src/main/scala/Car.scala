/**
  * Created by david on 14/07/16.
  */
abstract class Car extends Vehicle {
  val trademark: String
  val price: Float

  var isStarted: Boolean = false

  def startEngine() = { isStarted = true }
  def stopEngine() = { isStarted = false }

  override def toString(): String = { trademark + "|" + price }
}
