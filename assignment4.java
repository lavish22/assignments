/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

public class assignment4 {
    void SwapWithoutThirdVariable(byte a, byte b){
        System.out.println("\nbefore swap :"+a+" "+b);
        a=(byte)(a^b);                      //since result of ^ is int
        b=(byte)(b^a);
        a=(byte)(a^b);
        System.out.println("after swap  :"+a+" "+b);
    }
}
