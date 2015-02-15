/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.msim.control;

import com.msim.instruction.Instruction;
import com.msim.main.Ram;
import com.msim.register.Register;
import javax.swing.JTextPane;


/**
 *
 * @author SONER OKUR & ABDUSSAMED ASLAN 
 */
public class Runner extends Instruction{
    private boolean exit = false;
    public Runner(Register register, Ram ram, JTextPane pane){

        while(!exit){
        
            switch(ram.getData(register.getPC()).charAt(0)){
                case '0': fetch(register,ram); jns(register,ram);break;
                case '1': fetch(register,ram); load(register,ram);break;
                case '2': fetch(register,ram); store(register,ram);break;
                case '3': fetch(register,ram); add(register,ram);break;
                case '4': fetch(register,ram); subt(register,ram);break;
                case '5': fetch(register,ram); input(register,ram);break;
                case '6': fetch(register,ram); output(register,ram);break;
                case '7': fetch(register,ram); halt(register,ram);exit=true;break;
                case '8': fetch(register,ram); skipcond(register,ram);break;
                case '9': fetch(register,ram); jump(register,ram);break;
                case 'A': fetch(register,ram); clear(register);break;
                case 'B': fetch(register,ram); addi(register,ram);break;
                case 'C': fetch(register,ram); jumpi(register,ram);break;
                case 'D': fetch(register,ram); storei(register,ram);break;
                case 'E': fetch(register,ram); loadi(register,ram);break;
            }
        }
   }
}
