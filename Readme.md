# Proyecto Raíces

Este proyecto consiste en la implementación de un método para calcular cualquier raíz de un número.

## Proceso de desarrollo

1. Creé una nueva rama llamada 'raiz'.
2. Me moví a esta rama para trabajar en ella.
3. Creé la clase `Raices`.
4. Implementé el método `calcularRaiz` que permite calcular cualquier raíz de un número.
5. Generé la documentación Javadoc para la clase `Raices`.
6. Implementé el método `calcularRaiz` en la clase `com.examen.Main` para comprobar que funciona correctamente.

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
## CREACIÓN DE UNA LIBRERÍA

Crea un paquete (el nombre de los paquetes empiezan por minúscula) dentro del src donde irá el .java de la librería.
Realiza un .jar del código.

1. Asegurarse de que no haya errores de compilación en el código.
2. File.
3. Project Structure.
4. Artifacts.
5. +.
6. JAR.
7. From modules with dependencies.
8. Selecciona tu clase com.examen.Main → OK.
9. OK.
10. Build.
11. Build Artifacts.
12. Selecciona el JAR que acabas de configurar → Build.

## IMPLEMENTACIÓN DE UNA LIBRERÍA
1. File.
2. Project Structure.
3. Libraries.
4. +.
5. Java.
6. Navega hasta tu .jar y seleccionalo (carpeta del proyecto del .jar - out - artifacts - carpeta).
7. OK.
8. Para poder utilizar ahora nuestra librería, debemos importarla con el nombre del paquete delante
