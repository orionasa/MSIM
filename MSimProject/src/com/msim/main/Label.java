/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msim.main;

import java.util.HashMap;

/**
 *
 * @author SONER OKUR & ABDUSSAMED ASLAN
 */
public class Label {

    private final HashMap<String, String> labelData = new HashMap<>();

    public void addLabel(String labelname, String address) {
        labelData.put(labelname, address);
    }

    public String getAddress(String labelname) {
        return labelData.get(labelname);
    }
    
    public HashMap getLabelData(){
        return labelData;
    }
}
