package views;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Layout extends JFrame {
    private JTabbedPane jTabbedPane;
    private ArticulosView articulosView;
    private DistribuidoresView distribuidoresView;

    public Layout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        jTabbedPane = new JTabbedPane();

        articulosView = new ArticulosView();
        distribuidoresView = new DistribuidoresView();

        jTabbedPane.addTab("Articulos", articulosView);
        jTabbedPane.addTab("Distribuidores", distribuidoresView);

        jTabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedTabIndex = jTabbedPane.getSelectedIndex();

                // Verificar la pestaña seleccionada y realizar la carga de vista correspondiente
                if (selectedTabIndex == 0) {
                } else if (selectedTabIndex == 1) {
                    distribuidoresView.getAll();
                }
            }
        });


        add(jTabbedPane, BorderLayout.CENTER);
    }
}
