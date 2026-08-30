import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Preparedstatement{
    public static void main(String[] args)throws SQLException {
        Connection con=DBConnection.getConnection();
        if(con!=null){
            System.out.println("Database Connected Successfully");
        }
       /* * String s="INSERT INTO student VALUES(?,?,?)";
       PreparedStatement ps=con.prepareStatement(s);
       ps.setInt(1,3);
       ps.setString(2,"Suraj");
       ps.setInt(3,23);
       ps.executeUpdate();
       ps.close();*/
       /*String s1="UPDATE student SET age=? WHERE id=?";
       PreparedStatement ps1=con.prepareStatement(s1);
       ps1.setInt(1,19);
       ps1.setInt(2,3);
       ps1.executeUpdate();
       ps1.close();*/
       /*String s2="DELETE FROM student WHERE id=?";
       PreparedStatement ps2=con.prepareStatement(s2);
       ps2.setInt(1,3);
       ps2.executeUpdate();
       ps2.close();*/
       String s3="SELECT * FROM student WHERE id=?";
       PreparedStatement ps3=con.prepareStatement(s3);
       ps3.setInt(1,1);
       ResultSet rs=ps3.executeQuery();
       while(rs.next()){
        System.out.println("ID= "+rs.getInt("id")+
        " Name= "+rs.getString("name")+" Age= "+rs.getInt("age"));
       }
       ps3.close();
       


       con.close();
     }  
}