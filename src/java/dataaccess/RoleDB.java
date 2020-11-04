package dataaccess;

import java.util.List;
import javax.persistence.EntityManager;
import models.Role;

public class RoleDB {

    public List<Role> getAll() throws Exception {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        try {
            List<Role> roles = em.createNamedQuery("Role.findAll", Role.class).getResultList();
            return roles;
        } finally {
            em.close();
        }
    }

    public Role get(int roleId) {
         EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
         try {
            Role role = em.find(Role.class, roleId);
            return role;
        } finally {
            em.close();
        }
         
    }
}
