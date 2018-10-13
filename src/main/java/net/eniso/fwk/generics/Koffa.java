/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.fwk.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vpc
 */
public class Koffa<Haja> {

    private List values = new ArrayList();

    public void acheter(Haja value) {
        values.add(value);
    }

    public Haja tayeber() {
        return (Haja) values.remove(0);
    }

}
