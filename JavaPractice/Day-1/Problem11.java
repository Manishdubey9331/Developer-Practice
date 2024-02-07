/*Create a Java class named Person with attributes name, age, and gender. 
Provide a default constructor and a parameterized constructor. 
Instantiate objects for two different people and display their information.
 
Problem11=Person */
public class Problem11 {
    String name;
    int age;
    String sex;
    Problem11(){
        System.out.println("this is a default constructor");
    }
    Problem11(String name,int age,String sex)
    {
        this.age=age;
        this.name=name;
        this.sex=sex;
    }
    void Print()
    {
        System.out.println("Name is "+" "+name);
        System.out.println("Age is "+" "+age);
        System.out.println("Sex is "+" "+sex);
    }
    public static void main(String[] args) {
        Problem11 people1 = new  Problem11();
        people1.Print();
        Problem11 people2 = new  Problem11("MANISH",21,"Male");
        people2.Print();
        Problem11 people3 = new  Problem11();
        people3.Print();
        Problem11 people4 = new  Problem11("Manisha",20,"Female");
            people4.Print();
    }

    
}
