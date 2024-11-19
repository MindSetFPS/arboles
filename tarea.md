# Arboles binarios

## Recorrido en profundidad

### Preorden

#### Algoritmo

1. Si estamos en un punto donde no hay nodos que procesar, nos detenemos y terminamos la ejecución.
2. Sino, marcamos el nodo actual como visitado.
3. Nos movemos al siguiente nodo del lado izquierdo.
4. Si no hay un nodo izquierdo que visitar, nos movemos al lado derecho, ya sea dentro de la rama actual, o dentro de la padre.

