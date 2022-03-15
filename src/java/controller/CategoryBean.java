/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.CatgoryDAO;
import entity.Category;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author husam
 */
@Named(value = "categoryBean")
@SessionScoped
public class CategoryBean implements Serializable {

    private Category entity;
    private CatgoryDAO dao;
    private List<Category> list;

    public CategoryBean() {
    }

    public void create() {
        this.getDao().createCategory(entity);
    }

    public void delete(Category c) {
        this.getDao().delete(c);
    }

    public Category getEntity() {
        if (this.entity == null) {
            this.entity = new Category();//boş ise yeni bir satır oluşturur
        }
        return entity;
    }

    public void setEntity(Category entity) {
        this.entity = entity;
    }

    public CatgoryDAO getDao() {
        if (this.dao == null) {
            this.dao = new CatgoryDAO();//boş ise yeni bir satır oluşturur
        }
        return dao;
    }

    public void setDao(CatgoryDAO dao) {
        this.dao = dao;
    }

    public List<Category> getList() {
        this.list = this.getDao().getcategoryList();
        return list;
    }

    public void setList(List<Category> list) {
        this.list = list;
    }

}
