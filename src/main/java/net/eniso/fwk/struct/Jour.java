/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.struct;

/**
 *
 * @author vpc
 */
public enum Jour implements MyInterface{
    LUNDI("Lundi","Monday","Lunedi"), 
    MARDI("Mardi","Tuesday","Martedi");
    private String nameFR;
    private String nameEN;
    private String nameIt;
    
//    private int order;
//    public static Jour LUNDI=new Jour(1);
//    public static Jour MARDI=new Jour(2);
//
//    private Jour(int order) {
//        this.order = order;
//    }

    private Jour(String nameFR, String nameEN, String nameIt) {
        this.nameFR = nameFR;
        this.nameEN = nameEN;
        this.nameIt = nameIt;
    }

    public String getNameFR() {
        return nameFR;
    }

    public String getNameEN() {
        return nameEN;
    }

    public String getNameIt() {
        return nameIt;
    }

    @Override
    public int get() {
        return ordinal();
    }
    
}
