package com.msim.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.msim.control.UIControl;
import com.msim.hexMath.HexMath;
import java.awt.Color;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JTextPane;

/**
 *
 * @author SONER OKUR & ABDUSSAMED ASLAN
 */
public class Ram {

    private final HashMap<String, String> ramData = new HashMap<>();
    private final HexMath hexMath = new HexMath();
    private final UIControl uiControl = new UIControl();
    
    public void addRam(String address, String data) {
        if (data.length() < 4) {
            if (data.length() != 3) {
                for (int i = 0; i < 6 - data.length(); i++) {
                    data = "0".concat(data);
                }
            } else {
                for (int i = 0; i < 5 - data.length(); i++) {
                    data = "0".concat(data);
                }
            }
        }

        ramData.put(address, data);
    }

    public String getData(String address) {
        return ramData.get(address);
    }

    public void loadRam(String address1, String address2, JTextPane pane) {
        if (hexMath.hexToDec(address1) <= hexMath.hexToDec(address2)) {
            do {
                Random f = new Random(); //random sınıfı
                int r = f.nextInt(31) - 15;
                String data = Integer.toHexString(r);
                if (data.length() < 4) {
                    if (data.length() != 3) {
                        for (int i = 0; i < 6 - data.length(); i++) {
                            data = "0".concat(data);
                        }
                    } else {
                        for (int i = 0; i < 5 - data.length(); i++) {
                            data = "0".concat(data);
                        }
                    }
                }
                if (address1.length() < 3) {
                    if (address1.length() != 2) {
                        for (int i = 0; i < 5 - address1.length(); i++) {
                            address1 = "0".concat(address1);
                        }
                    } else {
                        for (int i = 0; i < 4 - address1.length(); i++) {
                            address1 = "0".concat(address1);
                        }
                    }
                }
                ramData.put(address1.toUpperCase(), data.toUpperCase());
                address1 = hexMath.hexIncr(address1);
            } while (hexMath.hexToDec(address1) != hexMath.hexToDec(hexMath.hexAdd(address2, "1")));

        } else {
            pane.setText("ERROR: (INVALID ENTRY) :>> 'FROM ADDRESS' MUST BE SMALLER THAN 'TO ADDRESS' \n");
            uiControl.changeTextColor("ERROR", Color.red, pane);
        }
    }
    
    public HashMap getRamData(){
        return ramData;
    }
}
