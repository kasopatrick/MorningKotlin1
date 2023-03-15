fun main(args: Array<String>) {
    var x:Int
    val y:Int

    x = 20
    x = 30
    println(x)

    y = 40
    println(y)

    //Calculating SI of a loan borrowed
    var principle = 10000
    var time = 5
    var rate = 2.5
    var interest = (principle * time * rate)/ 100.0
    println("your interest is $interest")

    //Calculating the volume of a cylinder
    var radius = 10
    var height = 5
    var pie = 22/7
    var volume = (pie * radius * radius * height)
    println("Your volume is $volume")



}