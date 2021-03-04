package edu.eci.cvds.servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Math;

public class BackkingBean{

    private double[] v;
    private double result;
    private int cant;
    public BackkingBean(){
        this.v=v;
        result = 0;
    }
    public void restart() {
        new BackkingBean();
    }
    public void setResult(double result){
        this.result = result;}

    public void setCant(int cant){
        this.cant = cant;
    }

    public double getResult(){
        return this.result;
    }

    public static double caculateMean(double[] v)
    {
        double sum = 0;
        for(int i = 0; i < v.length; i++)
        {
            sum += v[i];
        }
        return sum / v.length;
    }


    public double calculateStandardDeviation(){
        double prom = caculateMean(v);
        double desvia = 0;
        for (int i = 0;i<v.length;i++) {
            desvia = ((desvia + v[i]) - prom);
        }
        desvia =  Math.pow(desvia, 2);
        result = Math.sqrt(desvia/v.length);
        return result;
    }
    public static double calculateVariance(double[] v){
        double m=caculateMean(v);
        double sum=0;
        for(int i=0; i<v.length; i++){
            sum+=Math.pow(v[i],2.0);
        }

        return sum/v.length-Math.pow(m,2.0);
    }



    public double calculateMode(double[] v){
        int cont=0;
        double num=0;
        for(int i=0; i<v.length; i++){
            int aux=0;
            for(int j=0; j<v.length; j++){
                if(v[i]==v[j]) aux++;
            }
            if(aux>=cont){
                cont=aux;
                num=v[i];
            }
        }
        return num;
    }

}