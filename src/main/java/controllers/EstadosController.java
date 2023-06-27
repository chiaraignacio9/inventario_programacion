/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Database.Database;
import Models.EstadosModel;
import java.util.List;

/**
 *
 * @author 54263
 */
public class EstadosController {
    private Database database = new Database();
    EstadosModel model = new EstadosModel();
    
    public List<EstadosModel> getAll(){
        return model.findAll(database.conectar());
    }
}
