/* CLASE BASICA
 * Propiedades:
 *      -Basicas:
 *          int codDisenio consultable no modificable
 *          String nombre consultable y modificable
 *          double precio     consultable y modificable
 *      -Derivadas:
 *      -Compartidas:
 *          -contadorDisenios
 * Restricciones: el codDisenio debe estar comprendido entre 100 y 999 y el precio debe ser positivo
 * Metodos interface:
 *  public int getCodDisenio()
    public String getNombre()
    public void setNombre(String nombre)
    public double getPrecio()
    public void setPrecio(double precio) throws ExcepcionDisenio

 * Metodos añadidos:
 * Metodos Object:
 * CompareTo
* */
public class DisenioImpl implements Comparable<DisenioImpl>, Disenio {
    /*Atributos*/
    private int codDisenio;
    private String nombre;
    private double precio;

    private static int contadorDisenios = 100;

    /*Constructor*/
    public DisenioImpl( ){
        codDisenio = contadorDisenios++;
        nombre = "Diseño"+codDisenio;
        precio = 0.0;

    }
    public DisenioImpl(String nombre, double precio){
        this.codDisenio = contadorDisenios++;
        this.nombre = nombre;
        this.precio = precio;
    }
    public DisenioImpl(DisenioImpl otro){
        this.codDisenio = otro.codDisenio;
        this.nombre = otro.nombre;
        this.precio = otro.precio;
    }

    /*Metodos interface*/
//necesito un getDisenio que me devuelva el objeto como tal para luego poder crear peticiones en el Main
    public DisenioImpl getDisenio() {
        return this;
    }

    public int getCodDisenio() {
        return codDisenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws ExcepcionDisenio {
        if (precio < 1) {
        throw new ExcepcionDisenio("El precio debe ser positivo");
        }else {
            this.precio = precio;
        }
    }

    /*Metodos Object*/

    /*Criterio de comparacion
    * Se devolvera -1 si el codigo de diseño propio es menor al del objeto de entrada
    * Se devolvera 0 si el codigo de diseño propio es igual al del objeto de entrada
    * Se devolvera 1 si el codigo de diseño propio es mayor al del objeto de entrada
    * */
    @Override
    public int compareTo(DisenioImpl otro){
        int comparacion = 0;
        if (this.getCodDisenio() < otro.getCodDisenio()){
            comparacion = -1;
        } else if (this.getCodDisenio() > otro.getCodDisenio()){
            comparacion = 1;
        }

        return comparacion;
    }

    @Override
    public String toString() {
        return "DisenioImpl{" +
                "codDisenio=" + codDisenio +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
