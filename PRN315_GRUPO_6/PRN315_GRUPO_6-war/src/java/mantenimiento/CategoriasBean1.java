package mantenimiento;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import proyecto.ejb.Categorias1FacadeLocal;
import proyecto.entidades.Categorias1;

@Named(value = "categoriasBean1")
@SessionScoped

public class CategoriasBean1 implements Serializable {

    

    @EJB
    private Categorias1FacadeLocal categorias1Facade;

    private Categorias1 categoria1;
    
    
    public CategoriasBean1() {
        this.categoria1 = new Categorias1();
    }

    public Categorias1 getCategoria1() {
        return categoria1;
    }

    public void setCategoria1(Categorias1 categoria1) {
        this.categoria1 = categoria1;
    }
    
    
    
    public List<Categorias1> findAll() {
        return this.categorias1Facade.findAll();
    }
    public void cleanCategoria1() {
        this.categoria1 = new Categorias1();
    }
    public void saveCategoria1() {
        if (this.categoria1.getCategoriaID() != null) {
            this.categorias1Facade.edit(this.categoria1);
        } else {
            this.categorias1Facade.create(this.categoria1);
        }
        this.cleanCategoria1();
    }
    
    public Categorias1 findById(Integer id) {
        return this.categorias1Facade.find(id);
    }
    
    
    
    
    public void deleteCategoria1() {
        this.categorias1Facade.remove(categoria1);
        this.cleanCategoria1();
    }
    
    
    
}