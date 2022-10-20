import com.example.dbConnect.main

fun SelectCars(): MutableList<String> {
val connection = main()
val query = connection?.prepareStatement("SELECT id, type FROM cars WHERE isactive = True")
val result = query?.executeQuery()
val carsList = mutableListOf<String>()

while (result?.next() == true) {
    val id = result.getInt("id").toString()
    val type = result.getString("type")

    carsList.add(id)
    carsList.add(type)
    println(carsList)
    }

    return carsList
}




