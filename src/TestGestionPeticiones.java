public class TestGestionPeticiones {
	
    public static void main(String[] args) {

		DisenioImpl[] d = new DisenioImpl[5];
         d[0] = new DisenioImpl("Moderno", 90.56);
         d[1] = new DisenioImpl("Extravagante", 190.70);
         d[2] = new DisenioImpl("Casual",100);
         d[3] = new DisenioImpl("Sexy", 75);
         d[4] = new DisenioImpl("Vintage", 500);


        PeticionVentaImpl[] arrayPeticiones = new PeticionVentaImpl[100];
        arrayPeticiones[0] = new PeticionVentaImpl(d[0], 30);
        arrayPeticiones[1] = new PeticionVentaImpl(d[3], 34);
        arrayPeticiones[2] = new PeticionVentaImpl(d[3], 30);
        arrayPeticiones[3] = new PeticionVentaImpl(d[2], 10);
        arrayPeticiones[4] = new PeticionVentaImpl(d[1], 2);
        arrayPeticiones[5] = new PeticionVentaImpl(d[0], 2);

        //System.out.println("SIN ORDENAR");
        //GestionPeticiones.imprimirListaPeticiones(arrayPeticiones);
        GestionPeticiones.imprimirListaPeticiones(arrayPeticiones);

        //UtilidadDisenios.ordenarPeticionesPorCodigoDisenio(arrayPeticiones);
        //System.out.println("ORDENADA");
        //GestionPeticiones.imprimirListaPeticiones(arrayPeticiones);


        System.out.println(GestionPeticiones.sumarCantidadesTotales(arrayPeticiones,100));

        System.out.println(GestionPeticiones.codigoIsRepetido(arrayPeticiones,100,5));
        
        System.out.println(GestionPeticiones.disenioExistente(d, 100));

    }
}
