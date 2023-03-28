package com.example.myapplication.ScopeFunc


fun main() {
/*
* 1. (2 opeations) : can intialise values and return result
 */
//,.................run(assign result to variable)....................................

    var al = DemoScopeFunc("A","B","C").run {
        name = "d"  // initialise
        this.objective = "e"
        this.founder = "f"
        this.name  // return
    }
    println(al)  // can call variable outside. Cannot omit it

    var vare= mutableListOf("one","two","three")
    val res=vare.run {
        add("four")
        add("five")
        count()  // return
    }
    println(res) // sort does not work , can return last value result

}
