
package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PC-BT2
 */
public class Test {
    
    public static void main(String[] args) {
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
        System.out.println("*");
        
        
        imprimir((ArrayList<Enlace>) Medicion);
        
}
    
    public static void imprimir(ArrayList<Enlace> lista){
        for(Enlace elemento: lista){
            System.out.println(elemento+" ");
        }
        System.out.println();
    }
       
      
        
    }
    

