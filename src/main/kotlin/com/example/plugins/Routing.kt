package com.example.plugins


import CarDetailes
import SelectCarDetails
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
import java.io.File

fun Application.configureRouting() {
//    val html = File("index.html").readText()
        routing {
            selectCars()
            SelectcarDetailes()

        }
    }


fun Routing.selectCars() {
    val cars = SelectCars()
    val carDetailes = SelectCarDetails()
    println(cars)
    get("/"){
        call.respondHtml {
            head {
                title { +"Cars" }
            }
            body {
                ul {
                    for (car in cars) {
                        li { +"$car" }
                        form(action = "/carDetailes{id}", method = FormMethod.post){
                            button { +"Detailes" }
                        }
                    }
                }
            }
        }
    }

}

fun Routing.SelectcarDetailes() {
    post("/carDetailes{id}") {
        val carDetailes = SelectCarDetails()
        println(carDetailes)
        call.respondHtml {
            head {
                title { +"CarDetailes" }
            }
            body {
                ul {
                    for (carDetail in carDetailes) {
                        li { +"$carDetail" }
                    }
                }
            }
        }
    }
}


