package poop02;
/**
 * Clase de ejemplo que contiene ejemplos de estructuras de control
 * y métodos en Java.
 * @author lilian
 */
public class POOP02 {
    /**
     * Método principal que demuestra varios ejemplos de estructuras de control y métodos.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     *
     */
    public static void main(String[] args) {
        /**
         * Imprime mensajes en la consola
         */
        System.out.println("Hola mundo");
        System.err.println("Hola mundo");
        
        System.out.println("############## if ##############");
        /**
         * Imprime mensajes en la consola
         */
        int a;
        a = 15;
        int b = 10;
        if (a<b) {
            System.out.println("a es menor que b");
        } else if (a==b){
            System.out.println("a es igual a b");
        }else{
            System.out.println("a es mayor que b");
        }
        System.out.println("############## if ##############");
        /**
         * Llamada a un método
         */
        if(menor(a,b)){
            System.out.println("metodo menor retorna true");
        }else{
            System.out.println("metodo menor retorna false");
        }
        /**
         *  Estructura de control switch
         */
        System.out.println("############## Switch ##############");
        
        int dia = 1;
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Lunes");
            case 3 -> System.out.println("Martes");
            case 4 -> System.out.println("Miercoles");
            case 5 -> System.out.println("Jueves");
            case 6 -> System.out.println("Viernes");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Día incorrecto");
        }
        System.out.println("############## Switch ##############");
        /**
         * Estructura de control switch con tipo char
         */
        char vocal = '9';
        switch (vocal) {
            case 'a': System.out.println("Seleccionó vocal a"); break;
            case 'e': System.out.println("Seleccionó vocal e"); break;
            case 'i': System.out.println("Seleccionó vocal i"); break;
            case 'o': System.out.println("Seleccionó vocal o"); break;
            case 'u': System.out.println("Seleccionó vocal u"); break;
            default:
                System.out.println("No se seleccionó una vocal");
        }
        /**
         *  Bucle while
         */
        System.out.println("############## While ##############");
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba n="+n);
            n++;
        }
        while (n>0) {
            System.out.println("Contando hacia abajo n="+n);
            n--;
        }
        System.out.println("n="+n);
        
        /**
         * Bucle do-while
         */
        System.out.println("############## Do-While ##############");
        do {            
            System.out.println("Contando hacia abajo");
            n--;
        } while (n>0);
        System.out.println("n="+n);
        
        /**
         * Bucle for
         */
        System.out.println("############## For ##############");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);  
        }
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }
        System.out.println("############## For ##############");
        /**
         * Arrays
         */
        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        /**
         * Inicialización y acceso a elementos de un array
         */
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10;
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        }
        
        /**
         * Bucle for-each
         */
        System.out.println("############## For-each ##############");
        for (int i : miArreglo2) {
            System.out.println("Hackeando la nasa "+i+"%");
        }
    }
    /**
     * Método privado que compara dos números y devuelve true si el primero es menor que el segundo.
     * @param x El primer número a comparar.
     * @param y El segundo número a comparar.
     * @return true si x es menor que y, de lo contrario, false.
     *
     */

    private static boolean menor(int x, int y) {
        return x<y;
    }
    
}