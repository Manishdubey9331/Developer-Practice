/*9. Create a class variable in the Car class to keep track of the 
total number of cars created. Use the static keyword for this purpose.
  
HERE Problem9 = Car so please condider it as car*/
public class Problem9 {
    static int cnt=0;
    Problem9()
    {
        cnt++;
    }
    public static void main(String[] args) {
        Problem9 obj = new Problem9();
        System.out.println("number of time object of car is creted is"+" "+cnt); 
        Problem9 obj1 = new Problem9();
        Problem9 obj2 = new Problem9();
        Problem9 obj3 = new Problem9();
        Problem9 obj4 = new Problem9();
        System.out.println("number of time object of car is creted is"+" "+cnt); 

}

    
}
