/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author tahar
 */
@Entity
public class Utilisateur implements Serializable {
    @Id
    private int id_user;
    private String login;
    private String password;
    private  final String salt= "7DIQnquYWGs3s1va8JOXinzDehhQoA";

    public String getSalt() {
        return salt;
    }

    

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    

    public Utilisateur() {
    }

    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, String salt) {
        this.password = PassWordUtils.generateSecurePassword(password, salt);
        
    }
    
    
    
}
