/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs2;

/**
 *
 * @author tiago.lucas
 */
public class VarArgs2 {

    /**
     * @param args the command line arguments
     */
    static void vaTest(int ... v)
    {
        System.out.print("number of args: "+v.length+" ");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
    
}
