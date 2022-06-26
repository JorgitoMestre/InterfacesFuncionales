package org.example;

@FunctionalInterface
//Las interfaces funcionales solo pueden definir un solo metodo, no pueden tener mas
public interface Operacion {
    double calcular(double n1, double n2);
}
