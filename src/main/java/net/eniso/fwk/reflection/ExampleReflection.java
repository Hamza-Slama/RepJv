/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.reflection;

import net.eniso.fwk.generics.Koffa;

import java.lang.reflect.Method;

/**
 *
 * @author vpc
 */
public class ExampleReflection extends Koffa<String>  {
    public static void main(String[] args) {
        System.out.println(ExampleReflection.class);
//        Class c=ExampleReflection.class;
//        for (Method method : c.getMethods()) {
//            System.out.println(method);
//        }
        Class c = ExampleReflection.class;
        for (Method m : c.getMethods()){
            System.out.println(m);
        }
    }
    public int doit(){
        return 1;
    }
    public int deontDoit(){
        return 2;
    }

    @Override
    public void acheter(String value) {
        super.acheter(value);
    }

    /**
     * we can't change the
     */
//    public int tayeber() {
//        return 1;
//    }
}
