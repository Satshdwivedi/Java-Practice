import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Transaction1{
    public static void main(String[] args) throws SQLException {
        Connection con=DBConnection.getConnection();
        if(con!=null){
            System.out.println("Database Connected Successfully");
        }
        try{
        con.setAutoCommit(false);
        System.out.println("Transaction Started");
        String s ="UPDATE student SET age=? WHERE id=?";
        PreparedStatement ps=con.prepareStatement(s);
        ps.setInt(1,25);
        ps.setInt(2,1);
        ps.executeUpdate();
        ps.close();
        String s1 ="UPDATE student SET xyz=? WHERE id=?";
        PreparedStatement ps1=con.prepareStatement(s1);
        ps1.setInt(1,25);
        ps1.setInt(2,1);
        ps1.executeUpdate();
        ps1.close();
        con.commit();
    }
        catch(Exception e){
            System.out.println(e);
            con.rollback();
        }
        con.close();


    }
}