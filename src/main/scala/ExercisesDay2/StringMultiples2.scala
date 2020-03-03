package ExercisesDay2

object StringMultiples2 extends App {
def StringMultiply(word:String, num:Int): Unit = {

var i = num
  while(i > 0) {

    println(word * num)
    i -=1
  }


}


StringMultiply("hello", 5)

}
