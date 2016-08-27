/**
  * Created by david on 14/07/16.
  */

import org.scalatest.{Matchers, WordSpec}

class CarSpec extends WordSpec with Matchers {
  "Get a new Audi" when {
    "return a new Audi" in {
      val mark: String = "Audi"
      val price: Float = 12000
      val audi = new Audi(mark, price)
      assert(audi.toString.equals(mark + "|" + price))
    }
  }

  "Get a new Seat" when {
    "return a new Seat" in {
      val mark: String = "Seat"
      val price: Float = 9000
      val seat = new Seat(mark, price)
      assert(seat.toString.equals(mark + "|" + price))
    }
  }

  "Request a Factory to get Car" when {
    "get a new Car" in {
      val mark: String = "Seat"
      val price: Float = 9000
      val factory = new SeatFactory
      val seat = factory.getCar(mark, price)

      assert(seat.toString.equals(mark + "|" + price))
      assert(seat.isInstanceOf[Seat])
    }
  }
}
