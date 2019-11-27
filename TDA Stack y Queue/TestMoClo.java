
/**
 * Test de clonar y modificar una pila
 */
public class TestMoClo
{
    public static void main(){
        Stack <String> pila = new Stack();
        pila.push("a");
        pila.push("b");
        pila.push("c");
        pila.push("d");
        pila.push("f");
        StdOut.println("La pila contiene \n" + pila.toString());
        Stack clon = pila.clonar();
        StdOut.println("\nLa pila clonada contiene\n" + clon.toString());
        StdOut.println("\nLa pila original contiene \n" + pila.toString());
        StdOut.println("\n\nCambiando a \"c\" por \"d\"");
        pila.modificar("c","d");
        StdOut.println("\nLa pila modificada contiene \n" + pila.toString());
        StdOut.println("\nLa pila clonada sigue conteniendo\n" + clon.toString());
        
    }
}
