/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

   private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Week9LabPU");
   
   public static EntityManagerFactory getEntityManagerFactory () {
       return EMF;
   }
}
