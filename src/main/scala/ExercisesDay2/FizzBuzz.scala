package ExercisesDay2

object FizzBuzz extends App {
  def FizzyBuzz(word: String, word2: String, num: Int): Unit = {
var i = 0
var Output = ""
    var Output2 = ""
    for(i <- 1 to  num) {


      if (i % 3 == 0) {
        Output += word + ","
      }
      if (i % 5 == 0) {
        Output += word2 + ","
      }
      if (i % 3 != 0 && i % 5 != 0) {
        Output += i+","

      }

    }


    println(Output)


  }


  FizzyBuzz("Fizz", "Buzz", 15)
}