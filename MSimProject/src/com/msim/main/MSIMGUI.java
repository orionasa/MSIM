/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msim.main;

import com.msim.control.Builder;
import com.msim.control.Runner;
import com.msim.control.UIControl;
import com.msim.register.Register;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.JTableHeader;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author SONER OKUR & ABDUSSAMED ASLAN 
 */
public class MSIMGUI extends javax.swing.JFrame {

    private String[] instructions;
    private final UIControl uiControl;
    private final Register register;
    private final Builder builder;
    private final Label label;
    private final Ram ram;
    private Runner runner;
    private boolean slashControl;
    private int xMouse;
    private int yMouse;

    public MSIMGUI() {
        this.slashControl = false;
        this.uiControl = new UIControl();
        this.register = new Register();
        this.builder = new Builder();
        this.label = new Label();
        this.ram = new Ram();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openButton = new javax.swing.JLabel();
        saveButton = new javax.swing.JLabel();
        buildButton = new javax.swing.JLabel();
        runButton = new javax.swing.JLabel();
        clearButton = new javax.swing.JLabel();
        loadRam = new javax.swing.JLabel();
        address2 = new javax.swing.JTextField();
        address1 = new javax.swing.JTextField();
        marText = new javax.swing.JTextField();
        pcText = new javax.swing.JTextField();
        inRegText = new javax.swing.JTextField();
        mbrText = new javax.swing.JTextField();
        irText = new javax.swing.JTextField();
        outRegText = new javax.swing.JTextField();
        acText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        memoryTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        outputPane = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        exitButton = new javax.swing.JLabel();
        hideButton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/msim/icons/open.png"))); // NOI18N
        openButton.setToolTipText("Open");
        openButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                openButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                openButtonMouseReleased(evt);
            }
        });
        getContentPane().add(openButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/msim/icons/save.png"))); // NOI18N
        saveButton.setToolTipText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveButtonMouseReleased(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        buildButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/msim/icons/build.png"))); // NOI18N
        buildButton.setToolTipText("Build");
        buildButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buildButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buildButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buildButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buildButtonMouseReleased(evt);
            }
        });
        getContentPane().add(buildButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        runButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/msim/icons/run.png"))); // NOI18N
        runButton.setToolTipText("Run");
        runButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        runButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                runButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                runButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                runButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                runButtonMouseReleased(evt);
            }
        });
        getContentPane().add(runButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/msim/icons/clear.png"))); // NOI18N
        clearButton.setToolTipText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearButtonMouseReleased(evt);
            }
        });
        getContentPane().add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        loadRam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/msim/icons/loadram.png"))); // NOI18N
        loadRam.setToolTipText("Load Ram");
        loadRam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadRamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadRamMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loadRamMouseReleased(evt);
            }
        });
        getContentPane().add(loadRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        address2.setEditable(false);
        address2.setBackground(new java.awt.Color(46, 68, 80));
        address2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        address2.setForeground(new java.awt.Color(255, 255, 255));
        address2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address2.setText("000");
        address2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        address2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        address2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                address2FocusGained(evt);
            }
        });
        address2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                address2KeyReleased(evt);
            }
        });
        getContentPane().add(address2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 618, 46, -1));

        address1.setEditable(false);
        address1.setBackground(new java.awt.Color(46, 68, 80));
        address1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        address1.setForeground(new java.awt.Color(255, 255, 255));
        address1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address1.setText("000");
        address1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        address1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        address1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                address1FocusGained(evt);
            }
        });
        address1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                address1KeyReleased(evt);
            }
        });
        getContentPane().add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 618, 46, -1));

        marText.setEditable(false);
        marText.setBackground(new java.awt.Color(46, 68, 80));
        marText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        marText.setForeground(new java.awt.Color(255, 255, 255));
        marText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        marText.setText("000");
        marText.setToolTipText("Memory Address Register");
        marText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(marText, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 565, 46, -1));

        pcText.setEditable(false);
        pcText.setBackground(new java.awt.Color(46, 68, 80));
        pcText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pcText.setForeground(new java.awt.Color(255, 255, 255));
        pcText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pcText.setText("000");
        pcText.setToolTipText("Program Counter");
        pcText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(pcText, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 540, 46, -1));

        inRegText.setEditable(false);
        inRegText.setBackground(new java.awt.Color(46, 68, 80));
        inRegText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inRegText.setForeground(new java.awt.Color(255, 255, 255));
        inRegText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inRegText.setText("0000");
        inRegText.setToolTipText("Input Register");
        inRegText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        inRegText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inRegText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inRegTextFocusGained(evt);
            }
        });
        inRegText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inRegTextKeyReleased(evt);
            }
        });
        getContentPane().add(inRegText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 50, -1));

        mbrText.setEditable(false);
        mbrText.setBackground(new java.awt.Color(46, 68, 80));
        mbrText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mbrText.setForeground(new java.awt.Color(255, 255, 255));
        mbrText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mbrText.setText("0000");
        mbrText.setToolTipText("Memory Buffer Register");
        mbrText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(mbrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 565, 50, -1));

        irText.setEditable(false);
        irText.setBackground(new java.awt.Color(46, 68, 80));
        irText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        irText.setForeground(new java.awt.Color(255, 255, 255));
        irText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        irText.setText("0000");
        irText.setToolTipText("Instruction Register");
        irText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(irText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 50, -1));

        outRegText.setEditable(false);
        outRegText.setBackground(new java.awt.Color(46, 68, 80));
        outRegText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        outRegText.setForeground(new java.awt.Color(255, 255, 255));
        outRegText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outRegText.setText("0000");
        outRegText.setToolTipText("Output Register");
        outRegText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(outRegText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 565, 50, -1));

        acText.setEditable(false);
        acText.setBackground(new java.awt.Color(46, 68, 80));
        acText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        acText.setForeground(new java.awt.Color(255, 255, 255));
        acText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acText.setText("0000");
        acText.setToolTipText("Accumulator");
        acText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(acText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 50, -1));

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane2.getViewport().setBackground(new java.awt.Color(51,51,51));

        labelTable.setBackground(new java.awt.Color(46, 68, 80));
        labelTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTable.setForeground(new java.awt.Color(255, 255, 255));
        JTableHeader header = labelTable.getTableHeader();
        header.setBackground(new java.awt.Color(51,51,51));
        header.setForeground(Color.white);
        header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        labelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address"
            }
        ));
        labelTable.setAutoCreateRowSorter(true);
        labelTable.setOpaque(false);
        jScrollPane2.setViewportView(labelTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 338, 202, 150));

        jScrollPane3.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane3.getViewport().setBackground(new java.awt.Color(51,51,51));

        memoryTable.setBackground(new java.awt.Color(46, 68, 80));
        memoryTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        memoryTable.setForeground(new java.awt.Color(255, 255, 255));
        JTableHeader header2 = memoryTable.getTableHeader();
        header2.setBackground(new java.awt.Color(51,51,51));
        header2.setForeground(Color.white);
        header2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        memoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Data"
            }
        ));
        memoryTable.setAutoCreateRowSorter(true);
        memoryTable.setOpaque(false);
        jScrollPane3.setViewportView(memoryTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 90, 202, 191));

        jScrollPane4.setBorder(null);

        outputPane.setEditable(false);
        outputPane.setBackground(new java.awt.Color(18, 31, 48));
        outputPane.setBorder(null);
        outputPane.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        outputPane.setForeground(new java.awt.Color(255, 255, 255));
        outputPane.setToolTipText("outputPane");
        jScrollPane4.setViewportView(outputPane);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 532, 392, 128));

        jScrollPane1.setBorder(null);

        textPane.setBackground(new java.awt.Color(18, 31, 48));
        textPane.setBorder(null);
        textPane.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        textPane.setForeground(new java.awt.Color(255, 255, 255));
        textPane.setToolTipText("textPane");
        textPane.setCaretColor(new java.awt.Color(255, 204, 0));
        textPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPaneKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(textPane);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 76, 511, 412));

        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitButtonMouseReleased(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 10, 20, 20));

        hideButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideButtonMouseReleased(evt);
            }
        });
        getContentPane().add(hideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 20, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/msim/icons/GUI.png"))); // NOI18N
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        saveButton.setLocation(saveButton.getX(), saveButton.getY() + 2);
    }//GEN-LAST:event_saveButtonMouseEntered

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        saveButton.setLocation(saveButton.getX(), saveButton.getY() - 2);
    }//GEN-LAST:event_saveButtonMouseExited

    private void openButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openButtonMouseEntered
        openButton.setLocation(openButton.getX(), openButton.getY() + 2);
    }//GEN-LAST:event_openButtonMouseEntered

    private void openButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openButtonMouseExited
        openButton.setLocation(openButton.getX(), openButton.getY() - 2);
    }//GEN-LAST:event_openButtonMouseExited

    private void buildButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buildButtonMouseEntered
        buildButton.setLocation(buildButton.getX(), buildButton.getY() + 2);
    }//GEN-LAST:event_buildButtonMouseEntered

    private void buildButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buildButtonMouseExited
        buildButton.setLocation(buildButton.getX(), buildButton.getY() - 2);
    }//GEN-LAST:event_buildButtonMouseExited

    private void runButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runButtonMouseEntered
        runButton.setLocation(runButton.getX(), runButton.getY() + 2);
    }//GEN-LAST:event_runButtonMouseEntered

    private void runButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runButtonMouseExited
        runButton.setLocation(runButton.getX(), runButton.getY() - 2);
    }//GEN-LAST:event_runButtonMouseExited

    private void clearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseEntered
        clearButton.setLocation(clearButton.getX(), clearButton.getY() + 2);
    }//GEN-LAST:event_clearButtonMouseEntered

    private void clearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseExited
        clearButton.setLocation(clearButton.getX(), clearButton.getY() - 2);
    }//GEN-LAST:event_clearButtonMouseExited

    private void textPaneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPaneKeyReleased

        SimpleAttributeSet set = new SimpleAttributeSet();
        if (evt.getKeyChar() == '/') {
            StyleConstants.setForeground(set, Color.GREEN);
            textPane.setCharacterAttributes(set, true);
            uiControl.changeTextColor("/", Color.green, textPane);
            slashControl = true;
        }
        if (evt.getKeyChar() == '\n') {
            StyleConstants.setForeground(set, Color.WHITE);
            textPane.setCharacterAttributes(set, true);
            slashControl = false;
        }
        if (!slashControl) {
            for (String instruction : builder.getInstruction()) {
                uiControl.changeTextColor(instruction, Color.orange, textPane);
            }
            for (String insI : builder.getInsI()) {
                uiControl.changeTextColor(insI, Color.orange, textPane);
            }

            for (String x : builder.getLabels()) {
                uiControl.changeTextColor(x, Color.green, textPane);
            }
            for (String x : builder.getPscode()) {
                uiControl.changeTextColor(x, Color.red, textPane);
            }

            StyleConstants.setForeground(set, Color.WHITE);
            textPane.setCharacterAttributes(set, true);
        }
    }//GEN-LAST:event_textPaneKeyReleased

    private void address1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address1FocusGained
        address1.setText("");
    }//GEN-LAST:event_address1FocusGained

    private void address2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address2FocusGained
        address2.setText("");
    }//GEN-LAST:event_address2FocusGained

    private void inRegTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inRegTextFocusGained
        inRegText.setText("");
    }//GEN-LAST:event_inRegTextFocusGained

    private void inRegTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inRegTextKeyReleased
        uiControl.filterInput(inRegText, evt, 4);
    }//GEN-LAST:event_inRegTextKeyReleased

    private void address1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_address1KeyReleased
        uiControl.filterInput(address1, evt, 3);
    }//GEN-LAST:event_address1KeyReleased

    private void address2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_address2KeyReleased
        uiControl.filterInput(address2, evt, 3);
    }//GEN-LAST:event_address2KeyReleased

    private void loadRamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadRamMouseEntered
        loadRam.setLocation(loadRam.getX(), loadRam.getY() + 2);
    }//GEN-LAST:event_loadRamMouseEntered

    private void loadRamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadRamMouseExited
        loadRam.setLocation(loadRam.getX(), loadRam.getY() - 2);
    }//GEN-LAST:event_loadRamMouseExited

    private void runButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runButtonMousePressed
        if (!textPane.getText().isEmpty()) {
            outputPane.setText("Wait...");
        }
    }//GEN-LAST:event_runButtonMousePressed

    private void runButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runButtonMouseReleased
        long start_time = System.currentTimeMillis();
        String text = textPane.getText();
        text = text.replaceAll("\t", "\r");
        instructions = text.split("\n");
        int i = 0;
        for (String x : instructions) {
            if (x.contains("/")) {
                x = x.substring(0, x.indexOf("/"));
            }
            if (!x.equals("\r")) {
                instructions[i] = x.trim();
                i++;
            }
        }
        this.register.setInReg(inRegText.getText());
        if (!textPane.getText().isEmpty() && builder.build(instructions, this.ram, this.register, this.label, this.outputPane)) {
            try {
                runner = new Runner(this.register, this.ram, outputPane);
                acText.setText(uiControl.setLSBs(this.register.getAC()));
                marText.setText(this.register.getMAR());
                mbrText.setText(uiControl.setLSBs(this.register.getMBR()));
                irText.setText(uiControl.setLSBs(this.register.getIR()));
                pcText.setText(uiControl.setLSBs(this.register.getPC()));
                outRegText.setText(uiControl.setLSBs(this.register.getOutReg()));
                uiControl.showTable(this.labelTable, this.label.getLabelData(), "Name", "Address");
                uiControl.showTable(this.memoryTable, this.ram.getRamData(), "Address", "Data");
                long stop_time = System.currentTimeMillis();
                outputPane.setText("RUN COMPLETED SUCCESSFULLY! (total time: " + (stop_time - start_time) + " miliseconds)\n");
                uiControl.changeTextColor("RUN COMPLETED SUCCESSFULLY!", Color.green, outputPane);
            } catch (Exception ex) {
                clearAllbutNotText();
                outputPane.setText(outputPane.getText() + "ERROR: (NULL POINTER EXCEPTION) <<:\n");
                uiControl.changeTextColor("ERROR", Color.red, outputPane);
            }
        } else {
            uiControl.changeTextColor("ERROR", Color.red, outputPane);
        }
    }//GEN-LAST:event_runButtonMouseReleased

    private void openButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openButtonMouseReleased
        clearAll();

        uiControl.open(textPane);

        for (String instruction : builder.getInstruction()) {
            uiControl.changeTextColor(instruction, Color.orange, textPane);
        }
        for (String insI : builder.getInsI()) {
            uiControl.changeTextColor(insI, Color.orange, textPane);
        }
        for (String x : builder.getLabels()) {
            uiControl.changeTextColor(x, Color.green, textPane);
        }
        for (String x : builder.getPscode()) {
            uiControl.changeTextColor(x, Color.red, textPane);
        }
        uiControl.changeTextColor("/", Color.green, textPane);

    }//GEN-LAST:event_openButtonMouseReleased

    private void saveButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseReleased
        this.uiControl.save(textPane);
    }//GEN-LAST:event_saveButtonMouseReleased

    private void buildButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buildButtonMouseReleased

        String text = textPane.getText();
        text = text.replaceAll("\t", "\r");
        instructions = text.split("\n");
        int i = 0;
        for (String x : instructions) {
            if (x.contains("/")) {
                x = x.substring(0, x.indexOf("/"));
            }
            if (!x.equals("\r")) {
                instructions[i] = x.trim();
                i++;
            }
        }

        this.register.setInReg(inRegText.getText());
        if (!textPane.getText().isEmpty() && builder.build(instructions, this.ram, this.register, this.label, this.outputPane)) {
            outputPane.setText(" BUILD SUCCESSFUL! \n");
            this.uiControl.changeTextColor(" BUILD SUCCESSFUL! ", Color.green, outputPane);
            uiControl.showTable(this.labelTable, this.label.getLabelData(), "Name", "Address");
            uiControl.showTable(this.memoryTable, this.ram.getRamData(), "Address", "Data");
        } else {
            this.uiControl.changeTextColor("ERROR", Color.red, outputPane);
        }
    }//GEN-LAST:event_buildButtonMouseReleased

    private void clearButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseReleased
        clearAll();
    }//GEN-LAST:event_clearButtonMouseReleased

    private void loadRamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadRamMouseReleased
        ram.loadRam(address1.getText(), address2.getText(), outputPane);
        uiControl.showTable(this.memoryTable, this.ram.getRamData(), "Address", "Data");
    }//GEN-LAST:event_loadRamMouseReleased

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backgroundMousePressed

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundMouseDragged

    private void hideButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideButtonMouseReleased
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_hideButtonMouseReleased

    private void exitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseReleased
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseReleased

    private void clearAll() {
        this.label.getLabelData().clear();
        this.ram.getRamData().clear();
        uiControl.showTable(this.labelTable, this.label.getLabelData(), "Name", "Address");
        uiControl.showTable(this.memoryTable, this.ram.getRamData(), "Address", "Data");
        this.register.setAC("0000");
        this.register.setMBR("0000");
        this.register.setMAR("000");
        this.register.setIR("0000");
        this.register.setPC("000");
        this.register.setOutReg("0000");
        this.register.setInReg("0000");
        acText.setText("0000");
        marText.setText("000");
        mbrText.setText("0000");
        irText.setText("0000");
        pcText.setText("000");
        outRegText.setText("0000");
        textPane.setText("");
        outputPane.setText("");
        address1.setText("000");
        address2.setText("000");
    }

    private void clearAllbutNotText() {
        this.label.getLabelData().clear();
        this.ram.getRamData().clear();
        uiControl.showTable(this.labelTable, this.label.getLabelData(), "Name", "Address");
        uiControl.showTable(this.memoryTable, this.ram.getRamData(), "Address", "Data");
        this.register.setAC("0000");
        this.register.setMBR("0000");
        this.register.setMAR("000");
        this.register.setIR("0000");
        this.register.setPC("000");
        this.register.setOutReg("0000");
        this.register.setInReg("0000");
        acText.setText("0000");
        marText.setText("000");
        mbrText.setText("0000");
        irText.setText("0000");
        pcText.setText("000");
        outRegText.setText("0000");
        outputPane.setText("");
        address1.setText("000");
        address2.setText("000");
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                
            }
            new MSIMGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acText;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField address2;
    private javax.swing.JLabel background;
    private javax.swing.JLabel buildButton;
    private javax.swing.JLabel clearButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel hideButton;
    private javax.swing.JTextField inRegText;
    private javax.swing.JTextField irText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable labelTable;
    private javax.swing.JLabel loadRam;
    private javax.swing.JTextField marText;
    private javax.swing.JTextField mbrText;
    private javax.swing.JTable memoryTable;
    private javax.swing.JLabel openButton;
    private javax.swing.JTextField outRegText;
    private javax.swing.JTextPane outputPane;
    private javax.swing.JTextField pcText;
    private javax.swing.JLabel runButton;
    private javax.swing.JLabel saveButton;
    private javax.swing.JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
