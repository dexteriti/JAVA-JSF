
package mantenimiento;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import proyecto.ejb.ProductosFacadeLocal;
import proyecto.entidades.Productos;


@Named(value = "productosBean")
@SessionScoped
public class productosBean implements Serializable {

    @EJB
    private ProductosFacadeLocal productosFacade;
    
    private Productos producto;

        public productosBean() {
            this.producto = new Productos();
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }
        
    public void cleanProducto() {
        this.producto = new Productos();
    }

    public List<Productos> findAll() {
        return this.productosFacade.findAll();
    }

    public void edit(Productos productos) {
        productosFacade.edit(productos);
    }

    public void create(Productos productos) {
        productosFacade.create(productos);
    }

    public void remove(Productos productos) {
        productosFacade.remove(productos);
    }
    
    public void saveProducto() {
        if (this.producto.getProductoID()!= null) {
            this.productosFacade.edit(this.producto);
        } else {
            this.productosFacade.create(this.producto);
        }
        this.cleanProducto();
    }
    
    public void deteteProducto(){
        this.productosFacade.remove(producto);
        this.cleanProducto();
    }
    
    
    
}
