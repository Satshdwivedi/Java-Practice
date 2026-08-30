import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection{
 static Connection getConnection(){
    String url="jdbc:mysql://localhost:3306/javapractice";
    String user="root";
    String password="Ravi@12345";
    try{
        return DriverManager.getConnection(url,user,password); }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
 }
}