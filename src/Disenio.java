/* CLASE BASICA
 * Propiedades:
 *      -Basicas:
 *          int codDisenio consultable no modificable
 *          String nombre consultable y modificable
 *          double precio     consultable y modificable
 *      -Derivadas:
 *      -Compartidas:
 *          -contadorDisenios
 * Restricciones: el codDisenio debe estar comprendido entre 100 y 900
 * Metodos interface:
 *  public int getCodDisenio()
    public String getNombre()
    public void setNombre(String nombre)
    public double getPrecio()
    public void setPrecio(double precio) throws ExcepcionDisenio;

 * Metodos añadidos:
 * Metodos Object:
 * CompareTo
* */
public interface Disenio {
    public int getCodDisenio();
    public String getNombre();
    public void setNombre(String nombre);
    public double getPrecio();
    public void setPrecio(double precio) throws ExcepcionDisenio;
}
