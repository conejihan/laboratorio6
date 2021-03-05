package edu.eci.cvds.servlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.*;



@ManagedBean(name = "calculadoraBean")
@SessionScoped

public class calculadoraBean implements Serializable {

    private String v;
    private double media = 0;
    private double moda= 0;
    private double varianza=0;
    private double desviacion=0;
    private double result=0;

    private ArrayList<Double> valores;

    public ArrayList<Double> getValores() {
        return valores;
    }
    public void setValores(ArrayList<Double> valores) {
        this.valores = valores;
    }

    public double getModa() {
        return moda;
    }

    public double getDesviacion() {
        return desviacion;
    }


    public double getResult() {
        return result;
    }


    public String getV() {
        return v;
    }

    public double getVarianza() {
        return varianza;
    }

    public void setV(String v) {
        this.v = v;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setModa(double moda) {
        this.moda = moda;
    }

    public void setVarianza(double varianza) {
        this.varianza = varianza;
    }

    public void setDesviacion(double desviacion) {
        this.desviacion = desviacion;
    }

    private double[] converDouble(String v){
    	String[] datos = v.split(";");
    	double[] numeros = new double[datos.length];
        for (int i = 0; i < datos.length; i++) numeros[i] = Double.parseDouble(datos[i]);
        return numeros;

    }
    public void reiniciarLista(){
        valores = new ArrayList<Double>();
    }

    public calculadoraBean(){
        this.v=v;
        this.media=media;
        this.moda=moda;
        this.varianza=varianza;
        this.desviacion=desviacion;
        valores = new ArrayList<Double>();
    }
    public void restart() {
        for(double i: converDouble(v)) valores.add(i);
        this.v = "";
        this.media=0;
        this.moda=0;
        this.varianza=0;
        this.desviacion=0;


    }

    public void setResult(double result){
        this.result = result;}


    public double getMedia() {
        return media;
    }

    public void caculateMean()

    {
        double[] nums = converDouble(v);
        double sum = 0;
        for(int i = 0; i < nums.length; i++) sum += nums[i];
        media = sum / nums.length;
    }


    public void calculateStandardDeviation(){
        caculateMean();
        double prom = media;
        double[] nums = converDouble(v);
        double desvia = 0;
        for (int i = 0;i<nums.length;i++)
            desvia += Math.pow(nums[i] - prom,2);
        result = Math.sqrt(desvia/nums.length);
        desviacion = result;
    }
    public  void calculateVariance(){
        calculateStandardDeviation();

        varianza = desviacion*desviacion;
    }



    public void calculateMode(){
        int cont=0;
        double num=0;
        double[] nums = converDouble(v);
        for(int i=0; i<nums.length; i++){
            int aux=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]) aux++;
            }
            if(aux>=cont){
                cont=aux;
                num=nums[i];
            }
        }
        moda = num;
    }

}