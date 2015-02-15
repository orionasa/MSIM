/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msim.control;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author SONER OKUR & ABDUSSAMED ASLAN
 */
public class UIControl {

    public void open(JTextPane pane) {

        final JFileChooser fileChooser = new JFileChooser();

        File filedir = new File(System.getProperty("user.home") + "\\" + "Desktop");
        fileChooser.setCurrentDirectory(filedir);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooser.setFileFilter(filter);
        String fileContent = "";
        int returnVal = fileChooser.showOpenDialog(new JFrame());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    fileContent = fileContent.concat(line + "\r\n");
                }
                pane.setText(fileContent);
            } catch (IOException ex) {
            }

        }

    }

    public void save(JTextPane pane) {
        final JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Text files", "txt");
        fc.setFileFilter(filter);
        int returnVal = fc.showSaveDialog(new JFrame());
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            File file = new File(fc.getSelectedFile().getAbsolutePath() + ".txt");
            try (BufferedWriter o = new BufferedWriter(new FileWriter(file))) {
                o.write(pane.getText());
                o.close();
            } catch (IOException ex) {
            }
        }
    }

    public String setLSBs(String x) {
        if (x != null) {
            if (x.length() > 4) {
                return x.substring(x.length() - 4);
            } else {
                return x;
            }
        } else {
            return "0000";
        }
    }

    public void changeTextColor(String instruction, Color color, JTextPane pane) {
        SimpleAttributeSet set = new SimpleAttributeSet();
        String text = pane.getText();

        if (!pane.getToolTipText().equals("outputPane")) {
            text = text.replaceAll("\n", "");
        }
        while (text.contains(instruction)) {
            try {
                Document doc = pane.getStyledDocument();
                StyleConstants.setForeground(set, color);
                doc.remove(text.indexOf(instruction), instruction.length());
                doc.insertString(text.indexOf(instruction), instruction, set);
            } catch (BadLocationException ex) {
            }
            String remover = "";
            for (int i = 0; i < instruction.length(); i++) {
                remover += " ";
            }
            text = text.replaceFirst(instruction, remover);
        }
    }

    public void showTable(javax.swing.JTable table, java.util.HashMap hm, String column1, String column2) {
        String[] columnnames = {column1, column2};

        String[][] arr = new String[hm.size()][2];
        Set entries = hm.entrySet();
        Iterator entriesIterator = entries.iterator();

        int j = 0;
        while (entriesIterator.hasNext()) {
            Map.Entry mapping = (Map.Entry) entriesIterator.next();
            arr[j][0] = mapping.getKey().toString();
            arr[j][1] = setLSBs(mapping.getValue().toString());
            j++;
        }

        table.setModel(new DefaultTableModel(arr, columnnames));

    }

    public void filterInput(javax.swing.JTextField textfield, java.awt.event.KeyEvent evt, int length) {
        if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE && !textfield.getText().equals("")) {
            textfield.setText(textfield.getText().substring(0, textfield.getText().length() - 1));
        } else if (textfield.getText().length() < length) {
            if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')
                    || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'f')
                    || (evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'F')) {
                textfield.setText(textfield.getText() + evt.getKeyChar());
            }
        }
    }

}
