package ejerciciosumarnumeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JUAN
 */
public class EjercicioSumarNumeros {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("¿Quieres sumar números? (s|n): ");
        String respuesta = br.readLine();
        
        int total=0;
        
        while(respuesta.equals("s"))
        {
            // Pedir números
            System.out.println("Introduce un número: ");
            int numero = Integer.parseInt(br.readLine());
            total = total + numero;
            System.out.println("Resultado: "+total);
            System.out.print("¿Quieres seguir sumando números? (s|n): ");
            respuesta = br.readLine();
        }
        
        System.out.println("Resultado: "+total);
    }
    
}
