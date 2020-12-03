/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import proyecto.entidades.Test1;

/**
 *
 * @author PC-BT2
 */
@Stateless
public class Test1Facade extends AbstractFacade<Test1> implements Test1FacadeLocal {

    @PersistenceContext(unitName = "PRN315_GRUPO_6-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Test1Facade() {
        super(Test1.class);
    }
    
}
