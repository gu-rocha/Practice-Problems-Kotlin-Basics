/*
fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
    
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
    
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}
*/

fun main() {
    val cities = listOf(
        City("Ankara", 27, 31, 82),
        City("Tokyo", 32, 36, 10),
        City("Cape Town", 59, 64, 2),
        City("Guatemala City", 50, 55, 7)
    )

    for (city in cities) {
        println("City: ${city.name}")
        println("Low temperature: ${city.lowTemp}, High temperature: ${city.highTemp}")
        println("Chance of rain: ${city.chanceOfRain}%")
        println()
    }
}

data class City(val name: String, val lowTemp: Int, val highTemp: Int, val chanceOfRain: Int)
