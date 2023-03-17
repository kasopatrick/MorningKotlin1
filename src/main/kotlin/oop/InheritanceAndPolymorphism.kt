package oop

import javax.lang.model.element.Name

fun main(args: Array<String>) {
    //Inheritance and Polymorphism
    var studentOne = Student("Jared", "jared@gmail.com", "asdfg")

    println(studentOne.name)

    var teacherOne = Teacher("Sam", "sam@gmail.com", "asdfgh")

    println(teacherOne.name)
    teacherOne.suspendStudent()

    var headTaecherOne = HeadTaecher ("Ken","ken@gmail.com", "asdfghj")
    println(headTaecherOne.name)
    headTaecherOne.register()
    headTaecherOne.login()
    headTaecherOne.approveCash()
    headTaecherOne.suspendStudent()
}



    open class Student( open var name:String,open var email:String,open var password:String){

        fun register(){
            println("You registered with email $email and password $password")
        }
        fun login(){
            println("You logged in with email $email and password $password")
        }


    }
    open class Teacher(name:String, email: String, password: String):Student(name, email, password ) {
        fun suspendStudent() {
            println("yeah I can suspend a student")
        }

    }

class HeadTaecher(name:String, email: String, password: String): Teacher(name,email, password) {
    fun approveCash() {
        println("Yeah I can approve cash")
    }

}

