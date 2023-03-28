package com.example.myapplication.ScopeFunc


fun main() {

//..................let(used when we want to print result from 2 or more funcions).......................
    var a= mutableListOf("one","twow","three","wdsadasds","asdasdsad")
    var result=a.map { it.length }.filter { it>5 }
    println("6:"+result)
    //a.map { it.length }.filter { it>5 }.let {println(it)}  // advance way
    //a.map { it.length }.filter { it>5 }.let (::println)  // more advance way

    var str:String?="ssasa"
    val len=str?.also{
        it.length
    }
    println("7:"+len)



}
