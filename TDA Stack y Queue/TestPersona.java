
/**
 * Write a description of class TestPersona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPersona
{
    public static void main(){
        Queue <Persona> cola = new Queue();
        cola.enqueue(new Persona("Jose","Garcia","Garcia",18,1));
        cola.enqueue(new Persona("Angel","Garcia","Garcia",18,1));
        cola.enqueue(new Persona("Miguel","Garcia","Garcia",18,1));
        cola.enqueue(new Persona("Antonio","Garcia","Perez",18,1));
        cola.enqueue(new Persona("Melvin","Gonzalez","Pascual",18,1));
        cola.enqueue(new Persona("Sergio","Romero","Cortez",18,1));
        cola.enqueue(new Persona("Daniel","Gonzalez","Sierra",18,1));
        StdOut.println(cola.toString()); // Mostrar la cola
        StdOut.println("El primero es \n "  + cola.dequeue() + "\nLa lista ahora es ");
        StdOut.println(cola.toString()); // Mostrar la cola
        
        
    }
}
