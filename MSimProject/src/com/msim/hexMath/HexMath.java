/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msim.hexMath;

/**
 *
 * @author SONER OKUR & ABDUSSAMED ASLAN 
 */
public class HexMath {

    public String decToHex(String x) {
        return Integer.toHexString(Integer.parseInt(x)).toUpperCase();
    }

    public String hexIncr(String x) {
        return Integer.toHexString(Integer.parseInt(x, 16) + 1).toUpperCase();
    }

    public String hexDecr(String x) {
        return Integer.toHexString(Integer.parseInt(x, 16) - 1).toUpperCase();
    }

    public String hexAdd(String x, String y) {
        try {
            return Integer.toHexString(Integer.parseInt(x, 16) + Integer.parseInt(y, 16)).toUpperCase();
        } catch (NumberFormatException ex) {
            return Integer.toHexString(Integer.parseUnsignedInt(x, 16) + Integer.parseUnsignedInt(y, 16)).toUpperCase();
        }
    }

    public String hexSub(String x, String y) {
        try {
            return Integer.toHexString(Integer.parseInt(x, 16) - Integer.parseInt(y, 16)).toUpperCase();
        } catch (NumberFormatException ex) {
            return Integer.toHexString(Integer.parseUnsignedInt(x, 16) - Integer.parseUnsignedInt(y, 16)).toUpperCase();
        }
    }

    public int hexToDec(String x) {
        try {
            return Integer.parseInt(x, 16);
        } catch (NumberFormatException e) {
            return Integer.parseUnsignedInt(x, 16);
        }
    }

    public String hexToDecs(String x) {
        return String.valueOf(Integer.parseInt(x, 16));
    }

    public String hexZeroCond(String x) {
        if (hexToDec(x) < 0) {
            return "st";
        } else if (hexToDec(x) == 0) {
            return "zr";
        } else {
            return "gt";
        }
    }
}
