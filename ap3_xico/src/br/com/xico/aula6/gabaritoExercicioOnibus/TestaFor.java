import java.util.List;

public class TestaFor {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        
        System.out.println("Usando loop for:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
