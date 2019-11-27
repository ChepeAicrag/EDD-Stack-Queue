
/**
 * 
 * Estrucutura de Datos
 * Examen  26/11/2019
 * Tercera Unidad
 * 
 * @author Garcia Garcia Jose Angel
 */
public class Examen
{
    public static void main(){
        Queue<Integer> c = new Queue();
        /*
         c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        */
        System.out.println("La cola es " + c.toString());
        Queue<Integer> cinter = inter(c);
        System.out.println("La cola intercalada es " + cinter.toString());
    }
    
    private static Queue<Integer> inter(Queue<Integer> original){
        if(original.size() % 2 != 0 || original.size() == 0){
            System.out.println("No se puede continuar");
            return original;
        }
        Stack<Integer> pila = new Stack<Integer>();
        int tam = original.size()/2;
        for(int i = 0; i < tam; i++){
            pila.push(original.dequeue());
        }
        while(!pila.isEmpty()){
            original.enqueue(pila.pop());
        }
        int actual = original.size()/2;
        for(int j = 0; j < actual; j++){
            original.enqueue(original.dequeue());
        }
        for(int n = 0; n < tam; n++){
            pila.push(original.dequeue());
        }
        while(!pila.isEmpty()){
            original.enqueue(pila.pop());
            original.enqueue(original.dequeue());
        }
        return original;
    }
}
