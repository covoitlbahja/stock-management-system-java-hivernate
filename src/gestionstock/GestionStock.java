/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import javax.transaction.HeuristicMixedException;
import javax.transaction.RollbackException;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author tahar
 */
public class GestionStock {

    /**
     * @param args the command line arguments
     * @throws javax.transaction.RollbackException
     * @throws javax.transaction.HeuristicMixedException
     */
    public static void main(String[] args) throws RollbackException, HeuristicMixedException, SecurityException {
       home hm = new home();
       hm.setVisible(true);
        
        // TODO code application logic here
    }
    
}
