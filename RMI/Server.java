import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Server{

public static void main(String []args){

try{
Adder stub  = new AdderRemote();
Naming.rebind("rmi://localhost:1099/apu",stub);
System.out.println("Connected");

}catch(Exception e){System.out.println(e);}

}
}