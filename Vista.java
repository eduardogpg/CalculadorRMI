import java.rmi.*;
import java.util.Scanner;

public class Vista extends javax.swing.JFrame {

    private int valorUno;
    private int valorDos;
    private int resultado;
    
    private boolean operador = false;
    private boolean comenzar = false;
  
    private String OperadorArietmetico;
    private String rutaObligatoria = "rmi://";

    public Vista() {

    
        System.out.println("Dirección Servidor : ");
        Scanner entrada = new Scanner(System.in);
        String ruta = entrada.next();
        System.out.println( ruta );

        this.rutaObligatoria = this.rutaObligatoria + ruta;

        initComponents();
        this.jLabel1.setText("");


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Resultado");

        jButton1.setText(" 1 ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(" 2 ");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(" 3 ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(" 4 ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(" 5 ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(" 6 ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(" 7 ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText(" 8 ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(" 9 ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText(" = ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText(" + ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText(" - ");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText(" * ");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText(" / ");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("C");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Creditos");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText(" 0 ");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton17)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton16)))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

























                                      
    private void agregarJLabe(String valor){
        
        String valorJLabel = this.jLabel1.getText();
        valorJLabel = valorJLabel + valor;
        this.jLabel1.setText(valorJLabel);
        
    }
                
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (this.operador == false){
           this.valorUno = Integer.parseInt( this.jLabel1.getText() );
           this.OperadorArietmetico = "+";
           this.limpiarJLabel();
           this.operador = true;
        }
        
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.comenzar == false)
            this.agregarJLabe("1");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("1");
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.comenzar == false)
            this.agregarJLabe("2");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("2");
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.comenzar == false)
            this.agregarJLabe("3");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("3");
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.comenzar == false)
            this.agregarJLabe("4");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("4");
        }
    }  

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.comenzar == false)
            this.agregarJLabe("5");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("5");
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.comenzar == false)
            this.agregarJLabe("6");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("6");
        }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.comenzar == false)
            this.agregarJLabe("7");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("7");
        }

    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if(this.comenzar == false)
            this.agregarJLabe("8");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("8");
        }
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.comenzar == false)
            this.agregarJLabe("9");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("9");
        }
    }                                        

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        if (this.operador == false){
            this.valorUno = Integer.parseInt( this.jLabel1.getText() );
            this.limpiarJLabel();
             this.OperadorArietmetico = "-";
            this.operador = true;
        }
        
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (this.operador == false){
            this.valorUno = Integer.parseInt( this.jLabel1.getText() );
             this.OperadorArietmetico = "*";
           this.limpiarJLabel();
           this.operador = true;
        }
        

    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       if (this.operador == false){
           this.valorUno = Integer.parseInt( this.jLabel1.getText() );
           this.limpiarJLabel();
            this.OperadorArietmetico = "/";
           this.operador = true;
        }
        
        

    }                                         
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        if(this.comenzar == false)
            this.agregarJLabe("0");
        else{
            this.Restablecer();
            this.comenzar = false;
            this.agregarJLabe("0");
        }

    }  
    
    
    private boolean CreditosA = false;
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        if(this.CreditosA== false){
            System.out.println("\n\nUniversidad Politecnica de Chiapas");
            System.out.println("Eduardo Ismael García Pérez    113015");
            System.out.println("Igenieria Desarrollo SOftware 9-A");
            System.out.println("Arquitectura Orientada a Servicios, RMI");
            System.out.println("Tuxtla GTZ, 29 de mayo 2014");
            System.out.println("Catedratido : Dr. Juan Carlos López Pimentel\n\n");
            this.CreditosA = true;
        }
    }


    private void limpiarJLabel(){
        this.jLabel1.setText("");
    }
        
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(this.operador){
            
            try{
                this.valorDos = Integer.parseInt( this.jLabel1.getText() );
            }catch(Exception e){ 
                System.out.println("Hubo un problema, restableciendo valores");
                this.Restablecer();
            }
            this.limpiarJLabel();
            
            try{
                //Calculadora cal = (Calculadora)Naming.lookup("rmi://localhost:1099/Calculadora");
             
            Calculadora cal = (Calculadora)Naming.lookup(this.rutaObligatoria );
              
                int resultado = 0;
                    
                    if( this.OperadorArietmetico.equals("+"))
                        resultado = cal.suma(this.valorUno, this.valorDos);
                    else if( this.OperadorArietmetico.equals("-"))
                        resultado = cal.resta(this.valorUno, this.valorDos);
                    else if ( this.OperadorArietmetico.equals("/"))
                        resultado = cal.dividir(this.valorUno, this.valorDos);
                    else if ( this.OperadorArietmetico.equals("*"))
                        resultado = cal.multiplicar(this.valorUno, this.valorDos);
                    

                    this.jLabel1.setText( Integer.toString(resultado) );

            }catch(Exception e){
                System.out.println("Ha Ocurrido un error , lo sentimos ");
                System.out.println(e);
            
            }

            this.comenzar = true;
            this.operador = false;
        }
           
    }                                         
    private void Restablecer(){
        this.limpiarJLabel();
        this.valorUno = 0;
        this.valorDos = 0;
        this.operador = false;
        this.comenzar = false;
    }
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Restablecer();
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
