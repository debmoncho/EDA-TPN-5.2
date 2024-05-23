
package eda.tpn.pkg5.pkg2;

/**
 * 1- Diseñe la clase árbol binario usando arreglo, agregue el método insertar,
 * uno de los recorridos y una búsqueda
 *
 * 2. Diseñe la clase árbol binario usando una implementación enlazada, agregue
 * el método insertar, uno de los recorridos, una búsqueda.
 *
 *
 */
public class Arbol {
    
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }
    
    public Nodo insertarN(Nodo raiz, int valor) {

        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        
        return null;

    }
    
    
    
}
