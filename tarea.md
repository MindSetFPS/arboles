# Arboles binarios

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