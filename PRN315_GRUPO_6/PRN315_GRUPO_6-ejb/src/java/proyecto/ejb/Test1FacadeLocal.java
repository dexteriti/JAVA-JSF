/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import java.util.List;
import javax.ejb.Local;
import proyecto.entidades.Test1;

/**
 *
 * @author PC-BT2
 */
@Local
public interface Test1FacadeLocal {

    void create(Test1 test1);

    void edit(Test1 test1);

    void remove(Test1 test1);

    Test1 find(Object id);

    List<Test1> findAll();

    List<Test1> findRange(int[] range);

    int count();
    
}
