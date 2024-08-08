import java.util.Scanner;
class student {
public 
    String name ;
    int dob;
    boolean  result ;
int calculate_age(int age )
{
    int new_age = 2024-age ;
    return new_age;
}
}

public class scanner_print{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    

    student aayush =new student();
    System.out.println("enter name  ");
    aayush.name =sc.nextLine();
        System.out.println("enter  birth yearaayush");

    aayush.dob = sc.nextInt();
    System.out.println(" previus result  ");
    aayush.result = sc.nextBoolean();
    aayush.dob = aayush.calculate_age( aayush.dob);


System.out.println("name  = "+aayush.name);
System.out.println("age is  "+aayush.dob);
System.out.println("previus result is "+aayush.result);

}

}