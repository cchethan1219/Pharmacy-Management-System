/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author cchet
 */
public class Tables {

    public static void main(String args[]) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(200),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
             //st.executeUpdate("insert into appuser(userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','28-05-2003','0000000011','admin@email.com','admin','admin','India')");
             //st.executeUpdate("CREATE TABLE medicine (medicine_pk INT AUTO_INCREMENT PRIMARY KEY, uniqueId VARCHAR(200), name VARCHAR(200), companyName VARCHAR(200), quantity BIGINT, price BIGINT)");
             //st.executeUpdate("CREATE TABLE bill (bill_pk INT AUTO_INCREMENT PRIMARY KEY, billId VARCHAR(200), billDate VARCHAR(50), totalPaid BIGINT, generatedBy VARCHAR(50))");
             //st.executeUpdate("create table supplier(supplier_pk int AUTO_INCREMENT primary key,supplier_id varchar(20),name varchar(200),mobileNumber varchar(20)) ");
             //st.executeUpdate("create table prescription(prescription_id int AUTO_INCREMENT primary key,user_id varchar(20),uniqueId varchar(20),date varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created succesfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
