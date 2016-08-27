/**
  * Created by david on 14/07/16.
  */
class SeatFactory extends CarFactory[Seat] {
  def getCar(trademark: String, price: Float): Seat = new Seat(trademark, price)
}
