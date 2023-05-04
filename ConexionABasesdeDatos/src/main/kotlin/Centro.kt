import java.sql.DriverManager

class Centro(codigo:Int, jefe:Int, nombre:String, direccion:String, poblacion:String) {
    var cod_ce = codigo
    var director_ce = jefe
    var nomb_ce = nombre
    var direcc_ce = direccion
    var poblac_ce = poblacion


    fun crearCentro(){
        println("Dime el codigo del centro ")
        this.cod_ce= readln().toInt()
        println("Dime el codigo del jefe del centro ")
        this.director_ce= readln().toInt()
        println("Dime el nombre del centro ")
        this.nomb_ce= readln()
        println("Dime la direccion del centro ")
        this.direcc_ce= readln()
        println("Dime la poblacion del centro ")
        this.poblac_ce= readln()
    }
}
