
package peadburboacalculadoraresistencias;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

//Hecho por:
//Burboa Astorga Ricardo 8IS-01V
//Principios Eléctricos y Aplicaciones Digitales
//Programa Unidad 1 - Calculadora de Resistencias

public class ventana extends javax.swing.JFrame {
    
    Double resultadoResist = 0.0;
    Double resultadoResistK = 0.0;
    Double resultadoResistM = 0.0;
    Integer resultadoTolerancia = 0;
    
    public ventana() {
        initComponents();
        labelEncabezado.requestFocus();
        areaResultados.setEditable(false);
        colorBanda1.setBackground(Color.cyan);
        colorBanda2.setBackground(Color.cyan);
        colorBanda3.setBackground(Color.cyan);
        colorBanda4.setBackground(Color.cyan);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBandas = new javax.swing.JPanel();
        comboBanda1 = new javax.swing.JComboBox<>();
        comboBanda2 = new javax.swing.JComboBox<>();
        comboBanda3 = new javax.swing.JComboBox<>();
        comboBanda4 = new javax.swing.JComboBox<>();
        labelBanda1 = new javax.swing.JLabel();
        labelBanda2 = new javax.swing.JLabel();
        labelBanda3 = new javax.swing.JLabel();
        labelBanda4 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        botonCalcular = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();
        labelValores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResultados = new javax.swing.JTextArea();
        panelCalcularColor = new javax.swing.JPanel();
        campoValorResistencia = new javax.swing.JTextField();
        botonCalcularColor = new javax.swing.JButton();
        labelEncabezado = new javax.swing.JLabel();
        labelAlumno = new javax.swing.JLabel();
        labelMateria = new javax.swing.JLabel();
        colorBanda1 = new javax.swing.JPanel();
        colorBanda2 = new javax.swing.JPanel();
        colorBanda3 = new javax.swing.JPanel();
        colorBanda4 = new javax.swing.JPanel();
        labelResistencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBandas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboBanda1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBanda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Negro", "Marrón", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        comboBanda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBanda1ActionPerformed(evt);
            }
        });

        comboBanda2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBanda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Negro", "Marrón", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        comboBanda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBanda2ActionPerformed(evt);
            }
        });

        comboBanda3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBanda3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Negro", "Marrón", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco", "Dorado", "Plateado" }));
        comboBanda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBanda3ActionPerformed(evt);
            }
        });

        comboBanda4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBanda4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Marrón", "Rojo", "Dorado", "Plateado" }));
        comboBanda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBanda4ActionPerformed(evt);
            }
        });

        labelBanda1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelBanda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBanda1.setText("Primera Banda");

        labelBanda2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelBanda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBanda2.setText("Segunda Banda");

        labelBanda3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelBanda3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBanda3.setText("Tercera Banda");

        labelBanda4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelBanda4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBanda4.setText("Cuarta Banda");

        panelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonCalcular.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoCalcular24p.png"))); // NOI18N
        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        botonReiniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoReiniciar24p.png"))); // NOI18N
        botonReiniciar.setText("Reiniciar");
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCalcular)
                .addGap(18, 18, 18)
                .addComponent(botonReiniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCalcular)
                    .addComponent(botonReiniciar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelValores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelValores.setText("Valor de la Resistencia");

        areaResultados.setColumns(20);
        areaResultados.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        areaResultados.setRows(5);
        jScrollPane1.setViewportView(areaResultados);

        panelCalcularColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        campoValorResistencia.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        campoValorResistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoValorResistenciaKeyTyped(evt);
            }
        });

        botonCalcularColor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonCalcularColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoObtenerColor16p.png"))); // NOI18N
        botonCalcularColor.setText("Obtener Color");
        botonCalcularColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCalcularColorLayout = new javax.swing.GroupLayout(panelCalcularColor);
        panelCalcularColor.setLayout(panelCalcularColorLayout);
        panelCalcularColorLayout.setHorizontalGroup(
            panelCalcularColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalcularColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoValorResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCalcularColor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCalcularColorLayout.setVerticalGroup(
            panelCalcularColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCalcularColorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCalcularColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValorResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalcularColor))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBandasLayout = new javax.swing.GroupLayout(panelBandas);
        panelBandas.setLayout(panelBandasLayout);
        panelBandasLayout.setHorizontalGroup(
            panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBandasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBandasLayout.createSequentialGroup()
                        .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValores)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCalcularColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelBandasLayout.createSequentialGroup()
                        .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBanda1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBanda2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBanda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBanda3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelBanda4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBanda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBandasLayout.setVerticalGroup(
            panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBandasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBanda1)
                    .addComponent(labelBanda2)
                    .addComponent(labelBanda3)
                    .addComponent(labelBanda4))
                .addGap(18, 18, 18)
                .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBanda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBanda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(labelValores)
                .addGap(18, 18, 18)
                .addGroup(panelBandasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBandasLayout.createSequentialGroup()
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCalcularColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBandasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(panelBandas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 291, -1, -1));

        labelEncabezado.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        labelEncabezado.setText("Calculadora de Resistencias");
        getContentPane().add(labelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, -1, -1));

        labelAlumno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelAlumno.setText("Burboa Astorga Ricardo 8IS-01V");
        getContentPane().add(labelAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        labelMateria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelMateria.setText("Principios Eléctricos y Aplicaciones Digitales");
        getContentPane().add(labelMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        colorBanda1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout colorBanda1Layout = new javax.swing.GroupLayout(colorBanda1);
        colorBanda1.setLayout(colorBanda1Layout);
        colorBanda1Layout.setHorizontalGroup(
            colorBanda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        colorBanda1Layout.setVerticalGroup(
            colorBanda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        getContentPane().add(colorBanda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 40, 80));

        colorBanda2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout colorBanda2Layout = new javax.swing.GroupLayout(colorBanda2);
        colorBanda2.setLayout(colorBanda2Layout);
        colorBanda2Layout.setHorizontalGroup(
            colorBanda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        colorBanda2Layout.setVerticalGroup(
            colorBanda2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        getContentPane().add(colorBanda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 40, 80));

        colorBanda3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout colorBanda3Layout = new javax.swing.GroupLayout(colorBanda3);
        colorBanda3.setLayout(colorBanda3Layout);
        colorBanda3Layout.setHorizontalGroup(
            colorBanda3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        colorBanda3Layout.setVerticalGroup(
            colorBanda3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        getContentPane().add(colorBanda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 40, 80));

        colorBanda4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout colorBanda4Layout = new javax.swing.GroupLayout(colorBanda4);
        colorBanda4.setLayout(colorBanda4Layout);
        colorBanda4Layout.setHorizontalGroup(
            colorBanda4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        colorBanda4Layout.setVerticalGroup(
            colorBanda4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        getContentPane().add(colorBanda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 40, 80));

        labelResistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resistencia/imgResistencia.png"))); // NOI18N
        getContentPane().add(labelResistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 850, 139));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        labelEncabezado.requestFocus();
        
        campoValorResistencia.setText("");
        
        String banda1 = comboBanda1.getSelectedItem().toString();
        String banda2 = comboBanda2.getSelectedItem().toString();
        String banda3 = comboBanda3.getSelectedItem().toString();
        String banda4 = comboBanda4.getSelectedItem().toString();
        
        Integer valorBanda1 = 0;
        Integer valorBanda2 = 0;
        Double valorBanda3 = 0.0;
        Integer valorBanda4 = 0;
        
        if (banda1.equals("-Seleccionar-") || banda2.equals("-Seleccionar-") || banda3.equals("-Seleccionar-") || banda4.equals("-Seleccionar-")) {
            JOptionPane.showMessageDialog(null, "Seleccione un color para cada una de las bandas.", "Atención", JOptionPane.INFORMATION_MESSAGE);
        } else {
            valorBanda1 = metodos.getColor(banda1, valorBanda1);
            valorBanda2 = metodos.getColor(banda2, valorBanda2);
            valorBanda3 = metodos.getMultiplicador(banda3, valorBanda3);
            valorBanda4 = metodos.getTolerancia(banda4, valorBanda4);
            
            String concatBanda1Banda2 = String.valueOf(valorBanda1) + String.valueOf(valorBanda2);
            Integer valorAux = Integer.parseInt(concatBanda1Banda2);
            
            resultadoResist = Double.valueOf(valorAux) * valorBanda3;
            resultadoResistK = resultadoResist/1000;
            resultadoResistM = resultadoResist/1000000;
            resultadoTolerancia = valorBanda4;

            metodos.printValores(areaResultados, resultadoResist, resultadoResistK, resultadoResistM, resultadoTolerancia);
        }
    }//GEN-LAST:event_botonCalcularActionPerformed
    
    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        labelEncabezado.requestFocus();
        
        colorBanda1.setBackground(Color.cyan);
        colorBanda2.setBackground(Color.cyan);
        colorBanda3.setBackground(Color.cyan);
        colorBanda4.setBackground(Color.cyan);
        comboBanda1.setSelectedIndex(0);
        comboBanda2.setSelectedIndex(0);
        comboBanda3.setSelectedIndex(0);
        comboBanda4.setSelectedIndex(0);
        areaResultados.setText("");
        campoValorResistencia.setText("");
    }//GEN-LAST:event_botonReiniciarActionPerformed
    
    private void comboBanda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBanda1ActionPerformed
        String banda = comboBanda1.getSelectedItem().toString();
        metodos.pintarBanda(colorBanda1, banda);
        
        labelEncabezado.requestFocus();
    }//GEN-LAST:event_comboBanda1ActionPerformed

    private void comboBanda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBanda2ActionPerformed
        String banda = comboBanda2.getSelectedItem().toString();
        metodos.pintarBanda(colorBanda2, banda);
        
        labelEncabezado.requestFocus();
    }//GEN-LAST:event_comboBanda2ActionPerformed
    
    private void comboBanda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBanda3ActionPerformed
        String banda = comboBanda3.getSelectedItem().toString();
        metodos.pintarBanda(colorBanda3, banda);
        
        labelEncabezado.requestFocus();
    }//GEN-LAST:event_comboBanda3ActionPerformed

    private void comboBanda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBanda4ActionPerformed
        String banda = comboBanda4.getSelectedItem().toString();
        metodos.pintarBanda(colorBanda4, banda);
        
        labelEncabezado.requestFocus();
    }//GEN-LAST:event_comboBanda4ActionPerformed

    private void botonCalcularColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularColorActionPerformed
        labelEncabezado.requestFocus();
        
        String valorResistencia = campoValorResistencia.getText();
        
        if (valorResistencia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Capture el valor de una resistencia.");
            campoValorResistencia.requestFocus();
        } else {
            areaResultados.setText("");
            if (valorResistencia.length() >= 2) {
                if(valorResistencia.charAt(0) == '0') {
                    JOptionPane.showMessageDialog(null, "No puede capturar un número que empiece con 0 si tiene 2 o más caracteres.");
                } else {
                    comboBanda4.setSelectedItem("Dorado");
                    metodos.setColor(valorResistencia, colorBanda1, colorBanda2, colorBanda3, comboBanda1, comboBanda2, comboBanda3);
                }
            } else {
                comboBanda4.setSelectedItem("Dorado");
                metodos.setColor(valorResistencia, colorBanda1, colorBanda2, colorBanda3, comboBanda1, comboBanda2, comboBanda3);
            }
        }
    }//GEN-LAST:event_botonCalcularColorActionPerformed

    private void campoValorResistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoValorResistenciaKeyTyped
        String cadena = Character.toString(evt.getKeyChar()); 
        
        //Ubica los caracteres alfanuméricos y el espacio.
        String soloNumeros = "0123456789";
        Pattern p = Pattern.compile("["+soloNumeros+"]");
        Matcher m = p.matcher(cadena);   
        
        if(!m.find()){ 
            evt.consume(); 
        }
        
        if (campoValorResistencia.getText().length() >= 11) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se admiten hasta 11 caracteres numéricos.");
        }
    }//GEN-LAST:event_campoValorResistenciaKeyTyped
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResultados;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonCalcularColor;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JTextField campoValorResistencia;
    private javax.swing.JPanel colorBanda1;
    private javax.swing.JPanel colorBanda2;
    private javax.swing.JPanel colorBanda3;
    private javax.swing.JPanel colorBanda4;
    private javax.swing.JComboBox<String> comboBanda1;
    private javax.swing.JComboBox<String> comboBanda2;
    private javax.swing.JComboBox<String> comboBanda3;
    private javax.swing.JComboBox<String> comboBanda4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlumno;
    private javax.swing.JLabel labelBanda1;
    private javax.swing.JLabel labelBanda2;
    private javax.swing.JLabel labelBanda3;
    private javax.swing.JLabel labelBanda4;
    private javax.swing.JLabel labelEncabezado;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelResistencia;
    private javax.swing.JLabel labelValores;
    private javax.swing.JPanel panelBandas;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCalcularColor;
    // End of variables declaration//GEN-END:variables
}
