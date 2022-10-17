import com.example.dbConnect.main

data class CarDetailes(val id: Int, val type: String, val email: String, val address: String, val telephone: Int, val price: Int,
                val bookeddates: String)

fun SelectCarDetails(): MutableList<CarDetailes> {
    val connection = main()
    val query = connection?.prepareStatement("SELECT * FROM cars")
    val result = query?.executeQuery()
    val carDetail = mutableListOf<CarDetailes>()
    while (result?.next() == true) {
        val id = result.getInt("id")
        val type = result.getString("type")
        val email = result.getString("email")
        val address = result.getString("address")
        val telephone = result.getInt("telephone")
        val price = result.getInt("price")
        val bookeddates = result.getString("bookeddates")

        carDetail.add(id, type, email, address, telephone, price, bookeddates)
    }

    return carDetail
}