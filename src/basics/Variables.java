package basics;

public class Variables {
    public static void main(String[] args) {

        int numEntero = 15;

        /* Se usa el sufijo de f para que tome validez,
         sino lo toma asume un double.*/

        //Precision simple
        float numFlotante = 1.5f;

        //Precision doble
        double numDoble = 4.4d;

        short numShort = Short.MAX_VALUE;

        byte numByte = Byte.MAX_VALUE;
        
        String cadenaDeTexto = "Hola buenos dias hoy es %d de Julio".formatted(numEntero);
        System.out.println("cadenaDeTexto = " + cadenaDeTexto);


    }
}
