/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Database.Database;
import Models.TiposArticuloModel;
import java.util.List;

/**
 *
 * @author 54263
 */
public class TiposArticuloController {
    private Database database = new Database();
    private TiposArticuloModel model = new TiposArticuloModel();
    
    public List<TiposArticuloModel> getAll(){
        return model.findAll(database.conectar());
    }
}
