package mx.com.gob.cdmx.concursocostplay.models

data class Persona(
    val id : Int = 0,
    val edad : Int = 0,
    val nombre : String = "",
    val nombreCostplay : String = "",
    val nacionalidad: String= "",
    val categoria : String = "",
    val mascara : Boolean = false
)
