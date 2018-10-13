/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.struct;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import net.eniso.fwk.struct.ann.Max;

/**
 *
 * @author vpc
 */
//@Max(15)
//@Max(value=15)
public class A {

    
    public static B createB() {
        int x = 4;
        B b = new B() {
            @Override
            public int getVal() {
                return /*this.*/ x;
            }
        };
//        x++;
        return b;
    }

    public static void main(String[] args) {
        B b = createB();
        int y = b.getVal();
        System.out.println(y);
    }
}
