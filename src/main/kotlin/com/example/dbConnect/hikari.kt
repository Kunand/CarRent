package com.example.dbConnect
import com.zaxxer.hikari.HikariDataSource
import java.sql.Connection

//data class cars(val id: Int, val type: String, val email: String, val address: String, val telephone: Int, val price: Int,
//                val bookeddates: String, val isactive: Boolean)


fun main(): Connection? {
    val dataSource = HikariDataSource()
    dataSource.jdbcUrl = "jdbc:postgresql://localhost:5432/carrent"
    dataSource.username = "nem"
    dataSource.password = "16t7trgg"
    val connection = dataSource.connection

    return connection

//    val query = connection.prepareStatement("SELECT * FROM cars")
//
//    val result = query.executeQuery()
//    println(result)
//
//    val carsList = mutableListOf<cars>()
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
////        carsList.add(cars(id, type))
//        carsList.add(cars(id, type, email, address, telephone, price, bookeddates, isactive))
//    }
//
//    return carsList
////    println(cars)

}
