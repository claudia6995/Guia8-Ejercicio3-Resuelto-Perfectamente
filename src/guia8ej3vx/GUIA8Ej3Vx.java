
package guia8ej3vx;

import Class.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;


public class GUIA8Ej3Vx {

       public static void main(String[] args) {
     
        Scanner Leer = new Scanner(System.in);

        PersonaServicio pers = new PersonaServicio();// traigo el  objeto en main. 

        //creo las personas: 
        int cantPers = 2;
        // Creado el array con la cantidad de personas. El vector Persona
        Persona[] p = new Persona[cantPers];
        //  CREAR Vector IMC    
        int[] vIMCs = new int[cantPers];
                //   Vector EDAD         
        boolean[] vEdad = new boolean[cantPers];
                  
        for (int i = 0; i < cantPers; i++) {
        System.out.println("\n - Persona Nº" + (i+1) + " complete los siguientes datos:");
            p[i] =pers.crearPersona();
           vEdad[i]= pers.esMayordeEdad(p[i]);
           vIMCs[i]= pers.calcularIMC(p[i]);
                  }
        System.out.println("Persona 1 mayor " +vEdad[0]+" Persona 2 mayor " +vEdad[1]);
        double contBajoPeso = 0;
        double contPesoIdeal = 0;
        double contSobrepeso = 0;
        double mayorEdad = 0;
        double menorEdad = 0;
        
        // int IMCs = 0;
        for (int i = 0; i < cantPers; i++) {
  
           
            switch (vIMCs[i]) {
                case -1:
                    contBajoPeso++;
                    break;
                case 0:
                    contPesoIdeal++;
                    break;
                default:
                    contSobrepeso++;
                    break;
              }
           if (vEdad[i]) {
                mayorEdad++;
                        } else {
               menorEdad++;
         // Break del If corta todo el bucle, independientem ente de donde está.               
                  }
        }
        
        System.out.println("\n Hay " + contBajoPeso * 100 / cantPers + " % de  personas  por debajo del peso ideal");
        System.out.println(" Hay "+contPesoIdeal * 100 / cantPers + " % de personas con peso ideal");
        System.out.println(" Hay "+contSobrepeso * 100 / cantPers + " % de personas con sobrepeso");

        System.out.println("\n Hay " +  mayorEdad * 100 / cantPers + " % mayores de edad" );
        System.out.println(" Hay " + menorEdad*100/cantPers + " % menores de edad");
    
      
    }
}
/**
 * A continuación, en la clase main hacer lo siguiente:
* Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
* deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar 
* para cada objeto si la persona es mayor de edad.
* 
* Por último, guardaremos los resultados de los métodos calcularIMC y
* esMayorDeEdad en distintas variables(arrays), para después calcular
* un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y 
* cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
* Para esto, podemos crear unos métodos adicionales.
*/