package ExercisesDay2

object FizzBuzz extends App {
  def FizzyBuzz(word: String, word2: String, num: Int): Unit = {
var i = 0
var Output = ""
    while(i < num)
      i +=1
      if(i % 3 == 0){
        Output += word
      }
      if(i % 5 == 0){
        Output += word2
      }

    println(Output)

  }


  FizzyBuzz("Fizz", "Buzz", 5)
}