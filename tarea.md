

![](utm.png "Title")

# TSU Desarrollo de Software Multiplataforma
# Daniel Ivan Escobar Vasquez
# Ruth Martinez Dominguez
# Estructura de Datos - 4F
# Universidad Tecnológica Metropolitana
# Práctica 2 Arboles Binarios
# 24 de Noviembre del 2024


\pagebreak


# Arboles binarios

## Recorrido en Amplitud

#### Algoritmo

1. Creamos una lista donde el unico elemento es el nodo raíz.
2. Si la lista no tiene elementos, retornamos terminando la ejecución.
3. Sino, procesamos el valor del primer elemento de la lista.
4. Si hay un nodo izquiero, lo añadimos a la lista.
5. Si hay un nodo derecho, lo añadimos a la lista.
6. Volvemos al paso 2.

## Recorrido en profundidad

### Preorden

#### Algoritmo

1. Si estamos en un punto donde no hay nodos que procesar, nos detenemos y terminamos la ejecución.
2. Sino, marcamos el nodo actual como visitado.
3. Nos movemos al siguiente nodo del lado izquierdo.
4. Si no hay un nodo izquierdo que visitar, nos movemos al lado derecho, ya sea dentro de la rama actual, o dentro de la padre.

### Inorden

#### Algoritmo

1. Si estamos en un punto donde no hay nodos que procesar, nos detenemos y terminamos la ejecución.
2. Sino, nos movemos al nodo hizo izquirdo hasta llegar a un punto donde no queden más nodos a la izquierda.
3. Nos movemos al nodo padre, y lo marcamos como padre.
4. Visitamos todos los nodos derechos que queden.

### Postorden

#### Algoritmo

1. Si estamos en un punto donde no hay nodos restantes que procesar, nos detenemos y terminamos la ejecución.
2. Avanzamos hacia la izquierda hasta llegar a un nodo sin hijos.
3. Cambiamos al nodo hermano.
4. Repetimos el paso 2. hasta que no queden nodos del lado derecho ni izquierdo.
5. Retrocedemos a un nodo anterior que si tenga hermanos.
6. Repetimos el paso 2 hasta que no queden nodos.

# Arbol binario 1

## Recorrido en amplitud

![](1amplitud.png)

## Preorden

![](1preorden.png)

## Inorden

![](1inorden.png)

## Postorden

![](1postorden.png)

# Arbol binario 2

## Recorrido en amplitud

![](2amplitud.png)

## Preorden

![](2preorden.png)

## Inorden

![](2inorden.png)

## Postorden

![](2postorden.png)

# Arbol binario 3

## Recorrido en amplitud

![](3amplitud.png)

## Preorden

![](3preorden.png)

## Inorden

![](3inorden.png)

## Postorden

![](3postorden.png)

# Arbol binario 4

## Recorrido en amplitud

![](4amplitud.png)

## Preorden

![](4preorden.png)

## Inorden

![](4inorden.png)

## Postorden

![](4postorden.png)

# Arbol binario 5

## Recorrido en amplitud

![](5amplitud.png)

## Preorden

![](5preorden.png)

## Inorden

![](5inorden.png)

## Postorden

![](5postorden.png)