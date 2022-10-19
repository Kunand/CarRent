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
//            CarDetailes()

        }
    }


fun Routing.selectCars() {
    val cars = SelectCars()
    val carDetailes = SelectCarDetails()
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




//call.respondHtml {
//    head {
//        title { +"CarDetailes" }
//    }
//    body {
////                ul {
////                    for (carDetail in carDetailes) {
////                        li { +"$carDetail" }
////                    }
////                }
//        h1 { +"$car" }
//    }
//}


//fun Routing.CarDetailes() {
//    val carDetailes = SelectCarDetails()
//    println(carDetailes)
//    get("/carDetailes"){
//        call.respondHtml {
//            head {
//                title { +"CarDetailes" }
//            }
//            body {
//                ul {
//                    for (carDetail in carDetailes) {
//                        li { +"$carDetail" }
//                    }
//                }
//            }
//        }
//    }
//}



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