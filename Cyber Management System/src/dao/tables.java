package dao;

import javax.swing.JOptionPane;
import java.sql.*;

public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user(id int auto_increment primary key,name varchar(200),email varchar(200),mobileNum varchar(11),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobileNum,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','01704863492','Bangladesh', 'admin','What is your Name?','Pankaj','true')";
            String categoryTable = "create table category(id int auto_increment primary key,name varchar(200))";
            String ItemTable="create table item(id int auto_increment primary key,name varchar(200),category varchar(200),price varchar(200))";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperations.setDataOrDelete(ItemTable, "Item Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
