/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msim.control;

import com.msim.hexMath.HexMath;
import com.msim.main.Label;
import com.msim.main.Ram;
import com.msim.register.Register;
import javax.swing.JTextPane;

/**
 *
 * @author SONER OKUR & ABDUSSAMED ASLAN
 */
public class Builder {

    private final String[] instruction = {"JnS", "Load", "Store", "Add", "Subt", "Input", "Output", "Halt",
        "Skipcond", "Jump", "Clear"};
    private final String[] insI = {"AddI", "JumpI", "StoreI", "LoadI"};
    private final String[] opcode = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E"};
    private final String[] pscode = {"ORG", "END"};
    private final String[] labels = {"DEC", "HEX"};
    private final HexMath hexMath = new HexMath();
    private Ram ram;
    private Register register;
    private Label label;
    private boolean buildControl;
    private boolean haltControl;
    private boolean endControl;
    private JTextPane pane;

    public String[] getLabels() {
        return labels;
    }

    public String[] getInstruction() {
        return instruction;
    }

    public String[] getOpcode() {
        return opcode;
    }

    public String[] getInsI() {
        return insI;
    }

    public String[] getPscode() {
        return pscode;
    }

    public boolean build(String[] instructions, Ram ram, Register register, Label label, JTextPane pane) {
        buildControl = true;
        haltControl = false;
        endControl = false;
        this.ram = ram;
        this.register = register;
        this.label = label;
        this.pane = pane;
        firstScan(instructions);
        secondScan(instructions);
        if (haltControl && endControl) {
            return buildControl;
        } else if (!endControl) {
            buildControl = false;
            pane.setText(pane.getText() + "ERROR: (END DOES NOT EXIST) \n");
            return buildControl;
        } else {
            buildControl = false;
            pane.setText(pane.getText() + "ERROR: (Halt DOES NOT EXIST) \n");
            return buildControl;
        }

    }

    public boolean isInstruction(String x) {
        for (String y : instruction) {
            if (x.contains(y)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPsCode(String x) {
        for (String y : pscode) {
            if (x.contains(y)) {
                return true;
            }
        }
        return false;
    }

    public boolean isLabel(String x) {
        for (String y : labels) {
            if (x.contains(y)) {
                return true;
            }
        }
        return false;
    }

    private void firstScan(String[] instructions) {

        register.setPC("000");
        for (String x : instructions) {
            x = x.replaceAll("\\r\\n|\\r|\\n", "");
            if (x.contains(",")) {
                label.addLabel(x.substring(0, x.indexOf(",")).trim(), register.getPC());
                register.setPC(hexMath.hexIncr(register.getPC()));
            } else if (x.contains("ORG")) {
                try {

                    register.setPC(hexMath.decToHex(hexMath.hexToDecs(x.substring(x.indexOf("ORG") + "ORG".length()).trim())));
                } catch (Exception ex) {

                    buildControl = false;
                    pane.setText(pane.getText() + "ERROR: (INVALID ORG VARIABLE) :>> " + x + "\n");
                    break;
                }
            } else if (x.contains("END")) {
                endControl = true;
                break;
            } else {

                register.setPC(hexMath.hexIncr(register.getPC()));

            }
        }
    }

    private void secondScan(String[] instructions) {
        register.setPC("000");
        String org = "000";
        for (String x : instructions) {
            x = x.replaceAll("\\r\\n|\\r|\\n", "");
            if (isPsCode(x) || isLabel(x)) {
                if (x.contains("ORG")) {

                    register.setPC(hexMath.decToHex(hexMath.hexToDecs(x.substring(x.indexOf("ORG") + "ORG".length()).trim())));

                    org = register.getPC();
                    continue;
                } else if (x.contains("END")) {
                    break;
                } else if (x.contains("DEC")) {
                    try {
                        ram.addRam(register.getPC(), hexMath.decToHex(x.substring(x.indexOf("DEC") + "DEC".length()).trim()));
                    } catch (Exception ex) {
                        buildControl = false;
                        pane.setText(pane.getText() + "ERROR: (INVALID DEC VARIABLE) :>> " + x + "\n");

                    }
                } else if (x.contains("HEX")) {
                    try {
                        ram.addRam(register.getPC(), hexMath.decToHex(hexMath.hexToDecs(x.substring(x.indexOf("HEX") + "HEX".length()).trim())));
                    } catch (Exception ex) {
                        buildControl = false;
                        pane.setText(pane.getText() + "ERROR: (INVALID HEX VARIABLE) :>> " + x + "\n");

                    }
                }
            } else {
                if (x.contains("Halt")) {
                    haltControl = true;
                    ram.addRam(register.getPC(), this.opcode[getIndexOf(x)] + "000");
                } else if (x.contains("Input") || x.contains("Output") || x.contains("Clear")) {
                    ram.addRam(register.getPC(), this.opcode[getIndexOf(x)] + "000");
                } else if (x.contains("AddI") || x.contains("JumpI") || x.contains("LoadI") || x.contains("StoreI")) {
                    try {

                        ram.addRam(register.getPC(), this.opcode[getIndexOfI(x) + this.instruction.length]
                                .concat(label.getAddress(x.substring(x.indexOf(this.insI[getIndexOfI(x)]) + this.insI[getIndexOfI(x)].length()).trim())));

                    } catch (Exception ex) {
                        ram.addRam(register.getPC(), this.opcode[getIndexOfI(x) + this.instruction.length]
                                .concat(x.substring(x.indexOf(this.insI[getIndexOfI(x)]) + this.insI[getIndexOfI(x)].length()).trim()));

                    }
                } else if (isInstruction(x)) {
                    try {
                        ram.addRam(register.getPC(), this.opcode[getIndexOf(x)]
                                .concat(label.getAddress(x.substring(x.indexOf(this.instruction[getIndexOf(x)]) + this.instruction[getIndexOf(x)].length()).trim())));
                    } catch (Exception ex) {
                        ram.addRam(register.getPC(), this.opcode[getIndexOf(x)]
                                .concat(x.substring(x.indexOf(this.instruction[getIndexOf(x)]) + this.instruction[getIndexOf(x)].length()).trim()));
                    }
                } else {
                    buildControl = false;
                    pane.setText(pane.getText() + "ERROR: (INVALID INSTRUCTION) :>> " + x + "\n");

                }
            }
            register.setPC(hexMath.hexIncr(register.getPC()));
        }
        register.setPC(org);
    }

    public int getIndexOf(String x) {
        for (int i = 0; i < this.instruction.length; i++) {
            if (x.contains(this.instruction[i])) {
                return i;
            }
        }
        return -1;
    }

    public int getIndexOfI(String x) {
        for (int i = 0; i < this.insI.length; i++) {
            if (x.contains(this.insI[i])) {
                return i;
            }
        }
        return -1;
    }
}
