import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class GerenciadorAcademico {
 
    public static void main(String[] args) throws IOException {
 Scanner sc = new Scanner(System.in);
double vetorA[];
vetorA = new double [100];

for(int armazenarValores = 0;armazenarValores < 100;armazenarValores++){
vetorA[armazenarValores] = sc.nextDouble();
}

for(int pos = 0;pos < 100;pos++){
    if(vetorA[pos] <= 10){
        System.out.printf("A[%d] = %.2f\n", pos, vetorA[pos]);
    }
}

System.out.println("Impressao com for each");

for(double elemento: vetorA){
    System.out.printf(elemento);
}
 
 sc.close();
    }
 
}