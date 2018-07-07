/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tahar
 */
@Entity
@Table(name = "Produits")
public class Produits implements Serializable {
    @Id
    private int id_prod;
    private String lib_prod;
    private String desc_prod;
    private float prix_prod;
    private int id_cat;
    private int id_four;

    public Produits() {
    }

    public Produits(int id_prod, String lib_prod, String desc_prod, float prix_prod, int id_cat, int id_four) {
        this.id_prod = id_prod;
        this.lib_prod = lib_prod;
        this.desc_prod = desc_prod;
        this.prix_prod = prix_prod;
        this.id_cat = id_cat;
        this.id_four = id_four;
    }
    

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getLib_prod() {
        return lib_prod;
    }

    public void setLib_prod(String lib_prod) {
        this.lib_prod = lib_prod;
    }

    public String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public float getPrix_prod() {
        return prix_prod;
    }

    public void setPrix_prod(float prix_prod) {
        this.prix_prod = prix_prod;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public int getId_four() {
        return id_four;
    }

    public void setId_four(int id_four) {
        this.id_four = id_four;
    }

    @Override
    public String toString() {
        return "Produits{" + "id_prod=" + id_prod + ", lib_prod=" + lib_prod + ", desc_prod=" + desc_prod + ", prix_prod=" + prix_prod + ", id_cat=" + id_cat + ", id_four=" + id_four + '}';
    }
    
     
}
