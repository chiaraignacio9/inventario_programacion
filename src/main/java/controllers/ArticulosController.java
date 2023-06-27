package controllers;

import Database.Database;
import Models.ArticulosModel;
import Models.EstadosModel;
import Models.TiposArticuloModel;
import java.util.List;
import javax.swing.JOptionPane;

public class ArticulosController {
    private Database database = new Database();
    private ArticulosModel model = new ArticulosModel();
    
    public void create(ArticulosModel articulo){        
        model.create(database.conectar(), articulo);
        JOptionPane.showMessageDialog(null, "Articulo creado con éxito", "Éxito", JOptionPane.PLAIN_MESSAGE);
        return;
    }
    
    public List<Object> getAll(){
        return model.findAll(database.conectar());
    }
}
