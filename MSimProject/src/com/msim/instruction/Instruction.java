/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msim.instruction;

import com.msim.hexMath.HexMath;
import com.msim.main.Ram;
import com.msim.register.Register;

/**
 *
 * @author SONER OKUR & ABDUSSAMED ASLAN 
 */
public class Instruction {

    private final HexMath hexMath = new HexMath();

    public void fetch(Register register, Ram ram) {
        register.setMAR(register.getPC());
        register.setIR(ram.getData(register.getMAR()));
        register.setPC(hexMath.hexIncr(register.getPC()));
    
    }

    public void jns(Register register, Ram ram) {
        register.setMBR(register.getPC());
        register.setMAR(register.getIR().substring(1));
        ram.addRam(register.getMAR(), register.getMBR());
        register.setMBR(register.getIR().substring(1));
        register.setAC("001");
        register.setAC(hexMath.hexAdd(register.getAC(), register.getMBR()));
        register.setPC(register.getAC().substring(1));
         
    }
    
    public void load(Register register,Ram ram){
      
        register.setMAR(register.getIR().substring(1));
        register.setMBR(ram.getData(register.getMAR()));
        register.setAC(register.getMBR());
    
    }
    
    public void store(Register register,Ram ram){
        register.setMAR(register.getIR().substring(1));
        register.setMBR(register.getAC());
        ram.addRam(register.getMAR(), register.getMBR());
    }
    
    public void add(Register register, Ram ram){
        register.setMAR(register.getIR().substring(1));
        register.setMBR(ram.getData(register.getMAR()));
        register.setAC(hexMath.hexAdd(register.getAC(), register.getMBR()));
    }
    
     public void subt(Register register, Ram ram){
        register.setMAR(register.getIR().substring(1));
        register.setMBR(ram.getData(register.getMAR()));
        register.setAC(hexMath.hexSub(register.getAC(), register.getMBR()));
    }
     
     public void input(Register register, Ram ram){
         register.setAC(register.getInReg());
     }
     
     public void output(Register register, Ram ram){
         register.setOutReg(register.getAC());
     }
     
     public void skipcond(Register register, Ram ram){
         if(null != register.getIR().substring(1))switch (register.getIR().substring(1)) {
            case "000":
                if("st".equals(hexMath.hexZeroCond(register.getAC()))){
                    register.setPC(hexMath.hexIncr(register.getPC()));
                }  break;
            case "400":
                if("zr".equals(hexMath.hexZeroCond(register.getAC()))){
                    register.setPC(hexMath.hexIncr(register.getPC()));
                }  break;
            case "800":
                if("gt".equals(hexMath.hexZeroCond(register.getAC()))){
                    register.setPC(hexMath.hexIncr(register.getPC()));
                }  break;
        }
     }
     
     public void jump(Register register, Ram ram){
         register.setPC(register.getIR().substring(1));
     }
     
     public void clear(Register register){
         register.setAC("0");
     }
     
     public void addi(Register register, Ram ram){
         register.setMAR(register.getIR().substring(1));
         register.setMBR(ram.getData(register.getMAR()));
         register.setMAR(register.getMBR().substring(1));
         register.setMBR(ram.getData(register.getMAR()));
         register.setAC(hexMath.hexAdd(register.getAC(), register.getMBR()));
     }
     
     public void jumpi(Register register, Ram ram){
         register.setMAR(register.getIR().substring(1));
         register.setMBR(ram.getData(register.getMAR()));
         register.setPC(register.getMBR().substring(1));
     }
     
     public void loadi(Register register, Ram ram){
         register.setMAR(register.getIR().substring(1));
         register.setMBR(ram.getData(register.getMAR()));
         register.setMAR(register.getMBR().substring(1));
         register.setMBR(ram.getData(register.getMAR()));
         register.setAC(register.getMBR());
     }
     
     public void storei(Register register, Ram ram){
         register.setMAR(register.getIR().substring(1));
         register.setMBR(ram.getData(register.getMAR()));
         register.setMAR(register.getMBR().substring(1));
         register.setMBR(register.getAC());
         ram.addRam(register.getMAR(), register.getMBR());
     }
     
     public void halt(Register register, Ram ram){
         register.setMAR(register.getIR().substring(1));
         register.setMBR("0000");
     }
}