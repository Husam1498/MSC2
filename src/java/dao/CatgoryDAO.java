/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import util.DBConnection;
import entity.Category;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author husam
 */
//COuntry ülkesi için KOMUTLAR
public class CatgoryDAO extends DBConnection {

    private Connection db;

    public void createCategory(Category c) {
        try {

            Statement st = this.getDb().createStatement();
            String query = "insert into country (country_id,name) values('" + c.getId() + "','" + c.getName() + "')";
            int r = st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void delete(Category c) {
        try {

            Statement st = this.getDb().createStatement();
            String query2 = "delete from country where country_id='"+ c.getId()+"'" ;
            // System.out.println(query2);
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public List<Category> getcategoryList() {
        List<Category> categoryList = new ArrayList<>();
        try {
            Statement st = this.getDb().createStatement();
            String query = "select * from country order by country_id";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                categoryList.add(new Category(rs.getString("country_id"), rs.getString("name")));//country tablosuna id ve name sütunlarının verileri girildi
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return categoryList;
    }

    public Connection getDb() {
        if (this.db == null) {
            this.db = this.connect();//veri tabanından yeni bağlantı oluşturur
        }
        return db;
    }

    public void setDb(Connection c) {
        this.db = db;
    }

}
