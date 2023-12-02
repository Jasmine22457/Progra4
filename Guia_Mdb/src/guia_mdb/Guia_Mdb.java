/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_mdb;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Jasmin
 */
public class Guia_Mdb {
static final String CONTROLADOR = "org.mariadb.jdbc.Driver";
static final String URL_BASEDATOS = "jdbc:mariadb://localhost:3306/registros";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Connection conexion = null; // maneja la conexión
        
        Statement instruccion = null; // instrucción de consulta
        
        ResultSet conjuntoResultados = null; // maneja los resultados
        
         // se conecta a la base de datos libros y realiza una consulta
        try {
            // carga la clase controlador
        Class.forName( CONTROLADOR );
        
    // establece la conexión a la base de datos
            conexion = DriverManager.getConnection( URL_BASEDATOS, "root", "1234" );

        // crea objeto Statement para consultar la base de datos

            instruccion = conexion.createStatement();



             Scanner scanner = new Scanner(System.in);

            int opcion;
            do {
                System.out.println("Menú Principal:");
                System.out.println("1. Ver estudiantes");
                System.out.println("2. Ver materias");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        verEstudiantes(conexion);
                        break;
                    case 2:
                        verMaterias(conexion);
                        break;
                }
            } while (opcion != 3);

            scanner.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (instruccion != null) instruccion.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conexion!= null) conexion.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    private static void verEstudiantes(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de Estudiantes:");

        // Recuperar datos de la base de datos
        String sql = "SELECT * FROM estudiante";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("nombre"));
            }
        }

        System.out.print("Seleccione el ID del estudiante que desea ver: ");
        int estudianteId = scanner.nextInt();

        // Recuperar materias inscritas por el estudiante desde la base de datos
        sql = "SELECT m.nombre FROM materia m " +
                "JOIN carga i ON id = id " +
                "WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, estudianteId);
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("Materias inscritas por el estudiante:");
                while (rs.next()) {
                    System.out.println("- " + rs.getString("nombre"));
                }
            }
        }
    }

    private static void verMaterias(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de Materias:");

        // Recuperar datos de la base de datos
        String sql = "SELECT * FROM materia";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("nombre"));
            }
        }

        System.out.print("Seleccione el ID de la materia que desea ver: ");
        int materiaId = scanner.nextInt();

        // Recuperar estudiantes inscritos en la materia desde la base de datos
        sql = "SELECT e.nombre FROM estudiante e " +
                "JOIN carga i ON e.id = id " +
                "WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, materiaId);
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("Estudiantes inscritos en la materia:");
                while (rs.next()) {
                    System.out.println("- " + rs.getString("nombre"));
                }
            }
        }
    }
}