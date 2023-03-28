package com.example.myapplication.ScopeFunc

fun main() {
/*
* 1.object passed as argument , used when we donot want to return result
 */
//..................with(we donot want to use return result).......................
    var b= mutableListOf("one","twow","three","wdsadasds","asdasdsad")
    with(b){
        println(":$this:"+b)
        println(":"+size)
    }



}
