 // ENCAPSULATION.
 import java.util.Scanner;
 class Employee{
    private int Emp_id;
    public void setEmp_id(int Emp_id1){
        Emp_id = Emp_id1;                  //  ENCAPSULATION.
    }
    public int getEmp_id(){
        return Emp_id;
    }
 }
 public class ENCAPSULATION{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter number 1");
        a = sc.nextInt();
        System.out.println("Enter number 2");
        b = sc.nextInt();
        Employee E1 = new Employee();
        Employee E2 = new Employee();
        Employee E3 = new Employee();
        Employee E4 = new Employee();
        E1.setEmp_id(a+b);
        E2.setEmp_id(a*b);    // we modifi data but use only indiviual modifi data.
        E3.setEmp_id(a-b);
        E4.setEmp_id(a/b);
        System.out.println(E1.getEmp_id());
        System.out.println(E2.getEmp_id());
        System.out.println(E3.getEmp_id());
        System.out.println(E4.getEmp_id());
    }
 }