/*
14. Create a class named MathOperations with a static method multiply that 
multiplies two numbers. Demonstrate the usage of this method 
without creating an object. 



A static method in Java is a method that belongs to the class rather than 
to any specific instance of the class. This means that you can call a static
 method without creating an object of the class. Static methods are commonly 
 used for utility functions, helper methods, or operations that do not 
 require access to instance variables.

 Static methods are associated with the class itself
 rather than with instances of the class. They can be called directly using
  the class name without needing to create an object.

*/

public class Problem14 {
    static int mult(int a,int b)
    {
        System.out.println("multipication "+" "+a*b);
        return a*b;

    }
    public static void main(String[] args) {
      int x=mult(10,2);

    }
    
}