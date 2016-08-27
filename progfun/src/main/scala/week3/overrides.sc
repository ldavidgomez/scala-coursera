package week3

import scala.annotation.tailrec

object  overrides {
  abstract class Base {
    def foo = 1
    def bar: Int
  }
  class Sub extends Base {
    override def foo = 2
    def bar = 3
  }
  @tailrec
  def recursiveTest(x: Int): Int = {
    println(x)
    if (x < 1) 0
    else recursiveTest (x-1)
  }
//  recursiveTest(10
  class Person(val name: String, val age: Int){
    override def toString ={
      this.name + " " + this.age
    }
  }
  val person1: Person = new Person("A",10)
  val person2: Person = new Person("B",22)
  val person3: Person = new Person("C",2)
  val person4: Person = new Person("D",33)
  val people: Array[Person] = Array(person1, person2, person3, person4)
  val (minor, adults) = people partition(_.age < 18)

//  println(people.length)
//  println(minor.length)
//  println(adults.length)
  minor.map(x => println(x.name + " " + x.age))
  adults.map(x => println(x.name + " " + x.age))

 // println(minor.mkString(" "))
}