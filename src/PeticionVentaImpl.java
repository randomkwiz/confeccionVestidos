/* CLASE BASICA
 * Propiedades:
 *      -Basicas:
 *          DisenioImpl diseño  consultable
 *          int cantidad consultable y modificable
 *      -Derivadas:
 *          double precioTotal
 *      -Compartidas:
 *
 * Restricciones: la cantidad debe ser mayor a 0
 * Metodos interface:
    public int getDisenioCodigo() ;
    public String getDisenioNombre();
    public double getDisenioPrecio();
    public int getCantidad();
    public void setCantidad(int cantidad) throws ExcepcionPeticion
    public double getTotal();
 * Metodos añadidos:
 * Metodos Object:
 * toString
* */
public class PeticionVentaImpl implements  PeticionVenta{
    /*Atributos*/
    private DisenioImpl disenio;
    private int cantidad;

    /*Constructor*/
        //no hago el constructor por defecto porque no tendria sentido hacer una peticion sin indicar el diseño que quieres pedir
    public PeticionVentaImpl(DisenioImpl disenio, int cantidad) {
        this.disenio = disenio;
        this.cantidad = cantidad;
    }
    public PeticionVentaImpl(DisenioImpl disenio) {
        this.disenio = disenio;
        this.cantidad = 1;
    }
    public PeticionVentaImpl(PeticionVentaImpl otro) {
        this.disenio = otro.disenio;
        this.cantidad = otro.cantidad;
    }

    /*Metodos interface*/


    public int getDisenioCodigo() {
        return disenio.getCodDisenio();
    }
    public String getDisenioNombre() {
        return disenio.getNombre();
    }
    public double getDisenioPrecio() {
        return disenio.getPrecio();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) throws ExcepcionPeticion {
        if (cantidad < 1){
         throw new ExcepcionPeticion("La cantidad debe ser superior a 0")   ;
        }else {
            this.cantidad = cantidad;
        }
    }

    public double getTotal(){
        return this.getDisenioPrecio() * this.getCantidad();
    }

    /*Metodos Object*/

    @Override
    public String toString() {
        return "PeticionVentaImpl{" +
                "disenio=" + this.disenio.toString() +
                ", cantidad=" + cantidad +
                '}';
    }
}
