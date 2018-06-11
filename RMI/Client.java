import java.rmi.*;
import java.util.*;

public class Client{
public static void main(String []args){

Scanner scan = new Scanner(System.in);
try{
Adder stub = (Adder)Naming.lookup("rmi://localhost:1099/apu");
System.out.println("Perform Addition\n\nEnter first value : ");
int x = scan.nextInt();
System.out.println("\nEnter second value : ");
int y = scan.nextInt();
System.out.println(stub.add(x,y));
}
catch(Exception e){System.out.println(e);}
}



}