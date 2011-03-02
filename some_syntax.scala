class SomeSyntax {
  def someMethod: SomeSyntax = {
    println("some method from some syntax")
    this
  }
  def yetAnotherMethod: SomeSyntax = {
    println("some method from even more syntax")
    this
  }
  def otherMethod: SomeSyntax = {
    println("some method from more syntax")
    this
  }
}

val someSyntax = new SomeSyntax

someSyntax someMethod otherMethod yetAnotherMethod




