/**
  * Created by david on 14/07/16.
  */
class AudiFactory extends CarFactory[Audi] {
  def getCar(trademark: String, price: Float): Audi = new Audi(trademark, price)
}
