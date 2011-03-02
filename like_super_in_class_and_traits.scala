trait Nice {
  override def greet_string() : String = "nice hellow!"
  def greet() = println(greet_string)
}

class Person(val name:String) {
  def greet_string() : String = "gentle hellow"
}

class Character(override val name:String) extends Person(name) with Nice

val flanders = new Character("Ned" )
flanders.greet

