package proyecto.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto.entidades.Productos;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-02T16:33:01")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-01T22:21:02")
>>>>>>> 256caaf4778146209830ea5c6285455388f412b9
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile SingularAttribute<Categorias, String> descripcion;
    public static volatile SingularAttribute<Categorias, byte[]> foto;
    public static volatile ListAttribute<Categorias, Productos> productosList;
    public static volatile SingularAttribute<Categorias, Integer> categoriaID;
    public static volatile SingularAttribute<Categorias, String> nombreCategoria;

}