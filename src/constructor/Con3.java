package constructor;

public class Con3 {
   public final  String name= "jams";

   public Con3(){

   }




    public Con3(String name,double gpa){
        System.out.println(name+"got avg," + gpa);
    }

    public Con3(String name, int age){
        System.out.println(name+" is"  +age+  "years old");
    }

}
