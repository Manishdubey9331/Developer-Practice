/*7. Create a Java class named Calculator with methods for basic arithmetic
 operations (addition, subtraction, multiplication, division).
  Demonstrate the usage of these methods.
*/
class Problem7{
    float addition(float a,float b,float c)
    {
        c=a+b+c;
        System.out.println("value of c is "+" "+c);
        return a+b;
    }
    float subtraction(float a,float b)
    {
        return a-b;
    }
    float multiplication(float a,float b)
    {
        return a*b;
    }
    float division(float a,float b){
    return a/b;}
    public static void main(String[] args) {
            float x=10;
            float y =20;
            float z=0;
            Problem7 obj =new Problem7();
            System.out.println("add"+" "+obj.addition(x,y,z));
            System.out.println("value of z is "+" "+z);

            System.out.println("sub"+" "+obj.subtraction(x,y));
            System.out.println("mul"+" "+obj.multiplication(x,y));
            System.out.println("div"+" "+obj.division(x,y));


    }

}