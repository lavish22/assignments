/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;
public class assignment5 {
    void PrimeOrNot(int n){
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                flag=true;
        }
        if(flag)System.out.println("\nNumber is NOT Prime");
        else    System.out.print("\nnumber is Prime");
    }
}
