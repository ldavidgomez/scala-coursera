/**
  * Created by david on 14/07/16.
  */
abstract class CarFactory[T <: Car] {
  def getCar(trademark: String, price: Float): T
}
