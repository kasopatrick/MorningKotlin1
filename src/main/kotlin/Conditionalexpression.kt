fun main(args: Array<String>) {
    var marks = 80
    var grade = if (marks < 50) {
        "E"
    } else if (marks < 60) {
        "D"
    } else if (marks < 70) {
        "C"
    } else if (marks < 80) {
        "B"
    } else {
        "A"
    }
    println(grade)


    var bettingnumber = 1
    var bettingresulsts = when (bettingnumber) {
        1 -> {
            "you lost"
        }

        2 -> {
            "you won"
        }

        3 -> {
            "you lost"
        }

    else ->{
        "please enter a number from 1-3"
    }


    }
    println(bettingresulsts)
}
