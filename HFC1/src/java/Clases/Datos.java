
package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PC-BT2
 */
public class Datos {
    
    public void ingresoDatos(){
        
       List<Enlace>Medicion;
        
            
        Medicion = new ArrayList<>();
        
        Medicion.add(new Enlace("2020-12-20",-1.8f));
        Medicion.add(new Enlace("2020-12-21",-1.9f));
        Medicion.add(new Enlace("2020-12-22",-1.8f));
        Medicion.add(new Enlace("2020-12-23",-1.9f));
        Medicion.add(new Enlace("2020-12-28",-2f));
        Medicion.add(new Enlace("2020-12-29",-2.0f));
        Medicion.add(new Enlace("2020-12-30",-1.9f));
  
       
        System.out.println(Medicion.size());
        
     
        
        
        
        // Obtenemos un Iterador y recorremos la lista.
        Iterator iter = Medicion.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
