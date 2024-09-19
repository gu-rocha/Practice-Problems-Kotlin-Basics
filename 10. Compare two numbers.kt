fun main() {
    // Test cases
    val result1 = hasSpentMoreTimeToday(300, 250) // Should return true
    val result2 = hasSpentMoreTimeToday(300, 300) // Should return false
    val result3 = hasSpentMoreTimeToday(200, 220) // Should return false
    val result4 = hasSpentMoreTimeToday(221, 220) // Should return true
   
    // Print the results
    println("Result 1: $result1") 
    println("Result 2: $result2") 
    println("Result 3: $result3") 
    println("Result 4: $result4")     
}

fun hasSpentMoreTimeToday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    // Compare the time spent today with the time spent yesterday
    return timeSpentToday > timeSpentYesterday
}
