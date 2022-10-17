package com.example.plugins

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

        }
    }


fun Routing.selectCars() {
    val cars = SelectCars()
    get("/"){
        call.respondHtml {
            head {
                title { +"Cars" }
            }
            body {
                ul {
                    for (car in cars) {
                        li { +"$car" }
                        form(action = "/carDetailes", method = FormMethod.post){
                            button { +"Detailes" }
                        }
                    }
                }
            }
        }
    }
}

fun Routing.CarDetailes() {
    val carDetailes = SelectCarDetails()
    get("/carDetailes"){
        call.respondHtml {
            head {
                title { +"CarDetailes" }
            }
            body {
                ul {
                    for (carDetail in carDetailes) {
                        li { +"$carDetail" }
                        form(action = "/carDetailes", method = FormMethod.post){
                            button { +"Detailes" }
                        }
                    }
                }
            }
        }
    }
}



//            call.respondFile(File("./templates/index.html"))

//            call.respondText(carDetails.toString())
//            call.respondText(html)


//call.respondHtml {
//    head {
//        title { +"Cars" }
//    }
//    body {
//        ul {
//            for (car in cars) {
//                li { +"$car" }
//            }
//        }
//    }
//}