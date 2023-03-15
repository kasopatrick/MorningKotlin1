fun main(args: Array<String>) {
    //IF STATEMENT
    var age = 20
    if (age < 18) {
        println("You are under age")
    } else {
        println("Welcome to the party")
    }


    var weight = 100
    var height = 1.9
    var bmi = weight / (weight * height)
    if (bmi <= 18) {
        println("underweight")
    } else if (bmi <= 29) {
        println("normal weight")
    } else if (bmi <= 34) {
        println("overweight")

    } else {
        println("obese")
    }


    ///WHEN STATEMENT
    var bettingnumber = 3
    when (bettingnumber) {
        1 -> {
            println("You lost")

        }

        2 -> {
            println("You lost")

        }

        3 -> {
            println("You won")
        }

        4 -> {
            println("You lost")


        }
        else->{
            println("Please enter a number from 1-4 to bet")

    }

    }
}
