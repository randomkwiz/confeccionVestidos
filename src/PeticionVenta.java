/* CLASE BASICA
 * Propiedades:
 *      -Basicas:
 *          DisenioImpl diseño  consultable
 *          int cantidad consultable y modificable
 *      -Derivadas:
 *      -Compartidas:
 *
 * Restricciones: la cantidad debe ser mayor a 0
 * Metodos interface:
    public int getDisenioCodigo() ;
    public String getDisenioNombre();
    public double getDisenioPrecio();
    public int getCantidad();
    public void setCantidad(int cantidad) throws ExcepcionPeticion;
    public double getTotal()

 * Metodos añadidos:
 * Metodos Object:
* */
public interface PeticionVenta {
    public int getDisenioCodigo() ;
    public String getDisenioNombre();
    public double getDisenioPrecio();
    public int getCantidad();
    public void setCantidad(int cantidad) throws ExcepcionPeticion;
    public double getTotal();
}
