/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.struct;

import java.util.Scanner;

/**
 *
 * @author vpc
 */
public class JourExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Jour s = (Jour) sc.next();
//        if (s == Jour.LUNDI){
//
//        }
        Jour p = Jour.LUNDI;
        if(p==Jour.LUNDI){
            System.out.println("Lundi");;
        }
        if(p==Jour.MARDI){
            System.out.println("Martedi");;
        }
        switch(p){
            case MARDI:{
                
                System.out.println(p.name());
                System.out.println(p.ordinal());
                
                System.out.println(p.getNameFR());
                System.out.println("C'est demain...");
                break;
            }
            case LUNDI:{

                System.out.println(p.name());
                System.out.println(p.ordinal());

                System.out.println(p.getNameFR());
                System.out.println("C'est demain...");
                break;
            }
        }
    }
}
