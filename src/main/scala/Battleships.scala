
import scala.util.control.Breaks._
object Battleships extends App {



  println("Welcome to BattleShips")
  println("Press any button to start a game")
  scala.io.StdIn.readLine()


  var playing = true
  var HitCount = 0
  var ShipsSunk = 0
  var TurnsTaken = 0



    val Grid: Array[Array[Int]] = Array.ofDim[Int](12, 12)



  println("Place your first Frigate")
  var x = scala.io.StdIn.readInt()
  var y = scala.io.StdIn.readInt()
  var Frigate = Grid(x)(y)
  var Frigate2ndHit = Grid(x)(y+1)



println("Place your second Frigate")
  var x1 = scala.io.StdIn.readInt()
  var y1 = scala.io.StdIn.readInt()
  var Frigate2 = Grid(x1)(y1)
  var Frigate22ndHit = Grid(x1)(y1+1)

  println("Place your Third Frigate")
  var x2 = scala.io.StdIn.readInt()
  var y2 = scala.io.StdIn.readInt()
  var Frigate3 = Grid(x1)(y1)
  var Frigate32ndHit = Grid(x1)(y1+1)

  println("Place your fourth Frigate")
  var x3 = scala.io.StdIn.readInt()
  var y3 = scala.io.StdIn.readInt()
  var Frigate4 = Grid(x1)(y1)
  var Frigate42ndHit = Grid(x1)(y1+1)

  println("Place your fifth Frigate")
  var x4 = scala.io.StdIn.readInt()
  var y4  = scala.io.StdIn.readInt()
  var Frigate5 = Grid(x1)(y1)
  var Frigate52ndHit = Grid(x1)(y1+1)




  while (playing) {

    println("Enter x coordinate")
    var i = scala.io.StdIn.readInt()
    println("Enter y coordinate")
    var j = scala.io.StdIn.readInt()





    if (Grid(i)(j) == Frigate) {
      println("hit")
      HitCount += 1
      TurnsTaken += 1
      println(HitCount)
      println(ShipsSunk)

      if (HitCount == 2) {
        println("Ship Sunk")
        ShipsSunk += 1
        HitCount -= 2
        if(ShipsSunk == 5) {
          playing = false
          println(s"It took you $TurnsTaken turns to sink all the ships")

        }
      }
    }
      if (Grid(i)(j) != Frigate) {
        println("miss")
        TurnsTaken += 1
      }
    }



}





