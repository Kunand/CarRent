package com.example.dbConnect

//import java.sql.DriverManager
//
//data class cars(val id: Int, val type: String, val email: String, val address: String, val telephone: Int, val price: Int,
//                val bookeddates: String, val isactive: Boolean)
//
//fun main() {
//
//    val jdbcUrl = "jdbc:postgresql://localhost:5432/carrent"
//
//    val connection = DriverManager
//        .getConnection(jdbcUrl, "nem", "16t7trgg")
//    println(connection.isValid(0))
//
//    val query = connection.prepareStatement("SELECT * FROM com.example.dbConnect.cars")
//
//    val result = query.executeQuery()
//
//    val cars = mutableListOf<cars>()
//
//    while (result.next()) {
//        val id = result.getInt("id")
//        val type = result.getString("type")
//        val email = result.getString("email")
//        val address = result.getString("address")
//        val telephone = result.getInt("telephone")
//        val price = result.getInt("price")
//        val bookeddates = result.getString("bookeddates")
//        val isactive = result.getBoolean("isactive")
//
//
//        cars.add(cars(id, type, email, address, telephone, price, bookeddates, isactive))
//    }
//    println(cars)
//}