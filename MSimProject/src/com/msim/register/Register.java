/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msim.register;

/**
 *
 * @author asa
 */
public class Register {

    private String AC;
    private String MAR;
    private String MBR;
    private String IR;
    private String PC;
    private String outReg;
    private String inReg;

    public String getAC() {
        return AC;
    }

    public void setAC(String AC) {
        this.AC = setReg4(AC);
    }

    public String getMAR() {
        return MAR;
    }

    public void setMAR(String MAR) {
        this.MAR = setReg3(MAR);
    }

    public String getMBR() {
        return MBR;
    }

    public void setMBR(String MBR) {
        this.MBR = setReg4(MBR);
    }

    public String getIR() {
        return IR;
    }

    public void setIR(String IR) {
        this.IR = setReg4(IR);
    }

    public String getPC() {
        return PC;
    }

    public void setPC(String PC) {
        this.PC = setReg3(PC);
    }

    public String getOutReg() {
        return outReg;
    }

    public void setOutReg(String outReg) {
        this.outReg = setReg4(outReg);
    }

    public String getInReg() {
        return inReg;
    }

    public void setInReg(String inReg) {
        this.inReg = setReg4(inReg);
    }

    public String setReg3(String x) {
        if (x.length() < 3) {
            for (int i = 0; i < 4 - x.length(); i++) {
                x = "0" + x;
            }
        }
        return x;
    }

    public String setReg4(String x) {
        if (x.length() < 4) {
            if (x.length() != 3) {
                for (int i = 0; i < 6 - x.length(); i++) {
                    x = "0".concat(x);
                }
            } else {
                for (int i = 0; i < 5 - x.length(); i++) {
                    x = "0".concat(x);
                }
            }
        }
        return x;
    }

}
