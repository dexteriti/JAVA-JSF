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
 * @author PC-BT2
 */
@Entity
@Table(name = "Test1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Test1.findAll", query = "SELECT t FROM Test1 t")
    , @NamedQuery(name = "Test1.findById", query = "SELECT t FROM Test1 t WHERE t.id = :id")
    , @NamedQuery(name = "Test1.findByNombre", query = "SELECT t FROM Test1 t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Test1.findByNumero", query = "SELECT t FROM Test1 t WHERE t.numero = :numero")
    , @NamedQuery(name = "Test1.findByDescripcion", query = "SELECT t FROM Test1 t WHERE t.descripcion = :descripcion")})
public class Test1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private float numero;
    @Size(max = 20)
    @Column(name = "descripcion")
    private String descripcion;

    public Test1() {
    }

    public Test1(Integer id) {
        this.id = id;
    }

    public Test1(Integer id, String nombre, float numero) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test1)) {
            return false;
        }
        Test1 other = (Test1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.entidades.Test1[ id=" + id + " ]";
    }
    
}
