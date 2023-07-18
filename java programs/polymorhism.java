   //  polymorphism 
   // funtion overloading, compile type polymorphism.
  class student {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("Name is");
        System.out.println(name);

    }
    public void printInfo(int  age){    //  this all funtion are polymorhism.
        System.out.println("Age is");
        System.out.println(age);
    

    }
    public void printInfo(String name , int age){
        System.out.println("Name and age is");
        System.out.println(name + " " + age);

    }

    
  } 
  public class polymorhism{
    public static void main(String args[]){
        student st1 = new student();
        st1.name = "Manav";
        st1.age = 21;
        st1.printInfo(st1.name);
        st1.printInfo(st1.name, st1.age);
    }
        
    }
  
