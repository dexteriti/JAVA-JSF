
package Beans;

import Clases.Enlace;


import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PC-BT2
 */
@Named
@RequestScoped
public class ChartLineaBean2 implements Serializable {

    private LineChartModel lineModel1;
    
    private LineChartModel zoomModel;

    private LineChartModel dateModel;
 
    @PostConstruct
    public void init() {
        createLineModels();
     //   createAreaModel();
    
        createDateModel();
    }
 
    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
 
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public LineChartModel getLineModel1() {
        return lineModel1;
    }
    
    public LineChartModel getDateModel() {
        return dateModel;
    }
     
    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Grafico de Prueba");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(-10);
        yAxis.setMax(10);
  
        zoomModel = initLinearModel();
        zoomModel.setTitle("Zoom");
        zoomModel.setZoom(true);
        zoomModel.setLegendPosition("e");
        yAxis = zoomModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
    }

    //inicia donde estan los datos
    public void ingresoDatos(){
        
       List<Enlace>Medicion;
        
            
        Medicion = new ArrayList<>();
        
        Medicion.add(new Enlace("2020-12-20",-1.8f));
        Medicion.add(new Enlace("2020-12-21",-1.9f));
        Medicion.add(new Enlace("2020-12-22",-1.8f));
        Medicion.add(new Enlace("2020-12-23",-1.9f));
        Medicion.add(new Enlace("2020-12-28",-2f));
        Medicion.add(new Enlace("2020-12-29",-2.0f));
        Medicion.add(new Enlace("2020-12-30",-1.9f));
  
        // Obtenemos un Iterador y recorremos la lista.
        Iterator iter = Medicion.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
                       
    }// finaliza llenado de datos
    
      
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 10");
 
        series1.set("2020-12-12", -1.9);
        series1.set("2020-12-14", -2);
            
 
        model.addSeries(series1);
   
        return model;
    }
 
    private void createDateModel() {
        dateModel = new LineChartModel();
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");
 /*
        series1.set("2020-12-12", -1.9);
        series1.set("2020-12-14", -2);
        series1.set("2020-12-15", -2);
        series1.set("2020-12-16", -1.9);
        series1.set("2020-12-17", -1.9);
        series1.set("2020-12-18", -2.1);*/
        List<Enlace>Medicion; //declaro una lista que se llama Medicion donde guardaremos los datos
        
            
        Medicion = new ArrayList<>(); // creamos la lista
        
        Medicion.add(new Enlace("2020-12-20",-1.8f));//agregamos los datos manualmente en la lista, que a la vez crea los objetos de tipo enlace con los 2 valores
        Medicion.add(new Enlace("2020-12-21",-1.9f));
        Medicion.add(new Enlace("2020-12-22",-1.8f));
        Medicion.add(new Enlace("2020-12-23",-1.9f));
        Medicion.add(new Enlace("2020-12-28",-2f));
        Medicion.add(new Enlace("2020-12-29",-2.0f));
        Medicion.add(new Enlace("2020-12-30",-1.9f));
 
        for(Enlace enla : Medicion){
           series1.set(enla.getFecha(), enla.getNivel_op()); // con este for recorremos la lista y cada vez que se ejecuta crea los puntos en la grafica
        }
        
 
        dateModel.addSeries(series1);
        
        dateModel.setTitle("Zoom for Details");
        dateModel.setZoom(true);
        dateModel.getAxis(AxisType.Y).setLabel("Values");
        DateAxis axis = new DateAxis("Fecha");
        axis.setTickAngle(-60);     //angulo de la etiqueta eje x
        axis.setMax("2020-12-31");
        axis.setTickFormat("%b %#d, %y");
 
        dateModel.getAxes().put(AxisType.X, axis);
    }
}