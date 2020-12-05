
package mantenimiento;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import proyecto.ejb.ProveedoresFacadeLocal;
import proyecto.entidades.Proveedores;


@Named(value = "proveedoresBean")
@SessionScoped
public class ProveedoresBean implements Serializable {

    @EJB
    private ProveedoresFacadeLocal proveedoresFacade;
    
    private Proveedores proveedores;
        
    
    public ProveedoresBean() {
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    
       public List<Proveedores> getIdProveedores(){
        return proveedoresFacade.findAll();
}
}
