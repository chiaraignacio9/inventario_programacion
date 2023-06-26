/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JPanel;

/**
 *
 * @author AMD Ryzen 5 5500
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form Prueba
     */
    public DashBoard() {
        initComponents();
        
    }    
    class jPanelGradiente extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(255,153,153);
            Color color2 = new Color(242,242,242);
            GradientPaint gp = new GradientPaint(0,0,color1,width,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0, width, height);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TallesBTN = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InicioBTN = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DistribuidoresBTN = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        StockBTN = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PanelMultiple = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new jPanelGradiente();
        jLabel14 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel17 = new jPanelGradiente();
        jLabel16 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jComboBox25 = new javax.swing.JComboBox<>();
        jComboBox26 = new javax.swing.JComboBox<>();
        jComboBox27 = new javax.swing.JComboBox<>();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jComboBox28 = new javax.swing.JComboBox<>();
        jLabel84 = new javax.swing.JLabel();
        jComboBox29 = new javax.swing.JComboBox<>();
        jPanel42 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jComboBox30 = new javax.swing.JComboBox<>();
        jComboBox31 = new javax.swing.JComboBox<>();
        jComboBox32 = new javax.swing.JComboBox<>();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jComboBox33 = new javax.swing.JComboBox<>();
        jLabel94 = new javax.swing.JLabel();
        jComboBox34 = new javax.swing.JComboBox<>();
        jPanel46 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jComboBox35 = new javax.swing.JComboBox<>();
        jComboBox36 = new javax.swing.JComboBox<>();
        jComboBox37 = new javax.swing.JComboBox<>();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jComboBox38 = new javax.swing.JComboBox<>();
        jLabel104 = new javax.swing.JLabel();
        jComboBox39 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 239, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/MendoUrbanlogo.png"));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 150));

        jLabel8.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 233, 233));
        jLabel8.setText(" En Linea");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/main/java/Imagenes/EnLineaIcono.png"));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 30, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 250));

        TallesBTN.setBackground(new java.awt.Color(255, 120, 120));
        TallesBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TallesBTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TallesBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TallesBTNMouseExited(evt);
            }
        });
        TallesBTN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/TallesIcono.png"));
        TallesBTN.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 50));

        jLabel3.setBackground(new java.awt.Color(242, 238, 238));
        jLabel3.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Talles");
        TallesBTN.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 60, 50));

        jPanel2.add(TallesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 350, 50));

        InicioBTN.setBackground(new java.awt.Color(255, 120, 120));
        InicioBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InicioBTNMouseMoved(evt);
            }
        });
        InicioBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioBTNMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioBTNMouseExited(evt);
            }
        });
        InicioBTN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/main/java/Imagenes/InicioIcono.png"));
        InicioBTN.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 50));

        jLabel5.setBackground(new java.awt.Color(242, 238, 238));
        jLabel5.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inicio");
        InicioBTN.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 60, 50));

        jPanel2.add(InicioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 350, 50));

        DistribuidoresBTN.setBackground(new java.awt.Color(255, 120, 120));
        DistribuidoresBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DistribuidoresBTNMouseMoved(evt);
            }
        });
        DistribuidoresBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DistribuidoresBTNMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DistribuidoresBTNMouseExited(evt);
            }
        });
        DistribuidoresBTN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/DistribuidoresIcono.png"));
        DistribuidoresBTN.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 50));

        jLabel7.setBackground(new java.awt.Color(242, 238, 238));
        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Distribuidores");
        DistribuidoresBTN.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 160, 50));

        jPanel2.add(DistribuidoresBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 350, 50));

        StockBTN.setBackground(new java.awt.Color(255, 120, 120));
        StockBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                StockBTNMouseMoved(evt);
            }
        });
        StockBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockBTNMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StockBTNMouseExited(evt);
            }
        });
        StockBTN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/StockIcono.png"));
        StockBTN.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 50));

        jLabel13.setBackground(new java.awt.Color(242, 238, 238));
        jLabel13.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Stock");
        StockBTN.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 60, 50));

        jPanel2.add(StockBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 350, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 700));

        jPanel12.setBackground(new java.awt.Color(255, 102, 102));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/InicioLogo.png"));
        jPanel12.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        jLabel11.setBackground(new java.awt.Color(242, 238, 238));
        jLabel11.setFont(new java.awt.Font("Ebrima", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Inicio");
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 400, 60));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 950, 100));

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 153, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/Ignacio.jpg"));
        jPanel14.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 150));

        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel15.setText("GitHub");
        jPanel19.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, -1, 20));

        jPanel14.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, 30));

        jLabel23.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Programador version 2");
        jPanel14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jPanel7.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 270, 350));

        jPanel17.setBackground(new java.awt.Color(255, 153, 153));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/JesusC.png"));
        jPanel17.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 150));

        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel10.setText("GitHub");
        jPanel18.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, -1, 20));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, 30));

        jLabel22.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Programador version 1");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jPanel7.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 270, 350));

        jLabel19.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Jesus C.");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Ignacio C.");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dubai Medium", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Programacion III");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 360, 60));

        PanelMultiple.addTab("tab1", jPanel7);

        jPanel38.setBackground(new java.awt.Color(250, 250, 250));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTable10);

        jPanel38.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 910, 310));

        jLabel75.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel75.setText("Descripcion");
        jPanel38.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel76.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel76.setText("Tipo");
        jPanel38.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel77.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel77.setText("Talle");
        jPanel38.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        jLabel78.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel78.setText("Distribuidor");
        jPanel38.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel79.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel79.setText("Precio");
        jPanel38.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabel80.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel80.setText("Estado");
        jPanel38.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jPanel39.setBackground(new java.awt.Color(255, 153, 153));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel81.setText("Editar");
        jPanel39.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 120, 40));

        jPanel40.setBackground(new java.awt.Color(255, 153, 153));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel82.setText("Agregar");
        jPanel40.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel38.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 120, 40));

        jPanel41.setBackground(new java.awt.Color(255, 153, 153));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel83.setText("Eliminar");
        jPanel41.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel38.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 120, 40));

        jComboBox25.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remera", "Buzo", "Jean", " " }));
        jComboBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox25ActionPerformed(evt);
            }
        });
        jPanel38.add(jComboBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 150, -1));

        jComboBox26.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Desactivado" }));
        jPanel38.add(jComboBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 150, -1));

        jComboBox27.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MayoristaBA", "MinoristaMDZ", "MayoristaMatienzo" }));
        jPanel38.add(jComboBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 150, -1));

        jTextField15.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jPanel38.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 150, -1));

        jTextField16.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jPanel38.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 150, -1));

        jComboBox28.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL" }));
        jPanel38.add(jComboBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 150, -1));

        jLabel84.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel84.setText("Marca");
        jPanel38.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        jComboBox29.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nike", "Puma", "Adidas", "Vancouver Jeans", "MendoUrban" }));
        jPanel38.add(jComboBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 150, -1));

        PanelMultiple.addTab("tab2", jPanel38);

        jPanel42.setBackground(new java.awt.Color(250, 250, 250));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable11);

        jPanel42.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 910, 310));

        jLabel85.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel85.setText("Descripcion");
        jPanel42.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel86.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel86.setText("Tipo");
        jPanel42.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel87.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel87.setText("Talle");
        jPanel42.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        jLabel88.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel88.setText("Distribuidor");
        jPanel42.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel89.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel89.setText("Precio");
        jPanel42.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabel90.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel90.setText("Estado");
        jPanel42.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jPanel43.setBackground(new java.awt.Color(255, 153, 153));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel91.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel91.setText("Editar");
        jPanel43.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel42.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 120, 40));

        jPanel44.setBackground(new java.awt.Color(255, 153, 153));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel92.setText("Agregar");
        jPanel44.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel42.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 120, 40));

        jPanel45.setBackground(new java.awt.Color(255, 153, 153));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel93.setText("Eliminar");
        jPanel45.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel42.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 120, 40));

        jComboBox30.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remera", "Buzo", "Jean", " " }));
        jComboBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox30ActionPerformed(evt);
            }
        });
        jPanel42.add(jComboBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 150, -1));

        jComboBox31.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Desactivado" }));
        jPanel42.add(jComboBox31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 150, -1));

        jComboBox32.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MayoristaBA", "MinoristaMDZ", "MayoristaMatienzo" }));
        jPanel42.add(jComboBox32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 150, -1));

        jTextField17.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jPanel42.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 150, -1));

        jTextField18.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jPanel42.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 150, -1));

        jComboBox33.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL" }));
        jPanel42.add(jComboBox33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 150, -1));

        jLabel94.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel94.setText("Marca");
        jPanel42.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        jComboBox34.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nike", "Puma", "Adidas", "Vancouver Jeans", "MendoUrban" }));
        jPanel42.add(jComboBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 150, -1));

        PanelMultiple.addTab("tab2", jPanel42);

        jPanel46.setBackground(new java.awt.Color(250, 250, 250));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(jTable12);

        jPanel46.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 910, 310));

        jLabel95.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel95.setText("Descripcion");
        jPanel46.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel96.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel96.setText("Tipo");
        jPanel46.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel97.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel97.setText("Talle");
        jPanel46.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        jLabel98.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel98.setText("Distribuidor");
        jPanel46.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel99.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel99.setText("Precio");
        jPanel46.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabel100.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel100.setText("Estado");
        jPanel46.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jPanel47.setBackground(new java.awt.Color(255, 153, 153));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel101.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel101.setText("Editar");
        jPanel47.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel46.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 120, 40));

        jPanel48.setBackground(new java.awt.Color(255, 153, 153));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel102.setText("Agregar");
        jPanel48.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel46.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 120, 40));

        jPanel49.setBackground(new java.awt.Color(255, 153, 153));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel103.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel103.setText("Eliminar");
        jPanel49.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jPanel46.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 120, 40));

        jComboBox35.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remera", "Buzo", "Jean" }));
        jComboBox35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox35ActionPerformed(evt);
            }
        });
        jPanel46.add(jComboBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 150, -1));

        jComboBox36.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Desactivado" }));
        jPanel46.add(jComboBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 150, -1));

        jComboBox37.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox37.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MayoristaBA", "MinoristaMDZ", "MayoristaMatienzo" }));
        jPanel46.add(jComboBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 150, -1));

        jTextField19.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jPanel46.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 150, -1));

        jTextField20.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jPanel46.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 150, -1));

        jComboBox38.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox38.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL" }));
        jPanel46.add(jComboBox38, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 150, -1));

        jLabel104.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel104.setText("Marca");
        jPanel46.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        jComboBox39.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jComboBox39.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nike", "Puma", "Adidas", "Vancouver Jeans", "MendoUrban" }));
        jPanel46.add(jComboBox39, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 150, -1));

        PanelMultiple.addTab("tab2", jPanel46);

        jPanel1.add(PanelMultiple, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 950, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1316, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InicioBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioBTNMouseClicked
        PanelMultiple.setSelectedIndex(0);
        Logo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/InicioLogo.png"));
        jLabel11.setText("Inicio");
    }//GEN-LAST:event_InicioBTNMouseClicked

    private void StockBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockBTNMouseClicked
        PanelMultiple.setSelectedIndex(1);
        Logo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/storeLogo.png"));
        jLabel11.setText("Stock");
    }//GEN-LAST:event_StockBTNMouseClicked

    private void DistribuidoresBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DistribuidoresBTNMouseClicked
        PanelMultiple.setSelectedIndex(2);
        Logo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/DistribuidoresLogo.png"));
        jLabel11.setText("Distribuidores");
    }//GEN-LAST:event_DistribuidoresBTNMouseClicked

    private void TallesBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TallesBTNMouseClicked
        PanelMultiple.setSelectedIndex(3);
        Logo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "/src/main/java/Imagenes/TallesLogo.png"));
        jLabel11.setText("Talles");
    }//GEN-LAST:event_TallesBTNMouseClicked

    private void InicioBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioBTNMouseMoved
        InicioBTN.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_InicioBTNMouseMoved

    private void InicioBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioBTNMouseExited
        InicioBTN.setBackground(new Color(255,120,120));
    }//GEN-LAST:event_InicioBTNMouseExited

    private void StockBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockBTNMouseMoved
       StockBTN.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_StockBTNMouseMoved

    private void StockBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockBTNMouseExited
        StockBTN.setBackground(new Color(255,120,120));
    }//GEN-LAST:event_StockBTNMouseExited

    private void DistribuidoresBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DistribuidoresBTNMouseMoved
        DistribuidoresBTN.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_DistribuidoresBTNMouseMoved

    private void DistribuidoresBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DistribuidoresBTNMouseExited
        DistribuidoresBTN.setBackground(new Color(255,120,120));
    }//GEN-LAST:event_DistribuidoresBTNMouseExited

    private void TallesBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TallesBTNMouseEntered
       TallesBTN.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_TallesBTNMouseEntered

    private void TallesBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TallesBTNMouseExited
        TallesBTN.setBackground(new Color(255,120,120));
    }//GEN-LAST:event_TallesBTNMouseExited

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        AbrirPagina("https://github.com/jeschadee");
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
        AbrirPagina("https://github.com/chiaraignacio9");
    }//GEN-LAST:event_jPanel19MouseClicked

    private void jComboBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox25ActionPerformed

    private void jComboBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox30ActionPerformed

    private void jComboBox35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox35ActionPerformed
    
    public void AbrirPagina(String url){
        try {
            Desktop.getDesktop().browse(new URL(url).toURI());
        } catch (Exception e) {}
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DistribuidoresBTN;
    private javax.swing.JPanel InicioBTN;
    private javax.swing.JLabel Logo;
    private javax.swing.JTabbedPane PanelMultiple;
    private javax.swing.JPanel StockBTN;
    private javax.swing.JPanel TallesBTN;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox31;
    private javax.swing.JComboBox<String> jComboBox32;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox38;
    private javax.swing.JComboBox<String> jComboBox39;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    // End of variables declaration//GEN-END:variables
}
