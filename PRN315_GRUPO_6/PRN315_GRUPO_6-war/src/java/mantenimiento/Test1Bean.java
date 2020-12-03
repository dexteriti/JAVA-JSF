
package mantenimiento;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import proyecto.ejb.Test1FacadeLocal;
import proyecto.entidades.Test1;


@Named(value = "test1Bean")
@SessionScoped
public class Test1Bean implements Serializable {

    @EJB
    private Test1FacadeLocal test1Facade;
    
    private Test1 test1;
    
    public Test1Bean( ) {
        this.test1 = new Test1();
    }

    public Test1 getTest1() {
        return test1;
    }

    public void setTest1(Test1 test1) {
        this.test1 = test1;
    }
    
    public List<Test1> findAll() {
        return test1Facade.findAll();
    }
    
    public void saveTest1() {
        if (this.test1.getId()!= null) {
            this.test1Facade.edit(this.test1);
        } else {
            this.test1Facade.create(this.test1);
        }
        this.cleanTest1();
    }
    
    public void cleanTest1() {
        this.test1 = new Test1();
    }
    
    public Test1 findById(Integer id) {
        return this.test1Facade.find(id);
    }
    
    
}
