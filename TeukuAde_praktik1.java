/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostackpushint;
import java.util.*;
/**
 *
 * @author Teuku Ade
 */
public class TeukuAde_praktik1 {
       public static void main(String[] args) {
        // TODO code application logic here
// Creating an empty Stack
Stack<String> STACK = new Stack<String>();
// Use push() to add elements into the Stack
STACK.push("Minggu");
STACK.push("Senin");
STACK.push("Selasa");
STACK.push("Rabu");
STACK.push("Kamis");
// Displaying the Stack
System.out.println("Stack Awal: " + STACK);
// Pushing elements into the stack
STACK.push("Jumat");
STACK.push("Sabtu");
// Displaying the final Stack
System.out.println("Updata Stack: " + STACK);
}
}