import java.util.Scanner;
public class Validar {
    /* INTERFAZ
        Cabecera: public static String respuestaUsuario()
        Comentario: pide y valida la respuesta del usuario a si quedan fichas
        Precondiciones:
        Datos de entrada:
        Datos de salida: String que es la respuesta validada del usuario
        Datos entrada/salida:
        Postcondiciones: asociado al nombre devuelve un String
    */
    public static String respuestaUsuario () {
        Scanner entrada = new Scanner(System.in);
        String respuesta=" ";
        do{
            System.out.println("¿Quedan más fichas? Responde SI o NO");
            respuesta = entrada.nextLine();
            respuesta = respuesta.toUpperCase();
            System.out.println(respuesta);
        }while(!respuesta.equals("SI") && !respuesta.equals("NO") );

        return respuesta;
    }

    /* INTERFAZ
    Cabecera: public static int codigoVestido(DisenioImpl[] diseniosPosibles)
    Comentario: pide y valida el codigo del diseño del vestido
    Precondiciones:
    Datos de entrada: array de los diseños existentes
    Datos de salida: entero que es el codigo del diseño
    Datos entrada/salida:
    Postcondiciones: asociado al nombre devuelve un entero
*/
    public static int codigoVestido(DisenioImpl[] diseniosPosibles) {
        Scanner entrada = new Scanner(System.in);
        int codigo;
        do{
            System.out.println("Introduce un codigo de diseño existente: ");
            codigo = entrada.nextInt();
        }while( !GestionPeticiones.disenioExistente(diseniosPosibles,codigo));
        return codigo;
    }
    /* INTERFAZ
    Cabecera: public static int cantidad()
    Comentario: pide y valida la cantidad de vestidos que quiere
    Precondiciones:
    Datos de entrada:
    Datos de salida: entero que es la cantidad deseada
    Datos entrada/salida:
    Postcondiciones: asociado al nombre devuelve una cantidad superior a 0
*/
    public static int cantidad(){
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        do{
            System.out.println("Cantidad: ");
            cantidad = entrada.nextInt();
        }while( cantidad < 0);
        return cantidad;
    }
}
