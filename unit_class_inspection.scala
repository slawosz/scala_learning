class Inspection {
  def inspect: Unit = {
    return "aaa"
  }
}

println((new Inspection).inspect)
