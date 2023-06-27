
package controllers;

import Database.Database;
import Models.DistribuidoresModel;
import Models.TalleModel;
import java.util.List;
import javax.swing.JOptionPane;


public class TalleController {
    private Database database = new Database();
    private TalleModel model = new TalleModel();
    
    public List<TalleModel> getAll(){
        return model.findAll(database.conectar());
    }
    
    public void createTalle(TalleModel talleModel){
        
        if(talleModel.getDescripcion().isEmpty() || talleModel.getDescripcion().isBlank() ){
           JOptionPane.showMessageDialog(null, "Ingrese una descripcion", "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        talleModel.create(database.conectar(), talleModel);
        JOptionPane.showMessageDialog(null, "Distribuidor creado con éxito", "Éxito", JOptionPane.PLAIN_MESSAGE);
        return;
    }
    
    public void deleteTalle(int id){
        model.deleteById(database.conectar(), id);
        JOptionPane.showMessageDialog(null, "Talle eliminado con éxito", "Eliminado", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void update(int id, String descripcion){
        
        model.update(database.conectar(), new TalleModel(id, descripcion));
        JOptionPane.showMessageDialog(null, "Talle editado con éxito", "Editado", JOptionPane.PLAIN_MESSAGE);
    }
}
