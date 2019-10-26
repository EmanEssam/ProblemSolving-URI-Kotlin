import java.util.*
import kotlin.math.ceil
import kotlin.math.sqrt

fun main() {

    //1038
    val scn = Scanner(System.`in`)
    val a = scn.nextInt()
    val b = scn.nextInt()


    when (a) {
        1 -> {
            val x = String.format("%.2f", b * 4.00)
            println("Total: R\$ $x")
        }
        2 -> {
            val x = String.format("%.2f", b * 4.50)
            println("Total: R\$ $x")
        }
        3 -> {
            val x = String.format("%.2f", b * 5.00)
            println("Total: R\$ $x")
        }
        4 -> {
            val x = String.format("%.2f", b * 2.00)
            println("Total: R\$ $x")
        }
        5 -> {
            val x = String.format("%.2f", b * 1.50)
            println("Total: R\$ $x")
        }
    }

    //1037
//    val scn = Scanner(System.`in`)
//    val a = scn.nextFloat()
//
//    if (a in 0.0..100.0) {
//
//        if (a <= 25) {
//            println("Intervalo [0,25]")
//        } else if (a > 25 && a <= 50) {
//            println("Intervalo (25,50]")
//        } else if (a > 50 && a <= 75) {
//            println("Intervalo (50,75]")
//
//        } else if (a > 75 && a <= 100) {
//
//            println("Intervalo (75,100]")
//        }
//
//    } else {
//        println("Fora de intervalo")
//    }


    //1036
//    val scn = Scanner(System.`in`)
//    val a = scn.nextDouble()
//    val b = scn.nextDouble()
//    val c = scn.nextDouble()
//    val d = (b * b) - 4 * a * c
//    if (a != 0.0 && d > 0) {
//        val r1 = String.format("%.5f", (-b + sqrt(d)) / (2 * a))
//        val r2 = String.format("%.5f", (-b - sqrt(d)) / (2 * a))
//        println("R1 = $r1")
//        println("R2 = $r2")
//    } else {
//        println("Impossivel calcular")
//    }

//1013
//    val scn = Scanner(System.`in`)
//    val a = scn.nextInt()
//    val b = scn.nextInt()
//    val c = scn.nextInt()
//    val d = scn.nextInt()
//    if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
//        println("Valores aceitos")
//    } else {
//        println("Valores nao aceitos")
//    }


    //1012
// wrong answer 5%
//    val scn = Scanner(System.`in`)
//    val a = scn.nextFloat()
//    val x = (a / 100)
//    println("NOTAS:")
//    println("${x.toInt()} nota(s) de R\$ 100.00")
//    var b = a % 100
//    b /= 50
//    println("${b.toInt()} nota(s) de R\$ 50.00")
//    var c = (a % 100) % 50
//    c /= 20
//    println("${c.toInt()} nota(s) de R\$ 20.00")
//    var d = ((a % 100) % 50) % 20
//    d /= 10
//    println("${d.toInt()} nota(s) de R\$ 10.00")
//    var e = (((a % 100) % 50) % 20) % 10
//    e /= 5
//    println("${e.toInt()} nota(s) de R\$ 5.00")
//    var f = ((((a % 100) % 50) % 20) % 10) % 5
//    f /= 2
//    println("${f.toInt()} nota(s) de R\$ 2.00")
//    println("MOEDAS:")
//    var r = (((((a % 100) % 50) % 20) % 10) % 5) % 2
//    r /= 1
//    println("${r.toInt()} moeda(s) de R\$ 1.00")
//    var s = ((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00
//    s /= 0.50
//    println("${s.toInt()} moeda(s) de R\$ 0.50")
//    var j = (((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00) % 0.50
//    j /= 0.25
//    println("${j.toInt()} moeda(s) de R\$ 0.25")
//    var k = ((((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00) % 0.50) % 0.25
//    k /= 0.10
//    println("${k.toInt()} moeda(s) de R\$ 0.10")
//    var l = (((((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00) % 0.50) % 0.25) % 0.10
//    l /= 0.05
//    println("${l.toInt()} moeda(s) de R\$ 0.05")
//    var m = ((((((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00) % 0.50) % 0.25) % 0.10) % 0.05
//    m /= 0.01
//    println("${ceil(m).toInt()} moeda(s) de R\$ 0.01")

    //1011
//    val radius = readLine()!!.toInt()
//    val x = String.format("%.3f", (4 / 3.0) * 3.14159 * radius * radius * radius)
//    println("VOLUME = $x")

//1010
//    val number1: Int
//    val number2: Int
//    val unit1: Int
//    val unit2: Int
//
//    val price1: Double
//    val price2: Double
//    val scn = Scanner(System.`in`)
//
//    number1 = scn.nextInt()
//
//    unit1 = scn.nextInt()
//
//    price1 = scn.nextDouble()
//
//    number2 = scn.nextInt()
//
//    unit2 = scn.nextInt()
//    price2 = scn.nextDouble()
//    val x = String.format("%.2f", unit1 * price1 + unit2 * price2)
//
//    println("VALOR A PAGAR: R\$ $x")

    //1009
//    val name = readLine()
//    val salary = readLine()!!.toDouble()
//    val total = readLine()!!.toDouble()
//    val x = String.format("%.2f", salary + (total * 0.15))
//    println("TOTAL = R\$ $x")


    //1008
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toDouble()
//    val x = String.format("%.2f", b * c)
//    println("NUMBER = $a")
//    println("SALARY = U\$ $x")
    //1007
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//    val d= readLine()!!.toInt()
//    val x = (a*b)-(c*d)
//    println("DIFERENCA = $x")
//    //1006
//    val a = readLine()!!.toDouble()
//    val b = readLine()!!.toDouble()
//    val c = readLine()!!.toDouble()
//    val x = String.format("%.1f", ((a *2)+(b*3)+(c*5))/ (2+3+5))
//    println("MEDIA = $x")

//    //1005
//    val a = readLine()!!.toDouble()
//    val b = readLine()!!.toDouble()
//    val x = String.format("%.5f", ((a *3.5)+(b*7.5))/ (3.5 + 7.5))
//    println("MEDIA = $x")


//1004
//    var PROD = 1
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    PROD = a * b
//    println("PROD = $PROD")
//1003
//    var SOMA = 0
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    SOMA = a + b
//    println("SOMA = $SOMA")
//    val n = 3.14159
//    val r = readLine()!!.toDouble()
//    val x = String.format("%.4f", n * (r * r))
//    println("A=$x")

    //1037
//    val scn = Scanner(System.`in`)
//    val a = scn.nextFloat()
//
//    if (a in 0.0..100.0) {
//
//        if (a <= 25) {
//            println("Intervalo [0,25]")
//        } else if (a > 25 && a <= 50) {
//            println("Intervalo (25,50]")
//        } else if (a > 50 && a <= 75) {
//            println("Intervalo (50,75]")
//
//        } else if (a > 75 && a <= 100) {
//
//            println("Intervalo (75,100]")
//        }
//
//    } else {
//        println("Fora de intervalo")
//    }


    //1036
//    val scn = Scanner(System.`in`)
//    val a = scn.nextDouble()
//    val b = scn.nextDouble()
//    val c = scn.nextDouble()
//    val d = (b * b) - 4 * a * c
//    if (a != 0.0 && d > 0) {
//        val r1 = String.format("%.5f", (-b + sqrt(d)) / (2 * a))
//        val r2 = String.format("%.5f", (-b - sqrt(d)) / (2 * a))
//        println("R1 = $r1")
//        println("R2 = $r2")
//    } else {
//        println("Impossivel calcular")
//    }

//1013
//    val scn = Scanner(System.`in`)
//    val a = scn.nextInt()
//    val b = scn.nextInt()
//    val c = scn.nextInt()
//    val d = scn.nextInt()
//    if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
//        println("Valores aceitos")
//    } else {
//        println("Valores nao aceitos")
//    }


    //1012
// wrong answer 5%
//    val scn = Scanner(System.`in`)
//    val a = scn.nextFloat()
//    val x = (a / 100)
//    println("NOTAS:")
//    println("${x.toInt()} nota(s) de R\$ 100.00")
//    var b = a % 100
//    b /= 50
//    println("${b.toInt()} nota(s) de R\$ 50.00")
//    var c = (a % 100) % 50
//    c /= 20
//    println("${c.toInt()} nota(s) de R\$ 20.00")
//    var d = ((a % 100) % 50) % 20
//    d /= 10
//    println("${d.toInt()} nota(s) de R\$ 10.00")
//    var e = (((a % 100) % 50) % 20) % 10
//    e /= 5
//    println("${e.toInt()} nota(s) de R\$ 5.00")
//    var f = ((((a % 100) % 50) % 20) % 10) % 5
//    f /= 2
//    println("${f.toInt()} nota(s) de R\$ 2.00")
//    println("MOEDAS:")
//    var r = (((((a % 100) % 50) % 20) % 10) % 5) % 2
//    r /= 1
//    println("${r.toInt()} moeda(s) de R\$ 1.00")
//    var s = ((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00
//    s /= 0.50
//    println("${s.toInt()} moeda(s) de R\$ 0.50")
//    var j = (((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00) % 0.50
//    j /= 0.25
//    println("${j.toInt()} moeda(s) de R\$ 0.25")
//    var k = ((((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00) % 0.50) % 0.25
//    k /= 0.10
//    println("${k.toInt()} moeda(s) de R\$ 0.10")
//    var l = (((((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00) % 0.50) % 0.25) % 0.10
//    l /= 0.05
//    println("${l.toInt()} moeda(s) de R\$ 0.05")
//    var m = ((((((((((a % 100) % 50) % 20) % 10) % 5) % 2) % 1.00) % 0.50) % 0.25) % 0.10) % 0.05
//    m /= 0.01
//    println("${ceil(m).toInt()} moeda(s) de R\$ 0.01")

    //1011
//    val radius = readLine()!!.toInt()
//    val x = String.format("%.3f", (4 / 3.0) * 3.14159 * radius * radius * radius)
//    println("VOLUME = $x")

//1010
//    val number1: Int
//    val number2: Int
//    val unit1: Int
//    val unit2: Int
//
//    val price1: Double
//    val price2: Double
//    val scn = Scanner(System.`in`)
//
//    number1 = scn.nextInt()
//
//    unit1 = scn.nextInt()
//
//    price1 = scn.nextDouble()
//
//    number2 = scn.nextInt()
//
//    unit2 = scn.nextInt()
//    price2 = scn.nextDouble()
//    val x = String.format("%.2f", unit1 * price1 + unit2 * price2)
//
//    println("VALOR A PAGAR: R\$ $x")

    //1009
//    val name = readLine()
//    val salary = readLine()!!.toDouble()
//    val total = readLine()!!.toDouble()
//    val x = String.format("%.2f", salary + (total * 0.15))
//    println("TOTAL = R\$ $x")


    //1008
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toDouble()
//    val x = String.format("%.2f", b * c)
//    println("NUMBER = $a")
//    println("SALARY = U\$ $x")
    //1007
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//    val d= readLine()!!.toInt()
//    val x = (a*b)-(c*d)
//    println("DIFERENCA = $x")
//    //1006
//    val a = readLine()!!.toDouble()
//    val b = readLine()!!.toDouble()
//    val c = readLine()!!.toDouble()
//    val x = String.format("%.1f", ((a *2)+(b*3)+(c*5))/ (2+3+5))
//    println("MEDIA = $x")

//    //1005
//    val a = readLine()!!.toDouble()
//    val b = readLine()!!.toDouble()
//    val x = String.format("%.5f", ((a *3.5)+(b*7.5))/ (3.5 + 7.5))
//    println("MEDIA = $x")


//1004
//    var PROD = 1
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    PROD = a * b
//    println("PROD = $PROD")
//1003
//    var SOMA = 0
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    SOMA = a + b
//    println("SOMA = $SOMA")
//    val n = 3.14159
//    val r = readLine()!!.toDouble()
//    val x = String.format("%.4f", n * (r * r))
//    println("A=$x")
}