/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ejb;

import java.util.List;
import javax.ejb.Local;
import proyecto.entidades.Categorias1;

/**
 *
 * @author PC-BT2
 */
@Local
public interface Categorias1FacadeLocal {

    void create(Categorias1 categorias1);

    void edit(Categorias1 categorias1);

    void remove(Categorias1 categorias1);

    Categorias1 find(Object id);

    List<Categorias1> findAll();

    List<Categorias1> findRange(int[] range);

    int count();
    
}
