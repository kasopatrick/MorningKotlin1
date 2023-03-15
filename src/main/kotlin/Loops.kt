fun main(args: Array<String>) {
    //WHILE LOOPS
        //WHILE LOOP
    var counterone = 0
    while (counterone <= 5){
        println(counterone)
        counterone++
    }
        //DO WHILE LOOP
    var countertwo = 10
    do {
        println(countertwo)
        countertwo++
    }while (countertwo <=15)
    //FOR LOOPS
         //for loop
    for ( num in 20 ..  25){
        println(num)
    }
    for ( num in 50 downTo   45){
        println(num)
    }

        //for each loop
    var names = listOf("josiah","james","lorna","juma","victoria")
    names.forEach {
        println(it)
    }




    //REPEAT LOOP
    repeat(5){
        println("hello world")
    }
}