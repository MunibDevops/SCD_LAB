 
package com.application;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Muneeb
 */
public class DBcon {
     
    // public static Connection conn = null;
   private static String servername="localhost";
    private static String username="root";
    private static String dbname="fnaf";
    private static Integer portnumber=3306;
    private static String password="";
    
    public static Connection getInstance(){
     
        Connection cnx=null;
        MysqlDataSource datasource=new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
       datasource.setDatabaseName(dbname);
       datasource.setPortNumber(portnumber);
        
       try {
           cnx=datasource.getConnection();
           
       } catch (SQLException ex) {
           Logger.getLogger( "get connection " + DBcon.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
        
        return cnx;
        
        
        
        
        
        
}
}
    
    
