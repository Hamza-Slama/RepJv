/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.generics;

/**
 *
 * @author vpc
 */
public class StaticBloc {

    int a = 8;

    static {
        System.out.println("Bloc statique 1");
        System.out.println("A ");
    }
    static int x = 3;

    {
        System.out.println("Bloc instance");
        System.out.println("B");
        {
            System.out.println("C");
            {
                int t = 3;
                System.out.println("D");
            }
            {
                int t = 3;
                System.out.println("D");
            }
        }
    }

    public StaticBloc() {
        System.out.println("E : constructeur StaticBloc()");
    }

    public StaticBloc(int o) {
        this();
        System.out.println("F constructeur StaticBloc("+o+")");
    }

    static {
        System.out.println("Bloc statique 2");
        x++;
        System.out.println("A " + x);
    }

    public static void main(String[] args) {
        StaticBloc t1 = new StaticBloc(5);
        StaticBloc t2 = new StaticBloc();
        System.out.println("Tozz");
    }

}
