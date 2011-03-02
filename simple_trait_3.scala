trait Nice extends Person {
  override def greet() {
    super.greet
    println("Howdily doodily." )
  }
}

class Person {
  def greet() = println("Hello")
}

class BetterPerson(val name:String) extends Person with Nice {
  override def greet() {
    super.greet
    println("Foo Bar!")
  }
}

val flanders = new BetterPerson("Ned")
flanders.greet
