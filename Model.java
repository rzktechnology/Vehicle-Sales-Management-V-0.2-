/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclesalesmanagement;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author it17153232
 */
public class Model extends javax.swing.JFrame {

    /**
     * Creates new form Model
     */
    public Model() {

        initComponents();
        comboreadAdd();
        typecombo();

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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2020 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Model  Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 160, 27));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Brand" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 280, 60));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 150, 240, 60));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Capacity", "1000", "1300", "1500", "1600", "1800", "2000", "2500", "2750", "3000" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 220, 240, 60));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 290, 240, 60));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 240, 60));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 240, 60));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Capacity", "1000", "1300", "1500", "1600", "1800", "2000", "2500", "2750", "3000" }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 240, 60));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type" }));
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 240, 60));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 140, 260, 300));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Add Panel");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, -1));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 260, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 40, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("        Add Model");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 460, 260, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Update Panel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model " }));
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 150, 240, 60));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 260, 300));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Delete Panel");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));

        jLabel2020.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-repeat-once.png"))); // NOI18N
        jPanel1.add(jLabel2020, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 50, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trash.gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 50, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 260, 60));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 460, 260, 60));

        jButton4.setText("Add Demo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jButton5.setText("update demo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        modelReder();
        DeletemodelReder();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            
            ResultSet model_rs = Database.getData("SELECT * FROM model WHERE model.model = '"+jTextField1.getText()+"'");
            
            if(model_rs.next()){
            JOptionPane.showMessageDialog(null, "This model already in the system!");
            }else{
            
          
                try {
            
        
       // ResultSet model_rs = Database.getData("SELECT * FROM model WHERE model.model = '"+jTextField1.getSelectedText()+"'");
       /*else if(model_rs.next()){
            JOptionPane.showMessageDialog(null, "This brand already in the system!");
        }*/ 
        
        
        
        if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Select Brand")) {

            JOptionPane.showMessageDialog(null, "Select the brand type!");

        } else if (jTextField1.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "insert model name!");

        } else if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("Select Capacity")){
        
        JOptionPane.showMessageDialog(null, "Select the capcity type!");
        
        
        }else if(jComboBox3.getSelectedItem().toString().equalsIgnoreCase("Select Type")){
        
        JOptionPane.showMessageDialog(null, "Select the vehicle type!");
        
        }else{
            
            
            
          
            
            
            
            
            
            
            
            
            
            
            

            try {

                Database.setData("insert into model(bid,model,engCap,type) values((select bid from Brand where Brand_name='" + jComboBox1.getSelectedItem() + "'),'" + jTextField1.getText() + "','" + jComboBox2.getSelectedItem() + "','" + jComboBox3.getSelectedItem() + "')");
                JOptionPane.showMessageDialog(null, "Model Succesfully Added to System");
                jTextField1.setText(null);
                capasityLoder();
                typecombo();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        modelReder();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
                
                
                
                
                
                
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        
            
            
            
            
                if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Select Brand")) {

            JOptionPane.showMessageDialog(null, "Select the brand type!");

        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("Select Capacity")) {

            JOptionPane.showMessageDialog(null, "Select the Engine Capacity!");

        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("Select Type")) {

            JOptionPane.showMessageDialog(null, "Select the type of vehicle!");
        } else if (jTextField2.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Enter new model name!");
        } else {

            try {
                Database.setData("UPDATE vehicle set vehicle.model='" + jTextField2.getText() + "' WHERE vehicle.model='" + jComboBox4.getSelectedItem() + "' ");
                Database.setData("UPDATE model SET model.model='" + jTextField2.getText() + "',model.engCap='" + jComboBox5.getSelectedItem() + "',model.type='" + jComboBox6.getSelectedItem() + "' WHERE model.model ='" + jComboBox4.getSelectedItem() + "'");
                JOptionPane.showMessageDialog(null, "Model Succesfully Updated to System!");
                jTextField1.setText(null);
                modelReder();
                jTextField2.setText("");
                typecombo();
                capasityLoder();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
            
            
        
        
        
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased

        if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("Select Model")) {

            JOptionPane.showMessageDialog(null, "please select model name before edit!");
        }else if(simbleValidation(jTextField2.getText())==false){
        
            JOptionPane.showMessageDialog(null, "Invalide Input!");
        }
        
        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {

            ResultSet model_rs = Database.getData("SELECT *  FROM vehicle WHERE vehicle.model='" + jComboBox7.getSelectedItem() + "'");

            if (model_rs.next()) {

                ResultSet model_rs1 = Database.getData("SELECT *  FROM vehicle WHERE vehicle.model='" + jComboBox7.getSelectedItem() + "'");
                while (model_rs1.next()) {
                    String model = model_rs1.getString(4);
                    ResultSet capType_rs = Database.getData("SELECT model.engCap,model.type FROM model WHERE model.model='" + model + "'");
                    if (capType_rs.next()) {

                        Database.setData("insert into removevehi(status,brand,modelYear,model,engNum,engCap,mileage,chassisNum,sPrice,vImage,discription,type,regNum,vBoolImg,cost_price) values('Delete','" + model_rs1.getString(2) + "','" + model_rs1.getString(3) + "','" + model + "','" + model_rs1.getString(5) + "','" + capType_rs.getString(1) + "','" + model_rs1.getString(6) + "','" + model_rs1.getString(7) + "','" + model_rs1.getString(8) + "','" + model_rs1.getString(9) + "','" + model_rs1.getString(10) + "','" + capType_rs.getString(2) + "','" + model_rs1.getString(11) + "','" + model_rs1.getString(12) + "','" + model_rs1.getString(15) + "')");
                    }

                }
                //System.out.println("Down");
                Database.setData("DELETE  FROM vehicle WHERE vehicle.model='" + jComboBox7.getSelectedItem() + "'");
            }

            Database.setData("DELETE FROM model WHERE model.model='" + jComboBox7.getSelectedItem() + "'");
            JOptionPane.showMessageDialog(null, "Model has been deleted!");

            DeletemodelReder();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(simbleValidation(jTextField1.getText())==false){
        
            JOptionPane.showMessageDialog(null, "Invalide Input!");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("CIVIC");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField2.setText("PRIUS123");
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {

            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());

        } catch (Exception e) {
            e.printStackTrace();

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Model().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2020;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void comboreadAdd() {

        try {
            ResultSet rs = Database.getData("select Brand_name from Brand");
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("Brand_name"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void typecombo() {
        jComboBox3.removeAllItems();
        jComboBox3.addItem("Select Type");
        jComboBox3.addItem("Car");
        jComboBox3.addItem("Van");
        jComboBox3.addItem("Bus");
        jComboBox3.addItem("Truck");
        jComboBox3.addItem("Lorry");
        jComboBox3.addItem("Jeep");

        jComboBox6.removeAllItems();
        jComboBox6.addItem("Select Type");
        jComboBox6.addItem("Car");
        jComboBox6.addItem("Van");
        jComboBox6.addItem("Bus");
        jComboBox6.addItem("Truck");
        jComboBox6.addItem("Lorry");
        jComboBox6.addItem("Jeep");
    }

    private void modelReder() {

        jComboBox4.removeAllItems();
        jComboBox4.addItem("Select Model");
        String s = null;
        try {

            ResultSet rs1 = Database.getData("select bid from brand where Brand_name='" + jComboBox1.getSelectedItem() + "'");

            //System.out.println(s);
            if (rs1.next()) {

                s = rs1.getString("bid");
                //System.out.println(s);

            }

            ResultSet rs = Database.getData("select m.model from brand b,model m where m.bid='" + s + "' group by m.bid,m.model");

            while (rs.next()) {

                jComboBox4.addItem(rs.getString("m.model"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void capasityLoder() {

        jComboBox5.removeAllItems();
        jComboBox5.addItem("Select Capacity");
        jComboBox5.addItem("1000");
        jComboBox5.addItem("1300");
        jComboBox5.addItem("1500");
        jComboBox5.addItem("1600");
        jComboBox5.addItem("1800");
        jComboBox5.addItem("2000");
        jComboBox5.addItem("2500");
        jComboBox5.addItem("2750");
        jComboBox5.addItem("3000");

        jComboBox2.removeAllItems();
        jComboBox2.addItem("Select Capacity");
        jComboBox2.addItem("1000");
        jComboBox2.addItem("1300");
        jComboBox2.addItem("1500");
        jComboBox2.addItem("1600");
        jComboBox2.addItem("1800");
        jComboBox2.addItem("2000");
        jComboBox2.addItem("2500");
        jComboBox2.addItem("2750");
        jComboBox2.addItem("3000");

    }

    private void DeletemodelReder() {

        jComboBox7.removeAllItems();
        jComboBox7.addItem("Select Model");
        String s = null;
        try {

            ResultSet rs1 = Database.getData("select bid from brand where Brand_name='" + jComboBox1.getSelectedItem() + "'");

            //System.out.println(s);
            if (rs1.next()) {

                s = rs1.getString("bid");
                //System.out.println(s);

            }

            ResultSet rs = Database.getData("select m.model from brand b,model m where m.bid='" + s + "' group by m.bid,m.model");

            while (rs.next()) {

                jComboBox7.addItem(rs.getString("m.model"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean simbleValidation(String text){
    
        char invalidList[] = {'+','*','-','`','~','!','@','#','$','%','^','&','*','(',')','+','=','[',']','{','}',';',':','"',',','.','<','>','/','?'};
        int y = invalidList.length;
        
        
        char currentText[] = text.toCharArray();
        int x = currentText.length;
        
        for(int i=0;i<x;i++){
        
            for(int r=0;r<y;r++){
                
                if(currentText[i]==invalidList[r]){
                    return false;
                }
            }
        
            
        }
        return true;
    }
}
