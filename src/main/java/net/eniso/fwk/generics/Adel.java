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
public class Adel {
    public static void main(String[] args) {
        System.out.println("Aller au marché");
        Koffa<Djej> koffaDjej=new  Koffa<>();
        koffaDjej.acheter(new Djej());
        koffaDjej.acheter(new Djej());
        ///erronne
        //koffaDjej.acheter(new Batata());
        
        Koffa<Batata> koffatouBatata=new Koffa<>();
        koffatouBatata.acheter(new Batata());
        
        System.out.println("Aller au resto");
        
        Djej d=koffaDjej.tayeber();
        Batata b=koffatouBatata.tayeber();
        System.out.println("Tib tib "+d+" avec "+b);
        Djej d2=(Djej)koffaDjej.tayeber();
        System.out.println("Tib tib "+d2+" avec "+b);
        
    }
}
