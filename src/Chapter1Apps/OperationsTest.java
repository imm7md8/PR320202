/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1Apps;

/**
 *
 * @author aashgar
 */
public class OperationsTest {
    public static void main(String[] args) {
        int a=5, b=3, c=0;
        c+= --a + b++ * a>>2; //Must be explained
        System.out.println("Value of c: " + c);
    }
}
