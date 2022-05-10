import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String host = "127.0.0.1:3306";
        String dtbs = "colegio";
        String user = "root";
        String pass = "";
        /*Connection conn=null;
        Statement st = conn.createStatement();
        ResultSet rs;*/

        PreparedStatement ps;



        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
        /*
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/


    }
}
