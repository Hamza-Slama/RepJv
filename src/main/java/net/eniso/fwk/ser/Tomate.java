/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.ser;

import java.io.Serializable;
import org.w3c.dom.css.Counter;

/**
 *
 * @author vpc
 */
public class Tomate implements Serializable {
    
    private static final long serialVersionUID = 1;

    private transient Runtime curr=Runtime.getRuntime();
    private double poids;
    private static int COUNT = 0;

    public Tomate(double poids) {
        this.poids = poids;
        COUNT++;
    }

    public double getPoids() {
        return poids;
    }

}
