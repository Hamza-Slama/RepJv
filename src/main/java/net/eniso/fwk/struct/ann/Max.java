/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.struct.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.eniso.fwk.struct.Jour;

/**
 *
 * @author vpc
 */
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Max {
    String doIt() default "Toto";
    Jour jour() default Jour.LUNDI;
    int val() ;
    Raghda sousMax() default @Raghda();
    Raghda[] lesRaghdas() default {@Raghda(),@Raghda()};
    //ERROR
//    String doIt() default null;
    //ERROR
//    String doIt() default new A();
    
    
    int value();
}
