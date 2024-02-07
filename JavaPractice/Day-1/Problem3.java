/*3. Create a Java class named Car with attributes such as make, model, and 
    year. Include a method to display information about the car.

Here for shake pf program to run we are changing the name of class
as Problem3*/
class Problem3{
    int make;
    String  model;
   int year;
   Problem3(int mk,String md,int yr)
   {
    make=mk;
    model=md;
    year=yr;
   }
   void Model()
   {
    System.out.println("the name of the model is"+model);
   }
   void make()
   {
    System.out.println("make is"+make);
   }
   public static void main(String[] args) {
    Problem3 obj=new Problem3(10,"Merceddez",  2024);
    obj.make();
    obj.Model();
   }
}