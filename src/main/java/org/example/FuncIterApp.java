package org.example;

public class FuncIterApp {
    public double operar(double x, double y){
        Operacion op= (n1,n2) -> (n1+n2);
        return  op.calcular(x,y);
    }
}
