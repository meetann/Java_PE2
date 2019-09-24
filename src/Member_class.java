import java.util.Scanner;

public class Member_class{
    public static void main(String[] args) {    
        Member a=new Member("Mary",25,70000);
        a.name="Kathy";
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.salary);
    }    
}
class Member{
    String name;
    int age;
    long salary;
    Member(String a,int b,long c){
        
        this.name=a;
        this.age=b;
        this.salary=c;
    }
}



