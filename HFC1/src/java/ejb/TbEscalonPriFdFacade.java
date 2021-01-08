/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entidades.TbEscalonPriFd;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC-BT2
 */
@Stateless
public class TbEscalonPriFdFacade extends AbstractFacade<TbEscalonPriFd> implements TbEscalonPriFdFacadeLocal {

    @PersistenceContext(unitName = "HFC1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbEscalonPriFdFacade() {
        super(TbEscalonPriFd.class);
    }
    
}
