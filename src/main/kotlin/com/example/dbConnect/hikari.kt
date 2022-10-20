package com.example.dbConnect
import com.zaxxer.hikari.HikariDataSource
import java.sql.Connection


fun main(): Connection? {
    val dataSource = HikariDataSource()
    dataSource.jdbcUrl = "jdbc:postgresql://localhost:5432/carrent"
    dataSource.username = "nem"
    dataSource.password = "16t7trgg"
    val connection = dataSource.connection

    return connection


}
