import java.sql.Connection;
public class Jdbc3{
    public static void main(String[] args) {
        Connection con=DBConnection.getConnection();
        if(con!=null)
    {System.out.println("Database Connected  Successfully!");

    }
}
}