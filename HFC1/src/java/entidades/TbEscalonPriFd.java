/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC-BT2
 */
@Entity
@Table(name = "tb_escalon_pri_fd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEscalonPriFd.findAll", query = "SELECT t FROM TbEscalonPriFd t")
    , @NamedQuery(name = "TbEscalonPriFd.findById", query = "SELECT t FROM TbEscalonPriFd t WHERE t.id = :id")
    , @NamedQuery(name = "TbEscalonPriFd.findByFecha", query = "SELECT t FROM TbEscalonPriFd t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "TbEscalonPriFd.findByOp", query = "SELECT t FROM TbEscalonPriFd t WHERE t.op = :op")})
public class TbEscalonPriFd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "op")
    private float op;

    public TbEscalonPriFd() {
    }

    public TbEscalonPriFd(Integer id) {
        this.id = id;
    }

    public TbEscalonPriFd(Integer id, Date fecha, float op) {
        this.id = id;
        this.fecha = fecha;
        this.op = op;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getOp() {
        return op;
    }

    public void setOp(float op) {
        this.op = op;
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
        if (!(object instanceof TbEscalonPriFd)) {
            return false;
        }
        TbEscalonPriFd other = (TbEscalonPriFd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbEscalonPriFd[ id=" + id + " ]";
    }
    
}
