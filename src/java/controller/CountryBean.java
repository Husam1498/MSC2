/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.CountryDAO;
import entity.Country;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author husam
 */
@Named(value = "countryBean")
@SessionScoped
public class CountryBean implements Serializable {

    private Country entity;
    private CountryDAO dao;
    private List<Country> list;

    public CountryBean() {
    }

    public void create() {
        this.getDao().CountryDAO(entity);
    }

    public void delete(Country c) {
        this.getDao().delete(c);
    }

    public Country getEntity() {
        if (this.entity == null) {
            this.entity = new Country();//boş ise yeni bir satır oluşturur
        }
        return entity;
    }

    public void setEntity(Country entity) {
        this.entity = entity;
    }

    public CountryDAO getDao() {
        if (this.dao == null) {
            this.dao = new CountryDAO();//boş ise yeni bir satır oluşturur
        }
        return dao;
    }

    public void setDao(CountryDAO dao) {
        this.dao = dao;
    }

    public List<Country> getList() {
        this.list = this.getDao().getcategoryList();
        return list;
    }

    public void setList(List<Country> list) {
        this.list = list;
    }

}
