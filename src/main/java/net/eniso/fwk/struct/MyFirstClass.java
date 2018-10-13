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
class MyFirstClass {
    int valX=4;
    public class InterneInstance{
        
    }
    
    public static class InterneStatic{
        
    }
    
    public interface InterneInterface{
        public int doit();
    }
    
    public void main2(String[] args) {
        InterneInstance b=new InterneInstance();
        int valY=7;
        class Toto{
            int t;
        }
        InterneInterface c=new InterneInterface(){
            @Override
            public int doit() {
                System.out.println(valX);
                return valY+valX;
            }
        };
//        valY++;
    }
    
    public static void main(String[] args) {
        InterneStatic a=new InterneStatic();
        InterneStatic b=new MyFirstClass.InterneStatic();
    }
}
