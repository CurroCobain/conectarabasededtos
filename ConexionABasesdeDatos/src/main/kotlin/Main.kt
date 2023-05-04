import java.sql.*
    fun main() {
        // val url = "jdbc:mysql://localhost:3306/sakila"
//jdbc:oracle:thin:@//localhost:1521:xe
        //EJPLSQL

        //-----------------------------------------------------CONECTAR A LA BASE DE DATOS---------------------------------------
        fun conectar(){
            val url = "jdbc:oracle:thin:@localhost:1521:xe"
            val usuario = "EJPLSQL"
            val contraseña = "EJPLSQL"
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver")
                val conexion = DriverManager.getConnection(url, usuario, contraseña)
                println("Conexión exitosa")
                conexion.close()
            } catch (e: SQLException) {
                println("Error en la conexión: ${e.message}")
            } catch (e: ClassNotFoundException) {
                println("No se encontró el driver JDBC: ${e.message}")
            }
        }
       //-------------------------------------------INSERTAR DATOS EN TABLA------------------------------------------------
        val usuario = "EJPLSQL"
        val contraseña = "EJPLSQL"
        data class MyTable(val column1: Int, val column2: Int, val column3: String, val column4: String, val column5:String)
        val myRecord = MyTable(40, 2, "Sede","Hola","Funciona")
        val conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "EJPLSQL", "EJPLSQL")
        val stmt = conn.prepareStatement("INSERT INTO CENTROS (COD_CE, DIRECTOR_CE, NOMB_CE,DIRECC_CE, POBLAC_CE) VALUES (?, ?, ?, ?, ?)")
        stmt.setInt(1, myRecord.column1)
        stmt.setInt(2, myRecord.column2)
        stmt.setString(3, myRecord.column3)
        stmt.setString(4, myRecord.column4)
        stmt.setString(5, myRecord.column5)
        stmt.executeUpdate()

        /*
//-------------------------------------------INSERTAR DATOS EN TABLA USANDO UN OBJETO ------------------------------------------------
val usuario = "EJPLSQL"
val contraseña = "EJPLSQL"
data class MyTable(val column1: Int, val column2: Int, val column3: String, val column4: String, val column5:String)
var centro =Centro(0,0,"","","")
centro.crearCentro()
val conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "EJPLSQL", "EJPLSQL")
val stmt = conn.prepareStatement("INSERT INTO CENTROS (COD_CE, DIRECTOR_CE, NOMB_CE,DIRECC_CE, POBLAC_CE) VALUES (?, ?, ?, ?, ?)")
stmt.setInt(1, centro.cod_ce)
stmt.setInt(2, centro.director_ce)
stmt.setString(3, centro.nomb_ce)
stmt.setString(4, centro.direcc_ce)
stmt.setString(5, centro.poblac_ce)
stmt.executeUpdate()

 */
    }

