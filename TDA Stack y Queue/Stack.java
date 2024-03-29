/******************************************************************************
 *  Un stack generico implementado usando una lista ligada.
 *  Cada elemento del stack es de tipo Item.
 *  
 *  % more tobe.txt 
 *  to be or not to - be - - that - - - is
 ******************************************************************************/

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  La clase Stack representa un stack de items genericos last-in-first-out (LIFO).
 *  Implementa las operaciones usuales push y pop, junto con metodos para
 *  ver el item en el tope, probar si el stack esta vacio, conseguir el numero de
 *  items en el stack, e iterar sobre los items en orden LIFO.
 *  
 *  Esta implementacion usa una lista simplemente ligada con una clase anidada
 *  para crear los nodos de la lista.
 *  Las operaciones push, pop, peek, size, e is-empty tardan un tiempo constante
 *  en el peor caso.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 *
 *  @param <Item> el tipo generico de un item en el stack
 */
public class Stack<Item> implements Iterable<Item> {
    private int n;          // tamaño del stack
    private Node first;     // tope del stack

    /** clase anidada para crear los nodos de la lista ligada */
    private class Node {
        private Item item;
        private Node next;
    }

   /**
     * Inicializa un stack vacio
     */
    public Stack() {
        first = null;
        n = 0;
    }

    /**
     * @return true si el stack esta vacio; false de otra manera
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * @return el numero de items en el stack
     */
    public int size() {
        return n;
    }

    /**
     * @param Agrega el item al stack
     */
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * elimina y retorna el item mas recientemente agregado al stack
     *
     * @return the item mas recientemente agregado
     * @throws NoSuchElementException si el stack esta vacio
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack desbordado.");
        Item item = first.item;        // recupera el item a retornar
        first = first.next;            // elimina el primer nodo
        n--;
        return item;                   // retorna el item recuperado
    }

    /**
     * Retorna (sin eliminar) el item mas recientemente agregado al stack
     *
     * @return el item mas recientemente agregado al stack
     * @throws NoSuchElementException si el stack esta vacio
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack desbordado.");
        return first.item;
    }

    /**
     * Retorna una representacion string del stack
     *
     * @return la secuencia de items en el stack en orden LIFO, separado por espacios
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }
       
    /**
     * @return un iterator para el stack que itera a traves de los items en orden LIFO
     */
    public Iterator<Item> iterator()  { return new ListIterator();  }

    /** un iterator, no se implementa remove() puesto que es opcional */
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

    /**
     * Prueba el tipo de dato Stack
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
       for (String item : args) {
            if (!item.equals("-")) stack.push(item);
            else if (!stack.isEmpty()) System.out.print(stack.pop() + " ");
       }
        System.out.println("(" + stack.size() + " permanece(n) en el stack)");
    }
    
    public Stack clonar(){
        Stack copia = new Stack();
        Stack clon = new Stack();
        while(!isEmpty())
            copia.push(pop());
        while(!copia.isEmpty()){
            Item clonado = (Item) copia.pop();
            clon.push(clonado);
            push(clonado);
        }
        return clon;
    }
    
    public void modificar(Item viejo,Item nuevo){
        Stack copia = new Stack();
        while(!isEmpty()){
            Item dato = pop();
            if(dato.equals(viejo))
                dato = nuevo;
            copia.push(dato);
        }   
        while(!copia.isEmpty())
            push((Item)copia.pop());
    }
}
