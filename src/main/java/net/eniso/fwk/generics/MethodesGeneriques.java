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
public class MethodesGeneriques<T extends Voiture & Colorable> {

    T y;

    public MethodesGeneriques(T y) {
        this.y = y;
    }

    public <V extends Voiture> String ama5irr(V v) {
        return "La mienne";
    }

    public void appel() {
        this.ama5irr(new Voiture());
    }

}
