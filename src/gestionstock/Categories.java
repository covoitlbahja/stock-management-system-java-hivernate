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
public class Categories implements Serializable {
    @Id
    private int id_cat;
    private String lib_cat;

    public Categories() {
    }
    
    
    public Categories(int id_cat, String lib_cat) {
        this.id_cat = id_cat;
        this.lib_cat = lib_cat;
    }
    

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public String getLib_cat() {
        return lib_cat;
    }

    public void setLib_cat(String lib_cat) {
        this.lib_cat = lib_cat;
    }
    
    
}
