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
public class Fournisseurs implements Serializable {
    @Id
    private int id_four;
    private String nom_four;
    private int id_cat;

    public Fournisseurs() {
    }
    

    public Fournisseurs(int id_four, String nom_four, int id_cat) {
        this.id_four = id_four;
        this.nom_four = nom_four;
        this.id_cat = id_cat;
    }
    

    public int getId_four() {
        return id_four;
    }

    public void setId_four(int id_four) {
        this.id_four = id_four;
    }

    public String getNom_four() {
        return nom_four;
    }

    public void setNom_four(String nom_four) {
        this.nom_four = nom_four;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }
    
    
    
}
