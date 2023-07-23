package com.mycompany.inventario;

import Views.DashBoard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Inventario {

    public static void main(String[] args) {

        String directorioActual = System.getProperty("user.dir");
        String url = "jdbc:sqlite:" + directorioActual + "/src/main/java/Database/database.db";

        // Sentencias SQL para crear las tablas
        String[] createTableQueries = {
            "CREATE TABLE IF NOT EXISTS articulos (idArticulo INTEGER PRIMARY KEY AUTOINCREMENT, idTipoArticulo INT, descripcion TEXT, precio REAL, estado INT, idTalle INT, idDistribuidor INT)",
            "CREATE TABLE IF NOT EXISTS distribuidores (idDistribuidor INTEGER PRIMARY KEY AUTOINCREMENT, razonSocial VARCHAR(127) NOT NULL, descripcion VARCHAR(127))",
            "CREATE TABLE IF NOT EXISTS estados (idEstado INTEGER PRIMARY KEY AUTOINCREMENT, descripcion TEXT NOT NULL)",
            "CREATE TABLE IF NOT EXISTS stock (idArticulo INT, cantidad INT, idTalle INT)",
            "CREATE TABLE IF NOT EXISTS talles (idTalle INTEGER PRIMARY KEY AUTOINCREMENT, descripcion TEXT NOT NULL)",
            "CREATE TABLE IF NOT EXISTS tiposArticulo (idTipoArticulo INTEGER PRIMARY KEY AUTOINCREMENT, descripcion TEXT NOT NULL)"            
        };

        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {

            // Crear las tablas en la base de datos
            for (String query : createTableQueries) {
                stmt.execute(query);
            }

            System.out.println("Las tablas se crearon correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
        }

        DashBoard dashBoard = new DashBoard();
        dashBoard.setVisible(true);
    }
}
