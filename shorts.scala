// form:http://jim-mcbeath.blogspot.com/2009/08/scala-class-linearization.html
// If a class or trait is declared to extend a trait directly rather than extending a class with that trait,
// that declaration is treated the same as if it explicitly extended the trait's superclass with the trait

// first 
trait First extends Pre

class Second extends First

// rather then

class Third extends Second2 with First

// this is similar to first


class Second extends Pre with First

