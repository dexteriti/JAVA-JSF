package proyecto.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.Categorias;
import proyecto.entidades.Proveedores;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-02T16:33:01")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-01T22:21:02")
>>>>>>> 256caaf4778146209830ea5c6285455388f412b9
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Short> unidadesPorOrden;
    public static volatile SingularAttribute<Productos, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<Productos, Proveedores> proveedorID;
    public static volatile SingularAttribute<Productos, String> cantidadPorUnidad;
    public static volatile SingularAttribute<Productos, Integer> productoID;
    public static volatile SingularAttribute<Productos, Short> unidadesEnAlmacen;
    public static volatile SingularAttribute<Productos, Short> nivelImportancia;
    public static volatile SingularAttribute<Productos, Boolean> discontinuado;
    public static volatile SingularAttribute<Productos, String> nombreProducto;
    public static volatile SingularAttribute<Productos, Categorias> categoriaID;

}