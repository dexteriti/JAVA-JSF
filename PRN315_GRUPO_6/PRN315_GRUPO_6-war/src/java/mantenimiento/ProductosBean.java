package mantenimiento;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import proyecto.ejb.ProductosFacadeLocal;
import proyecto.entidades.Productos;

/**
 *
 * @author LM
 */
@ManagedBean(name = "productosBean")
@SessionScoped
public class ProductosBean implements Serializable {

    @EJB     
    private ProductosFacadeLocal productosFacade;
    private Productos producto;
    
    public ProductosBean() {
        this.producto = new Productos();
    }
      
    public void cleanProducto() {
        this.producto = new Productos();
    }

    public Productos getProducto() {
        return this.producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public void create(Productos productos) {
        productosFacade.create(productos);
    }

    public void edit(Productos productos) {
        productosFacade.edit(productos);
    }

    public void remove(Productos productos) {
        productosFacade.remove(productos);
    }

    public Productos find(Object id) {
        return productosFacade.find(id);
    }

    public List<Productos> findAll() {
        return productosFacade.findAll();
    }

    public List<Productos> findRange(int[] range) {
        return productosFacade.findRange(range);
    }

    public int count() {
        return productosFacade.count();
    }
    
     
    public void saveProducto() {
        if ((this.producto.getProductoID())!= (null)) {
            this.productosFacade.edit(this.producto);
        } else {
            this.productosFacade.create(this.producto);
        }
        this.cleanProducto();
    }
    
     

    public boolean getDiscontinuado() {
        return producto.getDiscontinuado();
    }
 
    
    
    
}





















