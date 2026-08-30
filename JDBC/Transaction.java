import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Transaction{
    public static void main(String[] args) throws SQLException {
        Connection con=DBConnection.getConnection();
        if(con!=null){
            System.out.println("Database Connected Successfully");
        }
        con.setAutoCommit(false);
        System.out.println("Transaction Started");
        String s ="UPDATE student SET age=? WHERE id=?";
        PreparedStatement ps=con.prepareStatement(s);
        ps.setInt(1,19);
        ps.setInt(2,1);
        ps.executeUpdate();
        ps.close();
        con.commit();
        
        con.close();


    }
}