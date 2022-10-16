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
                    }
                }
            }
        }
//            call.respondFile(File("./templates/index.html"))

//            call.respondText(carDetails.toString())
//            call.respondText(html)

    }
}





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