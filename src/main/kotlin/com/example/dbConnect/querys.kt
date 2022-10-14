import com.example.dbConnect.main

fun SelectCars(): MutableList<String> {
val connection = main()
val query = connection?.prepareStatement("SELECT type FROM cars")
val result = query?.executeQuery()
val carsList = mutableListOf<String>()

while (result?.next() == true) {
//    val id = result.getInt("id")
    val type = result.getString("type")
//    val email = result.getString("email")
//    val address = result.getString("address")
//    val telephone = result.getInt("telephone")
//    val price = result.getInt("price")
//    val bookeddates = result.getString("bookeddates")
//    val isactive = result.getBoolean("isactive")

//        carsList.add(cars(id, type))
    carsList.add(type)
    }

    return carsList
}

//fun SelectCarDetails(): MutableList<String> {
//    val connection = main()
//    val query = connection?.prepareStatement("SELECT * FROM cars")
//    val result = query?.executeQuery()
//    val carDetails = mutableListOf<String>()
//    while (result?.next() == true) {
//        val id = result.getInt("id").toString()
//        val type = result.getString("type")
//        val email = result.getString("email")
//        val address = result.getString("address")
//        val telephone = result.getInt("telephone").toString()
//        val price = result.getInt("price").toString()
//        val bookeddates = result.getString("bookeddates")
//        val isactive = result.getBoolean("isactive").toString()
//
//        carDetails.add(id, type, email, address, telephone, price, bookeddates, isactive)
//    }
//
//    return carDetails
//}