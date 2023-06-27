package controllers;

import Database.Database;
import Models.DistribuidoresModel;
import java.util.List;
import javax.swing.JOptionPane;

public class DistribuidoresController {
    
    private Database database = new Database();
    DistribuidoresModel model = new DistribuidoresModel();
    
    public List<DistribuidoresModel> getAll(){
        return model.findAll(database.conectar());
    }
    
    public void createDistribuidor(DistribuidoresModel distribuidoresModel){
        
        if(distribuidoresModel.getRazonSocial().isEmpty() || distribuidoresModel.getRazonSocial().isBlank() ){
           JOptionPane.showMessageDialog(null, "Ingrese una razón social", "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        distribuidoresModel.create(database.conectar(), distribuidoresModel);
        JOptionPane.showMessageDialog(null, "Distribuidor creado con éxito", "Éxito", JOptionPane.PLAIN_MESSAGE);
        return;
    }
    
    public void deleteDistribuidor(int id){
        model.deleteById(database.conectar(), id);
        JOptionPane.showMessageDialog(null, "Distribuidor eliminado con éxito", "Eliminado", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void update(int id, String razonSocial, String descripcion){
        
        model.update(database.conectar(), new DistribuidoresModel(id, razonSocial, descripcion));
        JOptionPane.showMessageDialog(null, "Distribuidor editado con éxito", "Editado", JOptionPane.PLAIN_MESSAGE);
    }
}
