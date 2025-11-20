/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import java.sql.*;


/**
 *
 * @author Sumit
 */
public class NewClass {
    
    Connection c;
    Statement s;

    NewClass () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///data", "root", "Mysql@07");
            s = c.createStatement();
            String str=" create table Exam(name varchar(5),id int";
            s.execute(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    

