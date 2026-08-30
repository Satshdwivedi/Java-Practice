import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Jdbc2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/javapractice";
        String user = "root";
        String password = "Ravi@12345";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully!");
            Statement st=con.createStatement();
            //String sql="CREATE TABLE student(id INT,name VARCHAR(50),age INT)";
           // st.executeUpdate(sql);
          // String sql1 = "INSERT INTO student VALUES (1,'Rahul',20)";
           //st.executeUpdate(sql1);
          // String sql2="INSERT INTO student VALUES(2,'Ram',19)";
           //st.executeUpdate(sql2);
           //String sql3="UPDATE student SET age=21 WHERE id=2";
          // st.executeUpdate(sql3);
          String sql4="DELETE FROM student WHERE id=2";
          st.executeUpdate(sql4);
           ResultSet rs=st.executeQuery("SELECT * FROM student ");
           while(rs.next()){
            //System.out.println(rs.getInt("id"));
            //System.out.println(rs.getString("name"));
            //System.out.println(rs.getInt("age"));
            System.out.println("ID= "+rs.getInt("id")
           + " Name= "+rs.getString("name")+ " Age= "+rs.getInt("age"));}
           
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
   
   
   
    }
}
