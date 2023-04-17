/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cmsprj.vai1;

import java.sql.*;


/**
 *
 * @author nalot
 */
public class db {
    public  static Connection mycon()
    { Connection con =null;
     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catdb", "root", "root"); }
      catch (ClassNotFoundException | SQLException e)
    { System.out.println(e.getMessage());
    }
    return con;
    }
}