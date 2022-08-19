/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Forms;
import java.sql.*;  
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.PreparedStatement;
import java.util.Vector;
/**
 *
 * @author sharjeel sultan
 */
public class MysqlCon {


    Connection connection;
    Statement statement;
    
    public MysqlCon()
    {
        try
        {
	Class.forName("com.mysql.cj.jdbc.Driver");  
                                                    
	connection =DriverManager.getConnection(  "jdbc:mysql://localhost:3306/plms?autoReconnect=true&useSSL=false","root","mysql2700");  
	//here plms is database name, root is username and password mysql2700
            statement = connection.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}


