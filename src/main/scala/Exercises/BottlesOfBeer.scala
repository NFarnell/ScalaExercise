package Exercises

object BottlesOfBeer extends App {
  def BottlesOfBeer(bottles: Int): Unit = {
    var i = bottles
    while (i > 0) {
      var j = i-1
      println(s"There's $i bottles of beer on the wall, $i bottles of beer on the wall, You take one down pass it around $j bottles of beer on the wall")

    i -= 1
    }
    println("You're out of beer, sainsburys time")

  }
  BottlesOfBeer(100)
}