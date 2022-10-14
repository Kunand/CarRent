package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.html.*

import SelectCars
import com.example.dbConnect.main
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import kotlinx.html.*

fun Application.configureRouting() {
    val cars = SelectCars()
    println(cars)
    routing {
        get{
//            call.respondText(carDetails.toString())
            call.respondHtml {
                head{
                    title{+ "Cars"}
                }
                body {
                    ul{
                        for (car in cars){
                            li { +"$car" }
                        }
                    }
//                    h1 {+ "asd $cars"}
                }
            }
        }
    }
    routing {
    }
}
