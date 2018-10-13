/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.ser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author vpc
 */
public class Startrek extends Tomate{

    public Startrek(double poids) {
        super(poids);
    }

    @Override
    public double getPoids() {
        return super.getPoids();
    }

    public static void save(Tomate t) {
        try {
            ObjectOutputStream o
                    = new ObjectOutputStream(
                    new FileOutputStream(
                            new File("Good.toz")
                    )
            );
            o.writeObject(t);
            o.writeObject(t);
            o.close();
        } catch (IOException ex) {
            Logger.getLogger(Startrek.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Tomate load() {
        try {
            ObjectInputStream o
                    = new ObjectInputStream(
                    new FileInputStream(
                            new File("Good.toz")
                    )
            );
            Tomate t1 = (Tomate) o.readObject();
            Tomate t2 = (Tomate) o.readObject();
            if (t1 == t2) {
                System.out.println("Jaw kifkif");
            } else {
                System.out.println("LLR");
            }
            o.close();
            return t1;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        Tomate tSaved = new Tomate(2.3);
        save(tSaved);
        Tomate t = load();
        System.out.println(t);
        System.out.println("Say vite !");
    }
}
