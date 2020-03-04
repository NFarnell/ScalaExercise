package ExercisesDay2
import scala.util.control.Breaks._

object Object extends App {
  def Hangman(Word:String): Unit = {
    var letters = ""


    val count = 0
    val correctcount = 0

    var word = ""
    println("Guess a Letter")
    for (i <- 1 to Word.length) {
      word += "_ "
    }
    println(word)
    for (count <- 1 to  12){
      var input = scala.io.StdIn.readLine()
      if (Word.contains(input)) {
        word == "_ " * (Word.length)
        correctcount + 1

        letters += "," + input
        println(word)
        println("Correct letters:" + letters)
        if (correctcount == Word.length){
          println("You win!")
      }

     if (!Word.contains((input))) {
        count + 1
      }
      if (count == 12) {
        println("You suck at hangman")
        break;
      }


      }


    }

  }






  Hangman("ubuntu")

}
