

fun main(){
    val alimentos = mapOf(
        "Pizza" to 800,
        "Ensalada" to 200,
        "Hamburguesa" to 700,
        "Manzana" to 100,
        "Helado" to 300,
        "Pasta" to 600,
        "Yogurt" to 150
    )
    var altos = mutableMapOf<String, Int>()
    var bajos = mutableMapOf<String, Int>()
    var totalCalorias = 0

    println("--- Lista de alimentos ---")
    for ((k, v) in alimentos) {
        totalCalorias += v
        println("$k: $v")
        if(v > 500){
            altos.put(k, v)
        }else if (v < 500){
            bajos.put(k, v)
        }
    }
    println("--- -- -- -- -- ---")

    println(" ----- Alimentos altos en calorías ------ ")
    for((k, v) in altos){
        println("$k: $v")
    }
    println("--- -- -- -- -- ---")

    println(" ----- Alimentos bajos en calorías ------ ")
    for((k, v) in bajos){
        println("$k: $v")
    }
    println("--- -- -- -- -- ---")
    println("Total de calorias consumidas: $totalCalorias")
    println("Total de alimentos altos en calorías: ${altos.size}")
}