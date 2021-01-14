
package Clases;

/**
 *
 * @author PC-BT2
 */
public class Enlace {

        
    String Fecha;
    float nivel_op;

    public Enlace(String Fecha, float nivel_op) {
        this.Fecha = Fecha;
        this.nivel_op = nivel_op;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public float getNivel_op() {
        return nivel_op;
    }

    public void setNivel_op(float nivel_op) {
        this.nivel_op = nivel_op;
    }

    @Override
    public String toString() {
        return "Enlace{" + "Fecha=" + Fecha + ", nivel_op=" + nivel_op + '}';
    }
    
    
    
}
