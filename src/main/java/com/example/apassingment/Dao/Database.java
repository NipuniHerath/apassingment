package com.example.apassingment.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database implements GetConnection {
    @Override
    public Connection con() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        //establish connection
        String url="jdbc:mysql://localhost:3306/danashop";
        String username="root";
        String password="0000";


        return DriverManager.getConnection(url,username,password);
    }
}
