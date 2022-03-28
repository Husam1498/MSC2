package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "loginBean")
@SessionScoped

public class LoginBean implements Serializable {

    private String userName;
    private String password;

    public LoginBean() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String validateUserLogin() {
        String navResult = "";
        System.out.println("Entered Username is= " + userName + ", password is" + password);//kullanıcının adını ve şifresini alır
        if (userName.equalsIgnoreCase("javacodegeeks") && password.equals("access123")) {
            navResult = "success";//şifre ve kullanıcı doğruysa success.xhtml sayfasına gönderir
        } else {
            navResult = "failure";//şifre ve kullanıcı yanlışsa failure.xhtml sayfasına gönderir
        }
        return navResult;
    }

}
