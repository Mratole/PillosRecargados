package clases;

/**
 *
 * @author roodi
 */
public class Productos
{

    private int id;
    private int id_Proveedores;
    private String nombre;
    private int cantidad;
    private double precio;
    private double peso;
    private int tipoProducto;
    private boolean estatus;

    public Productos(int id, int id_Proveedores, String nombre, int cantidad, double precio, double peso, int tipoProducto, boolean estatus)
    {
        this.id = id;
        this.id_Proveedores = id_Proveedores;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.peso = peso;
        this.tipoProducto = tipoProducto;
        this.estatus = estatus;
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

    /**
     * @return the id_Proveedores
     */
    public int getId_Proveedores()
    {
        return id_Proveedores;
    }

    /**
     * @param id_Proveedores the id_Proveedores to set
     */
    public void setId_Proveedores(int id_Proveedores)
    {
        this.id_Proveedores = id_Proveedores;
    }

    /**
     * @return the estatus
     */
    public boolean isEstatus()
    {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(boolean estatus)
    {
        this.estatus = estatus;
    }

}
