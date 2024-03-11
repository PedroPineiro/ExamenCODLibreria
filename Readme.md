# Proyecto Raíces

Este proyecto consiste en la implementación de un método para calcular cualquier raíz de un número.

## Proceso de desarrollo

1. Creé una nueva rama llamada 'raiz'.
2. Me moví a esta rama para trabajar en ella.
3. Creé la clase `Raices`.
4. Implementé el método `calcularRaiz` que permite calcular cualquier raíz de un número.
5. Generé la documentación Javadoc para la clase `Raices`.
6. Implementé el método `calcularRaiz` en la clase `Main` para comprobar que funciona correctamente.

## Método calcularRaiz

El método `calcularRaiz` en la clase `Raices` se podría implementar de la siguiente manera si solamente quisieramos calcular la raíz cuadrada o cúbica de un número:

```java
public double calcularRaiz(int indice, double numero) {
    double resultado = 0;
    if (indice == 2) {
        resultado = Math.sqrt(numero);
    } else if (indice == 3) {
        resultado = Math.cbrt(numero);
    }
    return resultado;
}
```
## Realizar un .jar del código

1. Asegurarse de que no haya errores de compilación en el código.
2. File.
3. Project Structure.
4. Artifacts.
5. +.
6. JAR.
7. From modules with dependencies.
8. Selecciona tu clase Main → OK.
9. OK.
10. Build.
11. Build Artifacts.
12. Selecciona el JAR que acabas de configurar → Build.

