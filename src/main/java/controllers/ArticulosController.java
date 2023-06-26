package controllers;

import Views.ArticulosView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArticulosController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ArticulosView articulosView = new ArticulosView();
        articulosView.setVisible(true);
    }
}
