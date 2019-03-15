/*Resguardo de todos los métodos*/
/*No voy a hacer un resguardo de cada clase, sino una sola clase Resguardo donde antes de hacer cada
* método, pensaré su interfaz y la escribiré aquí.*/
public class Resguardo {

    /*Resguardos de los métodos de la clase de Gestion*/
    /*INTERFAZ
     * Signatura: public static void imprimirListaPeticiones (PeticionVentaImpl[] array)
     * Comentario: imprime en pantalla una lista con los diferentes diseños pedidos en la semana,
     *               junto con la cantidad total pedida de ellos, su correspondiente precio unitario
     *               y el coste total de cada uno.
     * Precondiciones: el array no debe estar vacio
     * Entrada: array de objetos de PeticionVentaImpl
     * Salida:
     * E/S:
     * Postcondiciones: imprime en pantalla
     * */
    public static void imprimirListaPeticiones (PeticionVentaImpl[] array){

        System.out.println("En resguardo");
    }

    /*INTERFAZ
     * Signatura: public static int sumarCantidadesTotales (PeticionVentaImpl[] array, int codigo)
     * Comentario: suma las cantidades que se han pedido de un diseño concreto
     * Precondiciones: el array no debe estar vacio, por valor se pasan un codigo
     * Entrada: array de objetos de PeticionVentaImpl, codigo (entero)
     * Salida: entero (total) asociado al nombre
     * E/S:
     * Postcondiciones: asociado al nombre devuelve el total de la cantidad de unidades pedidas de un diseño
     * */
    public static int sumarCantidadesTotales (PeticionVentaImpl[] array, int codigo){
        int cantidad = 0;
        System.out.println("En resguardo");
        return cantidad;
    }




    /*INTERFAZ
     * Signatura: public static boolean codigoIsRepetido (PeticionVentaImpl[] array, int codigo, int posicion)
     * Comentario: comprueba si un diseño ya ha salido en el array, hasta la posicion dada
     * Precondiciones: el array no debe estar vacio, por valor se pasan un codigo y una posicion. La posicion debe ser menor al tamaño del array.
     * Entrada: array de objetos de PeticionVentaImpl, codigo (entero) y posicion (entero)
     * Salida: boolean asociado al nombre
     * E/S:
     * Postcondiciones: asociado al nombre devuelve si un diseño ya ha salido en el array, hasta la posicion dada, true si sí y false si no
     * */
    public static boolean codigoIsRepetido (PeticionVentaImpl[] array, int codigo, int posicion){
        boolean repetido=false;
        System.out.println("En resguardo");
        return repetido;
    }

    /*INTERFAZ
     * Signatura: public static boolean disenioExistente(DisenioImpl[] diseniosExistentes, int codigoAComprobar)
     * Comentario: comprueba si el codigo del diseño introducido se corresponde con uno de los diseños existentes
     * Precondiciones: el array no esta vacio y por valor se pasa un codigo
     * Salida: boolean asociado al nombre
     * E/S:
     * Postcondiciones: asociado al nombre devuelve un boolean que indica si el diseño introducido se corresponde con un diseño existente o no
     * */
    public static boolean disenioExistente(DisenioImpl[] diseniosExistentes, int codigoAComprobar){
        boolean existe = false;
        System.out.println("En resguardo");
        return existe;
    }

    /*INTERFAZ
    Signatura: public static int posicionFinalArray (PeticionVentaImpl[] array)
    Comentario: devuelve la ultima posicion del array
    Precondiciones: se pasa un array
    Entrada: array de peticiones (no se modifica)
    Salida: entero que es la ultima posicion no usada (la siguiente libre)
    Entrada/Salida:
    Postcondiciones: asociado al nombre devuelve un entero
    * */
    public static int posicionFinalArray (PeticionVentaImpl[] array){
        int posicion=0;
        System.out.println("En resguardo");
        return posicion;
    }


    /*Resguardos de los métodos de la clase de utilidad*/

    /*
     * INTERFAZ
     * Signatura: public static void ordenarPeticionesPorCodigoDisenio (PeticionVentaImpl[] myArray)
     * Comentario: dado un array de peticiones de diseños pedidos, ordena estas peticiones en base
     *              al codigo de los diseños, de menor a mayor. Usa el metodo de seleccion directa.
     * Precondiciones: el array no debe estar vacio
     * Entrada:
     * Entrada/Salida: array de objetos del tipo PeticionVentaImpl
     * Salida:
     * Postcondiciones: el array estara ordenado de menor a mayor
     * */
    public static void ordenarPeticionesPorCodigoDisenio (PeticionVentaImpl[] myArray ){
        System.out.println("En resguardo");
    }
}
