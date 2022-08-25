package constructor;

public class Cons1 {
    public Cons1() {
    }


    public Cons1(String name, double gpa){
        System.out.println( name + " got gpa : " + gpa);
    }

    public Cons1(String name,int age){
        System.out.println(name + " is " + age + " years old");
    }
}
