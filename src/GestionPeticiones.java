

public class GestionPeticiones {

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

        for(int i = 0; i < posicionFinalArray(array) ;i++){

            if (!codigoIsRepetido(array, array[i].getDisenioCodigo(),i)){   /*Si el codigo no es uno que ya haya salido*/
                System.out.println("Codigo diseño: " + array[i].getDisenioCodigo());
                System.out.println("Nombre diseño: " + array[i].getDisenioNombre());
                System.out.println("Precio unitario: " + array[i].getDisenioPrecio());
                System.out.println("Cantidad de unidades pedidas en total de este diseño: " + sumarCantidadesTotales(array, array[i].getDisenioCodigo()));
                System.out.println("Total: "+  sumarCantidadesTotales(array, array[i].getDisenioCodigo()) * array[i].getDisenioPrecio() + " €"   );
            }


        }
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
        for(int i = 0; i < posicionFinalArray(array); i++){
           if (array[i].getDisenioCodigo() == codigo){
               cantidad += array[i].getCantidad();
           }
        }
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
        for(int i = 0; i < posicion; i ++){
            if (array[i].getDisenioCodigo() == codigo ){
                repetido = true;
            }
        }
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
        for (int i =0; i < diseniosExistentes.length; i++){
            if (diseniosExistentes[i].getCodDisenio() == codigoAComprobar){
                existe = true;
            }
        }
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
        for(int i = array.length-1; i >= 0 && array[i] == null ; i --){
            posicion = i;
        }
        return posicion;
    }

}
