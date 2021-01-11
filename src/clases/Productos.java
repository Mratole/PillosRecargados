package clases;

/**
 *
 * @author roodi
 */
public class Productos
{

    private int id;
    private String nombre;
    private int cantidad;
    private double precio;
    private double peso;
    private int tipoProducto;

    public Productos(int id, String nombre, int cantidad, double precio, double peso, int tipoProducto)
    {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.peso = peso;
        this.tipoProducto = tipoProducto;
    }

    public int getId()
    {
        return id;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public double getPrecio()
    {
        return precio;
    }

    public double getPeso()
    {
        return peso;
    }

    public int getTipoProducto()
    {
        return tipoProducto;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public void setTipoProducto(int tipoProducto)
    {
        this.tipoProducto = tipoProducto;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

}
