package dao;

import model.Item;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author aryan
 */
public class ItemDao {

    public static void save(Item item) {
        String query = "insert into item(name,category,price) values('" + item.getName() + "','" + item.getCategory() + "','" + item.getPrice() + "')";
        DbOperations.setDataOrDelete(query, "Item Added Successfully");
    }
    public static ArrayList<Item> getAllRecords(){
        ArrayList <Item> arrayList=new ArrayList();
        try{
            ResultSet rs = DbOperations.getData("select *from item"); 
            while(rs.next()){
                Item item=new Item();
                item.setId(rs.getInt("id"));
                item.setName(rs.getString("name"));
                item.setCategory(rs.getString("category"));
                item.setPrice(rs.getString("price"));
                arrayList.add(item);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static void update(Item item){
        String query= "update item set name='"+item.getName()+"',category='"+item.getCategory()+"',price='"+item.getPrice()+"'where id='"+item.getId()+"'";
        DbOperations.setDataOrDelete(query, "Item Added Successfully");
    }
    public static void delete(String id){
        String query="delete from item where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Item Deleted Successfully");
    }
}

