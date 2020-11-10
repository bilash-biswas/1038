object Main {
  def main(args:Array[String]){
    var Array(x,y) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    x match
    {
    case 1 => {var A = 4.00 * y
              println("Total: R$ %.2f".format(A))
             }
    case 2 =>{
        var B = 4.50 * y
        println("Total: R$ %.2f".format(B))}
    case 3 =>{
         var C = 5.00 * y
        println("Total: R$ %.2f".format(C))}
    case 4 =>{
         var D = 2.00 * y
        println("Total: R$ %.2f".format(D))}
    case 5 =>{
         var E = 1.50 * y
        println("Total: R$ %.2f".format(E))}
    }
  }
}
