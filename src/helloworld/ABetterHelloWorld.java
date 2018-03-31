/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author epapa
 */
public class ABetterHelloWorld {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        helloWorld = "A Good World";
        // Intellisense
        
        // Better
        System.out.println(helloWorld);
        System.out.println(helloWorld);
        System.out.println(helloWorld);
        
        // Not Good   
        System.out.println("A Good World");
        System.out.println("A Good World");
        System.out.println("A Good World");
    }
}
