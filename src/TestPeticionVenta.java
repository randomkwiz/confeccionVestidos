public class TestPeticionVenta {
    public static void main(String[] args) {
        DisenioImpl d1 = new DisenioImpl("Moderno", 90.56);
        DisenioImpl d2 = new DisenioImpl("Extravagante", 190.70);
        DisenioImpl d3 = new DisenioImpl(d2);
        DisenioImpl d4 = new DisenioImpl("Sexy", 75);
        DisenioImpl d5 = new DisenioImpl("Vintage", 500);

        PeticionVentaImpl p1 = new PeticionVentaImpl(d1, 3);
        PeticionVentaImpl p2 = new PeticionVentaImpl(d2, 1);
        PeticionVentaImpl p3 = new PeticionVentaImpl(d3, 30);
        PeticionVentaImpl p4 = new PeticionVentaImpl(d4, 8);
        PeticionVentaImpl p5 = new PeticionVentaImpl(d5, 9);
        PeticionVentaImpl p6 = new PeticionVentaImpl(d2);

        System.out.println(p1.getCantidad());
        System.out.println(p1.getDisenioCodigo());
        System.out.println(p1.getDisenioNombre());
        System.out.println(p1.getDisenioPrecio());

        System.out.println(p2.toString());
        System.out.println(p4.toString());
        
        System.out.println(p4.getTotal());
        
        try {
            p2.setCantidad(50);
        }catch (ExcepcionPeticion e){
            System.out.println("Error");
        }
        System.out.println(p2.toString());
        try {
            p6.setCantidad(0);
        }catch (ExcepcionPeticion e){
            System.out.println("Error");
        }

    }
}
