/*8. Explain the concept of method overloading in Java and provide an 
example.


Here we are going to show the example of method overloading in java
Actually method overloading ion java can be achieved within a same class
having same name of the method but having different number of parameters passed
in the metod
 */


public class Problem8 {
    int add(int x,int y)
    {
        System.out.println("2 int add "+" "+(x+y));
        return x+y;
    }
    double add (double a,double b)
    {
        System.out.println("2 double add "+" "+(a+b));

        return a+b;
    }
    double add(int a,double b)
    {
        System.out.println("2 hybrid int doble add "+" "+(a+b));

        return a+b;
    }
    int add(int a,int b,int c)
    {
        System.out.println("3 int add "+" "+(a+b+c));

           return a+b+c;
    }
    public static void main(String[] args) {
        Problem8 obj = new Problem8();
        obj.add(1,2);
        obj.add(1,2.5);
        obj.add(1,2,3);
        obj.add(2.5,3.5);

    }
}
