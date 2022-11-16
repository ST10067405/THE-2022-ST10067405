
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jaime - ST10067405
 */
public class Travel extends javax.swing.JFrame {

    /*reference(s): 
     * 1 - Java-Programming-9th-Edition by Joyce Ferrell
     */
    public Travel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        START_COMBOBOX = new javax.swing.JComboBox<>();
        END_COMBOBOX = new javax.swing.JComboBox<>();
        TRAVEL_COMBOBOX = new javax.swing.JComboBox<>();
        SUBMIT_BUTTON = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travel Log");
        setResizable(false);

        jLabel1.setText("Start Location:");

        jLabel2.setText("End Location:");

        jLabel3.setText("Travel By:");

        START_COMBOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Port Elizabeth" }));

        END_COMBOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Port Elizabeth" }));

        TRAVEL_COMBOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Airplane", "Train" }));

        SUBMIT_BUTTON.setText("SUBMIT");
        SUBMIT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMIT_BUTTONActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(START_COMBOBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(END_COMBOBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TRAVEL_COMBOBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(SUBMIT_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(START_COMBOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(END_COMBOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TRAVEL_COMBOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(SUBMIT_BUTTON)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SUBMIT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMIT_BUTTONActionPerformed
        //SUBMIT BUTTON
        //invoking submit and print methods
        writeToFile();
        readFromFile();
    }//GEN-LAST:event_SUBMIT_BUTTONActionPerformed

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
            java.util.logging.Logger.getLogger(Travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Travel().setVisible(true);
            }
        });
    }

    public void writeToFile() {

        //Prevention of same location
        if (START_COMBOBOX.getSelectedItem().equals(END_COMBOBOX.getSelectedItem())) {
            //JOP for error message
            JOptionPane.showMessageDialog(null, "Destinations cannot be the same!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            //trycatch for any exceptions to occur
            try {
                //buffered writter object with filewriter passed to constructor
                BufferedWriter bw = new BufferedWriter(new FileWriter("travel.txt", true));

                //inputting text to file
                bw.write("" + START_COMBOBOX.getSelectedItem());
                bw.newLine();
                bw.write("" + END_COMBOBOX.getSelectedItem());
                bw.newLine();
                bw.write("" + TRAVEL_COMBOBOX.getSelectedItem());
                bw.newLine();

                //closing stream
                bw.close();

            } catch (Exception e) {
                //JOP for error message
                JOptionPane.showMessageDialog(null, "File not found.", "ERROR", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }

    public void readFromFile() {
        try {
            //scanner to read the file
            Scanner kb = new Scanner(new File("travel.txt"));
            
            //display variable
            String display = "TRAVEL LOG\n********************************";
            
            //while loop to print each line
            while (kb.hasNextLine()) {
                //test
                jTextArea1.setText(display += "\nDestination 1: " + kb.nextLine()
                        + "\nDestination 2: " + kb.nextLine()
                        + "\nTravel By: " + kb.nextLine() 
                        + "\n********************************");
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not found.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> END_COMBOBOX;
    private javax.swing.JComboBox<String> START_COMBOBOX;
    private javax.swing.JButton SUBMIT_BUTTON;
    private javax.swing.JComboBox<String> TRAVEL_COMBOBOX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}