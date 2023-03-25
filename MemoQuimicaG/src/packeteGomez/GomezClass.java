package packeteGomez;

import java.util.Random;

public class GomezClass {
    
    public static int[] Varianza() {
        int[] almacen = new int[8];//con String fallan las operaciones
        int contador = 0;

        while (contador < 8) {//las variables aleatorias se ligan al contador, por lo que se tiene registro de ellas gracias al numero del contador, osea lo que paso cuando se ejecuto el while

            Random elRandom = new Random();
            int variableAleatoria = elRandom.nextInt(4) + 1;//se generan los 5 pares, en ordenes aleatorios
             int cantidadVariables = 0;

            for (int i = 0; i < 8; i++) {

                 if (almacen[i] == variableAleatoria) {//actua ya que se halla existencia de un nuemro y el random coincida con el nuemro ya existente
                    cantidadVariables++;//si coincide la cantidad de esa variable aumentara
                }
            }
            if (cantidadVariables < 2) {//si la cantidad de variables de un numero (estos nuemros se tiene registro de ellos gracias al contador del while), es menor a 2
                almacen[contador] = variableAleatoria;//almacen en contador alamacena la variable aleatoria generada por random, por lo que en la priemra contador = 0, 
                //asiganando que el primer valor aleatoro sera asignado a la posicion 0 del arreglo
                contador++;//contador aumenta, cambiando de registro por asi decirlo
            }//fin

        }
        
        return almacen;
    }
    public static void main(String[] args) {
        Varianza();
        }
    }
    
            

