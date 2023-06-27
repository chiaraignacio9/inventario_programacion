package Views;
import Models.DistribuidoresModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.util.List;

public class DistribuidoresView extends JPanel {

    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private boolean table;

    public DistribuidoresView(){
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("Razon social");
        defaultTableModel.addColumn("Descripcion");
        defaultTableModel.addColumn("Acciones");

        jTable = new JTable(defaultTableModel);
        jTable.setDefaultEditor(Object.class, null);
        jTable.setFont(new Font("Arial", Font.PLAIN, 14));
        jTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        jTable.getTableHeader().setForeground(Color.WHITE);
        jTable.getTableHeader().setBackground(Color.BLUE);
        JScrollPane scrollPane = new JScrollPane(jTable);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(scrollPane);

    }
    public void getAll(Connection connection){
        if(!table){
            DistribuidoresModel distribuidoresModel = new DistribuidoresModel();
            List<DistribuidoresModel> list = distribuidoresModel.findAll(connection);
            for (DistribuidoresModel distribuidor: list) {
                Object[] rowData = {distribuidor.getIdDistribuidores(), distribuidor.getRazonSocial(), distribuidor.getDescripcion()};
                defaultTableModel.addRow(rowData);
            }
            table = true;
        }
    }
}
