package bms;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "1206597");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
