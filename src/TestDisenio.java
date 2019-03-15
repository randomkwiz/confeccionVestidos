public class TestDisenio {
    public static void main(String[] args) {
        DisenioImpl d1 = new DisenioImpl("Moderno", 90.56);
        DisenioImpl d2 = new DisenioImpl("Extravagante", 190.70);
        DisenioImpl d3 = new DisenioImpl(d2);
        DisenioImpl d4 = new DisenioImpl();
        DisenioImpl d5 = new DisenioImpl();

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
        System.out.println(d5.toString());
        System.out.println(d2.getCodDisenio());
        System.out.println(d2.getNombre());
        System.out.println(d2.getPrecio());
        
        
        System.out.println(d1.compareTo(d3));
        System.out.println(d3.compareTo(d1));
        System.out.println(d1.compareTo(d1));

        d4.setNombre("Sexy");
        try {
            d4.setPrecio(76.6);
        }catch (ExcepcionDisenio e){
            System.out.println("Error");
        }
        System.out.println(d4.toString());
        d5.setNombre("Dulce");
        try {
            d5.setPrecio(-1);
        }catch (ExcepcionDisenio e){
            System.out.println("Error");
        }

    }
}
