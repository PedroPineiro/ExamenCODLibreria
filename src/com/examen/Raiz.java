package com.examen;

// clase com.examen.Raiz que contiene el método calcularRaiz que calcula la raíz de un número
public class Raiz {
    /**
     * Calcula la raíz de un número.
     *
     * @param radicando El número para el cual se va a calcular la raíz.
     * @param indice El grado de la raíz a calcular.
     * @return El resultado del cálculo de la raíz.
     * @throws IllegalArgumentException Si el radicando es negativo y el indice es par, o si el indice es cero.
     */
    public double calcularRaiz(double radicando, int indice) {
        // Comprobar si el indice es par y el radicando es negativo para lanzar una excepción
        if (radicando < 0 && indice % 2 == 0) {
            // Lanzar una excepción ya que no se puede calcular la raíz de un número negativo si el índice es par
            throw new IllegalArgumentException("Error: No se puede calcular la raíz de un número negativo si el índice es par.");
        }
        // Comprobar si el indice es cero para lanzar una excepción
        else if (indice == 0) {
            // Lanzar una excepción porque no se puede calcular la raíz si el indice es cero
            throw new IllegalArgumentException("Error: El índice no puede ser cero.");
        }
        else {
            // Calcular la raiz y devolverla como resultado del método calcularRaiz
            return Math.pow(radicando, 1.0 / indice);
        }
    }
}
