package ExercisesDay2

object FizzBuzz extends App {
  def FizzyBuzz(word: String, word2: String, num: Int): String = {
var i = 0
var Output = ""
    var Output2 = ""


      if (num % 3 == 0) {
        Output += word
      }
      if (num % 5 == 0) {
        Output += word2
      }
      if (num % 3 != 0 && i % 5 != 0) {
        Output += num

      }

println(Output)
    Output




  }


  FizzyBuzz("Fizz", "Buzz", 15)
}