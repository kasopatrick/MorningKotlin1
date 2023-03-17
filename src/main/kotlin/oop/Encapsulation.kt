package oop

fun main(args: Array<String>) {
}

class Person(var name: String, var age: String) {
    private var salary: Double = 0.0
    private var residence: String = ""
    fun setSalary(salary: Double) {
            this.salary = salary
    }


    fun getSalary(): Double {
            return this.salary
    }

    fun setResidence(residence: String) {
            this.residence = residence
    }
    fun getResidence():String{
            return this.residence
    }
    fun walk() {
            println("Yeah I can walk")
    }

    fun run() {
            println("Yeah I can run")
    }
}

