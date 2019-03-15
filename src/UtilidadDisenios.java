public class UtilidadDisenios {
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
        int minimo=0;
        PeticionVentaImpl aux = null;
        for(int i = 0; i < GestionPeticiones.posicionFinalArray(myArray); i++){
            minimo = i;
            for (int j = i + 1; j < GestionPeticiones.posicionFinalArray(myArray); j++){
                if (myArray[j].getDisenioCodigo() < myArray[minimo].getDisenioCodigo()){
                    minimo = j;
                }
            }
            //se produce el intercambio
            aux = myArray[i];
            myArray[i] = myArray[minimo];
            myArray[minimo] = aux;
        }
    }




}
