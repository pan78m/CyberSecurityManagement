package dao;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

public class UserDao {

    //Save For Signup Part
    public static void save(User user) {
        String query = "insert into user(name,email,mobileNum,address,password,securityQuestion,answer,status) value('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNum() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }

    //Start Login Part
    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = (ResultSet) DbOperations.getData("select *from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    //End Login Part

    // Start Forgetton Password <For Security Question Password Recovery>
    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = (ResultSet) DbOperations.getData("select *from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password='" + newPassword + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Password Changed Successfully");
    }
    //End Forgetton Password <For Security Question Password Recovery>

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) DbOperations.getData("select *from user where email Like '%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNum(rs.getString("mobileNum"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status='" + status + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Status Changed Successfully");
    }

    public static void changePassword(String email, String oldPassword, String newPassword) {
        try {

            ResultSet rs = (ResultSet) DbOperations.getData("select *from user where email= '" + email + "' and password='" + oldPassword + "'");
            if(rs.next()){
                update(email, newPassword);
            }else{
                 JOptionPane.showMessageDialog(null, "Old Password is Wrong");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
