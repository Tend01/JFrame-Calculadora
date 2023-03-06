/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator_jframe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;





public class calculator extends javax.swing.JFrame {
 
private String cadenaNumeros = "";
private String operacion = "nula";
private double primerNumero, resultado;
private boolean activado = true;
private boolean Punto = true;
    
    
    public calculator() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/calcu.png")).getImage());
        setLocationRelativeTo(null);
    }

    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etMuestra = new javax.swing.JLabel();
        etNumeros = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        igual = new javax.swing.JButton();
        c = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        exponente = new javax.swing.JButton();
        division = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super-Calculator");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etMuestra.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        etMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        etNumeros.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        etNumeros.setForeground(new java.awt.Color(255, 59, 116));
        etNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mL.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(etNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jPanel2.setBackground(new java.awt.Color(253, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        igual.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(250, 250, 250));
        igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/=.png"))); // NOI18N
        igual.setText("=");
        igual.setBorder(null);
        igual.setFocusPainted(false);
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/=.png"))); // NOI18N
        igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/=press.png"))); // NOI18N
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel2.add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 50, 50));

        c.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        c.setForeground(new java.awt.Color(225, 101, 137));
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        c.setText("C");
        c.setBorder(null);
        c.setFocusPainted(false);
        c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btncursor.png"))); // NOI18N
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel2.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        borrar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        borrar.setForeground(new java.awt.Color(225, 101, 137));
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        borrar.setText("«-");
        borrar.setBorder(null);
        borrar.setFocusPainted(false);
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btncursor.png"))); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel2.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, 50));

        exponente.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        exponente.setForeground(new java.awt.Color(225, 101, 137));
        exponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        exponente.setText("(x)²");
        exponente.setBorder(null);
        exponente.setFocusPainted(false);
        exponente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exponente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        exponente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btncursor.png"))); // NOI18N
        exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponenteActionPerformed(evt);
            }
        });
        jPanel2.add(exponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 50, 50));

        division.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        division.setForeground(new java.awt.Color(225, 101, 137));
        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        division.setText("/");
        division.setBorder(null);
        division.setFocusPainted(false);
        division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btncursor.png"))); // NOI18N
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        jPanel2.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 50));

        resta.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        resta.setForeground(new java.awt.Color(225, 101, 137));
        resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        resta.setText("-");
        resta.setBorder(null);
        resta.setFocusPainted(false);
        resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btncursor.png"))); // NOI18N
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        jPanel2.add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 50, 50));

        suma.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        suma.setForeground(new java.awt.Color(225, 101, 137));
        suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        suma.setText("+");
        suma.setBorder(null);
        suma.setFocusPainted(false);
        suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btncursor.png"))); // NOI18N
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        jPanel2.add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 50, 50));

        multiplicacion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        multiplicacion.setForeground(new java.awt.Color(225, 101, 137));
        multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        multiplicacion.setText("x");
        multiplicacion.setAlignmentY(0.0F);
        multiplicacion.setBorder(null);
        multiplicacion.setFocusPainted(false);
        multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btncursor.png"))); // NOI18N
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 50, 50));

        nueve.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        nueve.setForeground(new java.awt.Color(51, 51, 51));
        nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        nueve.setText("9");
        nueve.setBorder(null);
        nueve.setFocusPainted(false);
        nueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        nueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel2.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 50, 50));

        ocho.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        ocho.setForeground(new java.awt.Color(51, 51, 51));
        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        ocho.setText("8");
        ocho.setBorder(null);
        ocho.setFocusPainted(false);
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ocho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        ocho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel2.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 50, 50));

        siete.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        siete.setForeground(new java.awt.Color(51, 51, 51));
        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        siete.setText("7");
        siete.setBorder(null);
        siete.setFocusPainted(false);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        siete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        siete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel2.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        cuatro.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        cuatro.setForeground(new java.awt.Color(51, 51, 51));
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        cuatro.setText("4");
        cuatro.setBorder(null);
        cuatro.setFocusPainted(false);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        cuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel2.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        cinco.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        cinco.setForeground(new java.awt.Color(51, 51, 51));
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        cinco.setText("5");
        cinco.setBorder(null);
        cinco.setFocusPainted(false);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        cinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel2.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 50));

        seis.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        seis.setForeground(new java.awt.Color(51, 51, 51));
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        seis.setText("6");
        seis.setBorder(null);
        seis.setFocusPainted(false);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        seis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel2.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 50, 50));

        tres.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tres.setForeground(new java.awt.Color(51, 51, 51));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        tres.setText("3");
        tres.setBorder(null);
        tres.setFocusPainted(false);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        tres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel2.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 50, 50));

        dos.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dos.setForeground(new java.awt.Color(51, 51, 51));
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        dos.setText("2");
        dos.setBorder(null);
        dos.setFocusPainted(false);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        dos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel2.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 50, 50));

        uno.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        uno.setForeground(new java.awt.Color(51, 51, 51));
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        uno.setText("1");
        uno.setBorder(null);
        uno.setFocusPainted(false);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        uno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel2.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, -1));

        cero.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        cero.setForeground(new java.awt.Color(51, 51, 51));
        cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        cero.setText("0");
        cero.setBorder(null);
        cero.setFocusPainted(false);
        cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel2.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        punto.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        punto.setForeground(new java.awt.Color(51, 51, 51));
        punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        punto.setText(".");
        punto.setBorder(null);
        punto.setFocusPainted(false);
        punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeros.png"))); // NOI18N
        punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numeropress.png"))); // NOI18N
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        jPanel2.add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 320, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
       double segundoNumero;
    switch (operacion) {
        case "nula" -> etNumeros.setText(cadenaNumeros);
        case "sumar" -> {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;
            etNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        case "restar" -> {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;
            etNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        case "dividir" -> {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0 ){
                etNumeros.setText("Syntax Error");
            }else{
                resultado = primerNumero / segundoNumero;
                etNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
        }
        case "multiplicar" -> {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;
            etNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        case "elevar" -> {
            resultado = primerNumero * primerNumero;
            etNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        default -> {
        }
    }
       etMuestra.setText("");
       activado = true;
    }//GEN-LAST:event_igualActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
     etMuestra.setText("");
     etNumeros.setText("");
     operacion = "nula";
     cadenaNumeros = "";
     activado = true;
        
    }//GEN-LAST:event_cActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        int tamaño = cadenaNumeros.length();
        if(tamaño > 0){
            if (tamaño == 1){
                cadenaNumeros = "";
            }else{
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length()-1);
            }
            etNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void exponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponenteActionPerformed
      if (activado == true){
          primerNumero = Double.parseDouble(cadenaNumeros);
          etMuestra.setText(cadenaNumeros + "² ");
          cadenaNumeros = "";
          operacion = "elevar";
          activado = false;
          
      }
    }//GEN-LAST:event_exponenteActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
       if (activado == true){
          primerNumero = Double.parseDouble(cadenaNumeros);
          etMuestra.setText(cadenaNumeros + " / ");
          cadenaNumeros = "";
          operacion = "dividir";
          activado = false;
          
      }
    }//GEN-LAST:event_divisionActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        if (activado == true){
          primerNumero = Double.parseDouble(cadenaNumeros);
          etMuestra.setText(cadenaNumeros + " - ");
          cadenaNumeros = "";
          operacion = "restar";
          activado = false;
          
      }
    }//GEN-LAST:event_restaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
      if (activado == true){
          primerNumero = Double.parseDouble(cadenaNumeros);
          etMuestra.setText(cadenaNumeros + " + ");
          cadenaNumeros = "";
          operacion = "sumar";
          activado = false;
          
      }
    }//GEN-LAST:event_sumaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
    if (activado == true){
          primerNumero = Double.parseDouble(cadenaNumeros);
          etMuestra.setText(cadenaNumeros + " x ");
          cadenaNumeros = "";
          operacion = "multiplicar";
          activado = false;
          
      }
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
      if (etNumeros.getText().equals("0")){
          cadenaNumeros = "9";
      }else{
          cadenaNumeros += "9";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_nueveActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        if (etNumeros.getText().equals("0")){
          cadenaNumeros = "8";
      }else{
          cadenaNumeros += "8";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_ochoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
       if (etNumeros.getText().equals("0")){
          cadenaNumeros = "7";
      }else{
          cadenaNumeros += "7";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_sieteActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
       if (etNumeros.getText().equals("0")){
          cadenaNumeros = "4";
      }else{
          cadenaNumeros += "4";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
       if (etNumeros.getText().equals("0")){
          cadenaNumeros = "5";
      }else{
          cadenaNumeros += "5";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
     if (etNumeros.getText().equals("0")){
          cadenaNumeros = "6";
      }else{
          cadenaNumeros += "6";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_seisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
    if (etNumeros.getText().equals("0")){
          cadenaNumeros = "3";
      }else{
          cadenaNumeros += "3";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_tresActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
     if (etNumeros.getText().equals("0")){
          cadenaNumeros = "2";
      }else{
          cadenaNumeros += "2";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_dosActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
       if (etNumeros.getText().equals("0")){
          cadenaNumeros = "1";
      }else{
          cadenaNumeros += "1";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_unoActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
    if (etNumeros.getText().equals("0")){
          cadenaNumeros = "0";
      }else{
          cadenaNumeros += "0";
      }
      etNumeros.setText(cadenaNumeros);
      activado = true; // voy a poder seguir usando la calculadora
      
    }//GEN-LAST:event_ceroActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
      if(Punto == true){
          if(cadenaNumeros.equals("")){
              cadenaNumeros = "0.";
          }else{
              cadenaNumeros += ".";
          }
          etNumeros.setText(cadenaNumeros);
          Punto = false;
      }
      Punto = false;
    }//GEN-LAST:event_puntoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!modoOscuro){

            jPanel1.setBackground(Color.decode("#2d323a"));
            jPanel2.setBackground(Color.decode("#2b2f37"));
            etMuestra.setForeground(Color.decode("#aaaaad"));

            cambiarColorDarkSignos(c);
            cambiarColorDarkSignos(borrar);
            cambiarColorDarkSignos(suma);
            cambiarColorDarkSignos(resta);
            cambiarColorDarkSignos(division);
            cambiarColorDarkSignos(multiplicacion);
            cambiarColorDarkSignos(exponente);

            cambiarColorDark(punto);
            cambiarColorDark(cero);
            cambiarColorDark(uno);
            cambiarColorDark(dos);
            cambiarColorDark(tres);
            cambiarColorDark(cuatro);
            cambiarColorDark(cinco);
            cambiarColorDark(seis);
            cambiarColorDark(siete);
            cambiarColorDark(ocho);
            cambiarColorDark(nueve);
            
            
            jButton1.setIcon(new ImageIcon(getClass().getResource("/images/mO.png")));
            igual.setIcon(new ImageIcon(getClass().getResource("/images/igualdark.png")));
            igual.setPressedIcon(new ImageIcon(getClass().getResource("/images/igualdark.png")));
            igual.setRolloverIcon(new ImageIcon(getClass().getResource("/images/igualdarkPress.png")));
            igual.setForeground(Color.WHITE);
            modoOscuro = true;
        }else{
            calculator frame = new calculator();
            this.dispose();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    boolean modoOscuro = false;
    
  
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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }
    
    public void cambiarColorDarkSignos(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/signosdark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/signosdark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/signosdarkPress.png")));
        btn.setForeground(Color.decode("#e16589"));
    }
    
    
    
    public void cambiarColorDark(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/numerosdark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/numerosdark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/numerosdarkPress.png")));
        btn.setForeground(Color.decode("#fdfafa"));
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton c;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JLabel etMuestra;
    private javax.swing.JLabel etNumeros;
    private javax.swing.JButton exponente;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables


}
