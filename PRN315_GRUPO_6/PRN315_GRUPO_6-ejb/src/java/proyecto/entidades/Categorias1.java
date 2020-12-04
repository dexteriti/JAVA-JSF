/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LM
 */
@Entity
@Table(name = "Categorias1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorias1.findAll", query = "SELECT c FROM Categorias1 c")
    , @NamedQuery(name = "Categorias1.findByCategoriaID", query = "SELECT c FROM Categorias1 c WHERE c.categoriaID = :categoriaID")
    , @NamedQuery(name = "Categorias1.findByNombreCategoria", query = "SELECT c FROM Categorias1 c WHERE c.nombreCategoria = :nombreCategoria")
    , @NamedQuery(name = "Categorias1.findByDescripcion", query = "SELECT c FROM Categorias1 c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Categorias1.findByFoto", query = "SELECT c FROM Categorias1 c WHERE c.foto = :foto")})
public class Categorias1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CategoriaID")
    private Integer categoriaID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NombreCategoria")
    private String nombreCategoria;
    @Size(max = 1073741823)
    @Column(name = "Descripcion")
    private String descripcion;
    @Size(max = 1)
    @Column(name = "Foto")
    private String foto;

    public Categorias1() {
    }

    public Categorias1(Integer categoriaID) {
        this.categoriaID = categoriaID;
    }

    public Categorias1(Integer categoriaID, String nombreCategoria) {
        this.categoriaID = categoriaID;
        this.nombreCategoria = nombreCategoria;
    }

    public Integer getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(Integer categoriaID) {
        this.categoriaID = categoriaID;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriaID != null ? categoriaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorias1)) {
            return false;
        }
        Categorias1 other = (Categorias1) object;
        if ((this.categoriaID == null && other.categoriaID != null) || (this.categoriaID != null && !this.categoriaID.equals(other.categoriaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.Categorias1[ categoriaID=" + categoriaID + " ]";
    }
    
}
