/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author lavish
 */
public class assignment3 {
    static int a=1,b=2;
    void Swap(){
        System.out.println("\nbefore swap :"+a+" "+b);
        int temp;
        temp=a;  a=b;  b=temp;
        System.out.println("after swap  :"+a+" "+b);
    }
}
