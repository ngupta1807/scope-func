package com.example.myapplication.ScopeFunc

fun main() {
/*
* ALso: takes context object as ref , used when we donot want to use this ref inside or outside
 */

    var al = DemoScopeFunc("A","B","C").also {
        println(it.name)
        it.name = "d"
        it.objective = "e"
        it.founder = "f"
        println(it.name)
    }
    println(al.objective)  // can call variable outside. Cannot omit it

    var a= mutableListOf("one","two","three","four","five")
    a.also { println("print::$it") }.add("six")
    println(a)





}
