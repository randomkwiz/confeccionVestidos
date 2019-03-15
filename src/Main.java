/*Ejercicio 5 Boletin 09
 * Alumna: Angela Vazquez Dominguez
 * Comentario:
 *  Una compañía de confección de vestidos quiere una lista de los diferentes diseños pedidos durante la semana. Para preparar la lista, se dispone de las peticiones de ventas que contiene los siguientes datos: código de diseño (codDiseño) y cantidad pedida (cantidad).
    Tenemos un array (diseños), no ordenado que contiene los códigos de diseños (todos de tres dígitos enteros positivos) y sus precios.
    Realizar un programa para imprimir una lista ordenada por codDiseño con los diferentes diseños pedidos en la semana, junto con la cantidad total pedida de ellos, su correspondiente precio unitario y el coste total de cada uno.
   Precondiciones:
   Entrada: opciones del usuario
   Restricciones: las opciones del usuario deben estar en los rangos validos elegidos por el programador
   Salida: mensajes de ayuda al usuario
   Postcondiciones:

   PSEUDOCODIGO
    inicio
    repetir
        pedirValidarSiQuedanFichas
        si (quedan fichas)
            pedirValidarCodigoVestido
            pedirValidarCantidad
            registrarPeticionVenta
        finSi
    mientras(queden fichas)
    ordenarListaPeticiones
    imprimirDatosPeticiones
    fin
* */
public class Main {
    public static void main(String[] args) {
        String respuesta = " ";
        int codigoVestido, cantidad;
        int contador = 0;
        DisenioImpl vestidoElegido;
        PeticionVentaImpl[] peticiones = new PeticionVentaImpl[100];
        DisenioImpl[] catalogoVestidos = new DisenioImpl[6];
        catalogoVestidos[0] = new DisenioImpl("Casual", 85);
        catalogoVestidos[1] = new DisenioImpl("Moderno", 90.56);
        catalogoVestidos[2]= new DisenioImpl("Extravagante", 190.70);
        catalogoVestidos[3]= new DisenioImpl("Sexy", 1800.69);
        catalogoVestidos[4]= new DisenioImpl("Conservador",350);
        catalogoVestidos[5] = new DisenioImpl("Tecnológico", 1900.65);

        do{
            //       pedirValidarSiQuedanFichas
            respuesta = Validar.respuestaUsuario();
           if(respuesta.equals("SI")) {
               //pedirValidarCodigoVestido
               codigoVestido = Validar.codigoVestido(catalogoVestidos);
               //pedirValidarCantidad
               cantidad = Validar.cantidad();
               //registrarPeticionVenta
               for(int i = 0; i < catalogoVestidos.length; i++){
                   if (catalogoVestidos[i].getCodDisenio() == codigoVestido){
                       peticiones[contador] = new PeticionVentaImpl(catalogoVestidos[i], cantidad);
                   }
               }
               contador++;

           }

        }while(!respuesta.equals("NO"));
        //ordenarListaPeticiones
        UtilidadDisenios.ordenarPeticionesPorCodigoDisenio(peticiones);
        //imprimirDatosPeticiones
        GestionPeticiones.imprimirListaPeticiones(peticiones);
    }

}
