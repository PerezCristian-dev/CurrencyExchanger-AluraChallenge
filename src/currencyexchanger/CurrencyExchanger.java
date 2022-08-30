package currencyexchanger;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author chris
 */
public class CurrencyExchanger extends javax.swing.JFrame {

    /**
     * Creates new form CurrencyExchanger
     */
    public CurrencyExchanger() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        currencyFrom = new javax.swing.JComboBox<>();
        currencyTo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        importe = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultBox = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        changeTypeBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Convertir de");

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAMBIO DE DIVISAS");

        currencyFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD - Dolar", "EUR - Euro", "MXN - Peso Mexicano", "RDP - Peso Dominicano", "COP - Peso Colombiano", "ARS - Peso Argentino", "PEN - Soles", "CLP - Peso Chileno", " " }));

        currencyTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD - Dolar", "EUR - Euro", "MXN - Peso Mexicano", "RDP - Peso Dominicano", "COP - Peso Colombiano", "ARS - Peso Argentino", "PEN - Soles", "CLP - Peso Chileno", " " }));

        jScrollPane1.setViewportView(importe);

        jLabel3.setText("Cantidad a Convertir");

        jScrollPane4.setViewportView(resultBox);

        jLabel4.setText("Total:");

        changeTypeBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        changeTypeBox.setText("USD - Dolar = 0,99 EUR");
        changeTypeBox.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Moneda 1");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Moneda 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(164, 164, 164))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(currencyFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(currencyTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4))
                            .addComponent(changeTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currencyFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                               
        
           
              List <Object> moneda = new ArrayList();
              
              String From = currencyFrom.getSelectedItem().toString();
              String To = currencyTo.getSelectedItem().toString();
              changeTypeBox.setText("De " + From + " a " + To);
              
              From = From.substring(0, 3);
              To = To.substring(0, 3);
              

    
              moneda.add(new Currency("USD", 1));
              moneda.add(new Currency("EUR", 0.99962536));
              moneda.add(new Currency("MXN", 0.049953955));
              moneda.add(new Currency("RDP", 0.018737297));
              moneda.add(new Currency("COP", 0.00022891031));
              moneda.add(new Currency("ARS", 0.0072304977));
              moneda.add(new Currency("PEN", 0.26094033));
              moneda.add(new Currency("CLP", 0.0011324706));
              
              
              Currency monedaRef;
              int index;
              double valor1;
              double valor2;
              
// USD - 0
// EUR - 1
// MXN - 2
// RDP - 3
// COP - 4
// ARS - 5
// PEN - 6
// CLP - 7
              System.out.println(From);
              
              switch(From){
                case "USD":
                index = 0;
                 System.out.println(From);
                monedaRef = (Currency) moneda.get(index);
                valor1 = monedaRef.getValue();
                break;
                
                
                case "EUR":
                index = 1;
                monedaRef = (Currency) moneda.get(index);
                valor1 = monedaRef.getValue();
                break;
                case "MXN":
                index = 2;
                monedaRef = (Currency) moneda.get(index);
                valor1 = monedaRef.getValue();
                break;
                case "RDP":
                index = 3;
                monedaRef = (Currency) moneda.get(index);
                valor1 = monedaRef.getValue();
                break;
                
                case "COP":
                index = 4;
                monedaRef = (Currency) moneda.get(index);
                valor1 = monedaRef.getValue();
                break;
                
                case "ARS":
                index = 5;
                monedaRef = (Currency) moneda.get(index);
                valor1 = monedaRef.getValue();
                break;
                case "PEN":
                index = 6;
                monedaRef = (Currency) moneda.get(index);
                valor1 = monedaRef.getValue();
                break;
                
                case "CLP":
                index = 7;
                monedaRef = (Currency) moneda.get(index);
                valor1 = monedaRef.getValue();
                break;
                
                default:
                index = 0;
                 monedaRef = (Currency) moneda.get(index);
                 valor1 = monedaRef.getValue();
              }

             switch(To){
                case (String)"USD":
                index = 0;
                monedaRef = (Currency) moneda.get(index);
                valor2 = monedaRef.getValue();
                break;
                case "EUR":
                index = 1;
                monedaRef = (Currency) moneda.get(index);
                valor2 = monedaRef.getValue();
                break;
                case "MXN":
                index = 2;
                monedaRef = (Currency) moneda.get(index);
                valor2 = monedaRef.getValue();
                break;
                case "RDP":
                index = 3;
                monedaRef = (Currency) moneda.get(index);
                valor2 = monedaRef.getValue();
                break;
                case "COP":
                index = 4;
                monedaRef = (Currency) moneda.get(index);
                valor2 = monedaRef.getValue();
                break;
                
                case "ARS":
                index = 5;
                monedaRef = (Currency) moneda.get(index);
                valor2 = monedaRef.getValue();
                break;
                case "PEN":
                index = 6;
                monedaRef = (Currency) moneda.get(index);
                valor2 = monedaRef.getValue();
                break;            
                case "CLP":
                index = 7;
                monedaRef = (Currency) moneda.get(index);
                valor2 = monedaRef.getValue();
                break;
                default:
                index = 0;
                 monedaRef = (Currency) moneda.get(index);
                 valor2 = monedaRef.getValue();
              }

    
              
           System.out.println("valor 1 " + valor1 + " Valor 2 " + valor2);
   
              double valor = (valor1/valor2);
              double cantidad = Double.parseDouble(importe.getText());
              double resultado = cantidad * valor;
              
              DecimalFormat dFormat = new DecimalFormat("#0.00");
              System.out.println(From);
              resultBox.setText(To+"$: " + dFormat.format(resultado));
              
              
    }                                        

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
            java.util.logging.Logger.getLogger(CurrencyExchanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyExchanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyExchanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyExchanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CurrencyExchanger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JTextField changeTypeBox;
    public javax.swing.JComboBox<String> currencyFrom;
    public javax.swing.JComboBox<String> currencyTo;
    public javax.swing.JTextPane importe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextPane resultBox;
    // End of variables declaration                   
}