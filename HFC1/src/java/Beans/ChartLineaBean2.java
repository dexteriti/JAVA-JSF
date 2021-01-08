
package Beans;

import Clases.Enlace;
import ejb.TbEscalonPriFdFacadeLocal;
import entidades.TbEscalonPriFd;
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
import java.util.LinkedHashMap;
import java.util.Map;
import javax.ejb.EJB;


/**
 *
 * @author PC-BT2
 */
@Named
@RequestScoped
public class ChartLineaBean2 implements Serializable {

    @EJB
    private TbEscalonPriFdFacadeLocal tbEscalonPriFdFacade;
    
    private TbEscalonPriFd enlace;
 
    private LineChartModel lineModel1;
    
    private LineChartModel lineModel3;
   
    private LineChartModel zoomModel;

   
    private LineChartModel areaModel;
    
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

    public ChartLineaBean2() {
        this.enlace = new TbEscalonPriFd();
    }
    
    
 
    public LineChartModel getLineModel1() {
        return lineModel1;
    }
 
    public LineChartModel getLineModel3() {
        return lineModel3;
    }
 
    public LineChartModel getDateModel() {
        return dateModel;
    }
    
    public List<TbEscalonPriFd> getLista(){
        return tbEscalonPriFdFacade.findAll();
    }
 /*
    private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 90);
        girls.set("2008", 120);
 
        model.addSeries(boys);
        model.addSeries(girls);
 
        return model;
    }
 */
    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Grafico de Prueba");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(-10);
        yAxis.setMax(10);
 /*
        lineModel2 = initCategoryModel();
        lineModel2.setTitle("Category Chart");
        lineModel2.setLegendPosition("e");
        lineModel2.setShowPointLabels(true);
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Years"));
        yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(200);*/
 
        zoomModel = initLinearModel();
        zoomModel.setTitle("Zoom");
        zoomModel.setZoom(true);
        zoomModel.setLegendPosition("e");
        yAxis = zoomModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
    }
 /*
    private void createAreaModel() {
        areaModel = new LineChartModel();
 
        LineChartSeries boys = new LineChartSeries();
        boys.setFill(true);
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
 
        LineChartSeries girls = new LineChartSeries();
        girls.setFill(true);
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 90);
        girls.set("2008", 120);
 
        areaModel.addSeries(boys);
        areaModel.addSeries(girls);
 
        areaModel.setTitle("Area Chart");
        areaModel.setLegendPosition("ne");
        areaModel.setStacked(true);
        areaModel.setShowPointLabels(true);
 
        Axis xAxis = new CategoryAxis("Years");
        areaModel.getAxes().put(AxisType.X, xAxis);
        Axis yAxis = areaModel.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(300);
    }
 */
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
  
       
        System.out.println(Medicion.size());
        
     
        
        
        
        // Obtenemos un Iterador y recorremos la lista.
        Iterator iter = Medicion.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
          
                
    }// finaliza llenado de datos
    
    private LineChartModel graficar(List<Enlace> medicion){
        LineChartModel model = new LineChartModel();
        
        lineModel3.setTitle("Grafico de Prueba2");
        lineModel3.setLegendPosition("e");
        Axis yAxis = lineModel3.getAxis(AxisType.Y);
        yAxis.setMin(-10);
        yAxis.setMax(10);
        
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Enlace FD Escalon");
        
        for(Enlace enla : medicion){
           series1.set(enla.getFecha(), enla.getNivel_op());
        }
        
        model.addSeries(series1);
   
 
        return model;
        
    }
    
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 10");
 
        series1.set("2020-12-12", -1.9);
        series1.set("2020-12-14", -2);
       
 
        
 
        model.addSeries(series1);
   
 
        return model;
    }
 /*
    private void createFillToZero() {
        fillToZero = new CartesianChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");
 
        series1.set("4, -3, 3, 6, 2, -2", 0);
 
        fillToZero.addSeries(series1);
    }
 */
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