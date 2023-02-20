// // A Matter of Class
// // 
// // 2 hours extra class assignment - 2 points value
// // 
// //  
// // 
// // Write a Kotlin class to model a Hero from an RPG (Role Playing Game) videogame.
// // 
// //  
// // 
// // The Hero must have the following attributes:
class Hero {
    // name: the Hero’s name
    val name: String = "Jon"
    val life: Int = 3
    val level: Int = 1
    val xp: Int = 0
    // val items:  //list
    val status: String = "alive"

    // life: the Hero’s life points (starts with three points)
    // level: the Hero’s current experience level (starts at level 1)
    // xp: the Hero’s experience points (starts with zero)
    // items: a list of items the hero is carrying
    // status: if the hero is “alive” or “dead” (starts as “alive”)
// 
//  
// 
//  
// 
// The Hero must have the following methods:
    fun getItem() {

    // getItem(String): the item name (like a “sword”, “shield” or “potion”, for example) passed as the parameter should be added to the hero’s items list.
    }
    fun dropItem() {
    // dropItem(String): the item name (like a “sword”, “shield” or “potion”, for example) passed as the parameter should be removed from the hero’s items

    }
    fun decreaseLife() {
    // decreaseLife(): decreases the hero’s life by one point. If the hero’s life gets to zero, you should change the hero’s status from “alive” to “dead”
        life--
    }
    fun increaseLife() {
        life++
        
    // increaseLife(): increases the hero’s life by one
    }
    fun increaseXp() {

    // increaseXp(Int): adds the number of points passed as a parameter to the hero’s xp attribute. The hero’s level should be increased by one when the xp counter hits 25, 50, 75 and 100.
    }
    fun printStatus() {
    // printStatus(): shows all the attributes for the hero on the screen.
        println("name:"+name)
        println("life: " + life)
        println("level: "+ level)
        println("xp: "+xp)
        // val i'tems:  //list
        println("items: ")
        println("status: "+status)
    }
}

fun main() {
    println("")
    hero = Hero()
    
}