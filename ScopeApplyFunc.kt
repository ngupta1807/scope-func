package com.example.myapplication.ScopeFunc
fun main() {

/*apply :used for more complex chaining , donot return value , used to do operations on member obj.*/

//...............apply..................................
    var list = mutableListOf<Double>()
    list.apply {
        println("1:" + list)
        add(2.5)
        add(2.1)
        add(2.8)
        add(2.3)
        sort()
    }
    println("2:" + list) // donot return value , can do operation

    var ap = DemoScopeFunc("A", "B", "C").apply {
        println(name)
        name = "d"
        this.objective = "e"
        this.founder = "f"
        println(this.name)
    }
    println(ap.founder)  // can omit this , can call variable outside scope

    var ls = mutableListOf<Double>()
    ls
        .also { println("3:" + ls) }  // cannot use add , sort inside also.
        .apply {
            add(2.5)
            add(2.1)
            add(2.8)
            add(2.3)
        }.sort()
        .also { println("4:" + ls) }  // used for complex chaining

}


