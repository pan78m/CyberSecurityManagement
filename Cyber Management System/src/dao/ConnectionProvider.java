
package dao;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","namosteom@2019");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){ 
            return null;
        }
     
    }
}
//                                                       jdbc:mysql://localhost:3306/mysql