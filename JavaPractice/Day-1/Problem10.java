
/*10. Explain the usage of the this keyword in Java.
 Provide examples demonstrating its use in constructors and methods.

 Here we are going to explain the usage of this keyword mainly as we know
this keyword is mainly used to differentiate between the data variables of the 
the class and passed value to the constructor it can be also say that compiler get
confused when the fields varibles names are same as the name od the passed 
value to the constructor or the method 

Here along with the this keyword we re getting to explain the constructor and 
the method \
CONSTRUCTOR :: It is a block of code similar to the method having same names
                as the name of the class this is automatically called when 
                the object is created it is used to initialize an object;
                there is not any return type of constructor; 
                THere are three different typrs of constructor presetn default
                parameterized aand non parameterized
METHOD  :: It is a block of code which is used to implemt a fuction for 
which object is created to call;

 */

public class Problem10 {

        private String name;
        private int age;
    
        public Problem10(String name, int age) {
            this.name = name;  // Assigning parameter 'name' to instance variable 'name'
            this.age = age;    // Assigning parameter 'age' to instance variable 'age'
        }
        public int increseAge()
        {
            this.age++;
            return age;

        }
        public static void main(String[] args) {
            Problem10 obj = new Problem10("Manish", 21);
            int x=obj.increseAge();
            System.out.println("age"+" "+x);
        }
    }
    
    

