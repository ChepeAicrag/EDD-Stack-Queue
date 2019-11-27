
/**
 * Write a description of class TesQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesQueue
{
    public static void main(){
        Queue <String> a = new Queue();
        a.enqueue("a");
        a.enqueue("b");
        a.enqueue("c");
        a.enqueue("d");
        a.enqueue("f");
        StdOut.println("Cola A : " + a.toString());
        
        StdOut.println("Clonando la cola \n\n");
        
        Queue<String> clon = a.clonar();
        StdOut.println("Cola clon : " + clon.toString());
        
    }
}
