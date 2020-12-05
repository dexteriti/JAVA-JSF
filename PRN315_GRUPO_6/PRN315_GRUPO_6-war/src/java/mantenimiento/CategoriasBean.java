package mantenimiento;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import proyecto.ejb.CategoriasFacadeLocal;
import proyecto.entidades.Categorias;

@Named(value = "categoriasBean")
@SessionScoped

public class CategoriasBean implements Serializable {

    @EJB
    private CategoriasFacadeLocal categoriasFacade;
    
    private Categorias categoria;
    private List<Categorias> categotiaList; 
    
    
    public CategoriasBean() {
        this.categoria = new Categorias();
    }
    
    public Categorias getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    public List<Categorias> findAll() {
        return this.categoriasFacade.findAll();
    }
    
    
    
    public void saveCategoria() {
        if (this.categoria.getCategoriaID() != null) {
            this.categoriasFacade.edit(this.categoria);
        } else {
            this.categoriasFacade.create(this.categoria);
        }
        this.cleanCategoria();
    }
    
    public Categorias findById(Integer id) {
        return this.categoriasFacade.find(id);
    }
    
    public void cleanCategoria() {
        this.categoria = new Categorias();
    }
    
    
    
}