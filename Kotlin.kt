import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var X = read.nextInt()
    var Y = read.nextInt()
    var A:Double;
    var B:Double;
    var C:Double;
    var D:Double;
    var E:Double;
    when(X){
        1 ->{A = 4.00 * Y
            println("Total: R$ %.2f".format(A))}
        2 ->{B = 4.50 * Y
            println("Total: R$ %.2f".format(B))}
        3 ->{C = 5.00 * Y;
            println("Total: R$ %.2f".format(C))}
        4 ->{D = 2.00 * Y
            println("Total: R$ %.2f".format(D))}
        5 ->{E = 1.50 * Y;
            println("Total: R$ %.2f".format(E))}
    }
}
