package QLKS.Form;
import QLKS.Form.MENUFORM;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import static QLKS.MyConnection.getConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class Chart extends javax.swing.JFrame {

    /**
     * Creates new form Chart
     */
    public Chart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIỂU ĐỒ SỐ LƯỢNG PHÒNG ");

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLKS/Form/close.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel8))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Hiển thị");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Trang chủ");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jPanel3.setLayout(new java.awt.BorderLayout());

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });
        panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelComponentShown(evt);
            }
        });
        panel.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("THỐNG KÊ SỐ LƯỢNG PHÒNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       new MENUFORM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
//        int a = Integer.parseInt(txt_1.getText());
        
        Connection con = getConnection();
        Statement st= null;
        int standards = 0;
        int vip = 0;
        int business = 0;
        int royal = 0;
        int special = 0;
        try {
            st = (Statement) con.createStatement();
            String sql = "Select a.standards, b.vip, c.business, d.royal, e.special from (Select count(1) standards from PHONG  where LOAIPHONG = 'standard') a, (Select count(1) vip from PHONG  where LOAIPHONG = 'vip') b, (Select count(1) business from PHONG  where LOAIPHONG = 'business') c, (Select count(1) royal from PHONG  where LOAIPHONG = 'royal') d, (Select count(1) special from PHONG  where LOAIPHONG = 'special') e";
            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                standards = Integer.parseInt(rs.getString("standards"));
                vip = Integer.parseInt(rs.getString("vip"));
                business = Integer.parseInt(rs.getString("business"));
                royal = Integer.parseInt(rs.getString("royal"));
                special = Integer.parseInt(rs.getString("special"));
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(standards,"standard","Standard");
            dataset.setValue(vip,"vip","Vip");
            dataset.setValue(business,"business","Business");
            dataset.setValue(royal,"royal","Royal");
            dataset.setValue(special,"special","Special");
//        
            JFreeChart chart;
            chart = ChartFactory.createBarChart("Số lượng còn (Phòng)", "", "",
                    dataset, PlotOrientation.VERTICAL, false, false, false);
            CategoryPlot catPlot = chart.getCategoryPlot(); 
            catPlot.setRangeGridlinePaint(Color.BLACK);

            ChartPanel chartPanel = new ChartPanel(chart);
            panel.removeAll();
            panel.add(chartPanel , BorderLayout.CENTER);
            panel.validate();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        
        
//        int b = Integer.parseInt(txt_2.getText());
//        int c = Integer.parseInt(txt_3.getText());
//        int d = Integer.parseInt(txt_4.getText());
//        int e = Integer.parseInt(txt_4.getText());
//        
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.setValue(a,"standard","Phòng tiêu chuẩn");
//        dataset.setValue(b,"vip","Phòng cao cấp");
//        dataset.setValue(c,"business","Phòng đặc biệt");
//        dataset.setValue(d,"royal","Phòng thương gia");
//        dataset.setValue(e,"special","Phòng Vip");
//        
//        JFreeChart chart;
//        chart = ChartFactory.createBarChart("Số lượng còn (Phòng)", "", "",
//                dataset, PlotOrientation.VERTICAL, false, false, false);
//        CategoryPlot catPlot = chart.getCategoryPlot(); 
//        catPlot.setRangeGridlinePaint(Color.BLACK);
//        
//        ChartPanel chartPanel = new ChartPanel(chart);
//        panel.removeAll();
//        panel.add(chartPanel , BorderLayout.CENTER);
//        panel.validate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        
    }//GEN-LAST:event_panelMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelComponentShown
        // TODO add your handling code here:                                    
//        int a = Integer.parseInt(txt_1.getText());
        
        Connection con = getConnection();
        Statement st= null;
        int standards = 0;
        int vip = 0;
        int business = 0;
        int royal = 0;
        int special = 0;
        try {
            st = (Statement) con.createStatement();
            String sql = "Select a.standards, b.vip, c.business, d.royal, e.special from (Select count(1) standards from PHONG  where LOAIPHONG = 'standard') a, (Select count(1) vip from PHONG  where LOAIPHONG = 'vip') b, (Select count(1) business from PHONG  where LOAIPHONG = 'business') c, (Select count(1) royal from PHONG  where LOAIPHONG = 'royal') d, (Select count(1) special from PHONG  where LOAIPHONG = 'special') e";
            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                standards = Integer.parseInt(rs.getString("standards"));
                vip = Integer.parseInt(rs.getString("vip"));
                business = Integer.parseInt(rs.getString("business"));
                royal = Integer.parseInt(rs.getString("royal"));
                special = Integer.parseInt(rs.getString("special"));
            }
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(standards,"standard","Phòng tiêu chuẩn");
            dataset.setValue(vip,"vip","Phòng cao cấp");
            dataset.setValue(business,"business","Phòng đặc biệt");
            dataset.setValue(royal,"royal","Phòng thương gia");
            dataset.setValue(special,"special","Phòng Vip");
//        
            JFreeChart chart;
            chart = ChartFactory.createBarChart("Số lượng còn (Phòng)", "", "",
                    dataset, PlotOrientation.HORIZONTAL, false, false, false);
            CategoryPlot catPlot = chart.getCategoryPlot(); 
            catPlot.setRangeGridlinePaint(Color.BLACK);

            ChartPanel chartPanel = new ChartPanel(chart);
            panel.removeAll();
            panel.add(chartPanel , BorderLayout.CENTER);
            panel.validate();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_panelComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
