/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entidades.TbEscalonPriFd;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PC-BT2
 */
@Local
public interface TbEscalonPriFdFacadeLocal {

    void create(TbEscalonPriFd tbEscalonPriFd);

    void edit(TbEscalonPriFd tbEscalonPriFd);

    void remove(TbEscalonPriFd tbEscalonPriFd);

    TbEscalonPriFd find(Object id);

    List<TbEscalonPriFd> findAll();

    List<TbEscalonPriFd> findRange(int[] range);

    int count();
    
}
