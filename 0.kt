fun main(){
    val d20 = Dice()
    d20.sides = 20
    d20.roll()
    println("working")
    
    d20.set_algo("alguma coisa")
    println(d20.get_algo())
}

class Dice {
    var sides = 20
    var algo: String = ""
    fun roll() Int {
        val interval = 1..sides
        val number = interval.random()
        return number

    }

    fun set_algo(vari: String) {
        algo = vari
    }
    fun get_algo() String{
        return algo

    }
    fun print_algo() {
        println("algo: "+algo)

    }
}