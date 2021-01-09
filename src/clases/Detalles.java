package clases;

/**
 *
 * @author Kevin
 */
public class Detalles
{

    private int id;
    private int id_Producto;
    private int cantidad;
    private float total;
    private float peso;

    public Detalles()
    {
    }

    public Detalles(int id, int id_Producto, int cantidad, float total, float peso)
    {
        this.id = id;
        this.id_Producto = id_Producto;
        this.cantidad = cantidad;
        this.total = total;
        this.peso = peso;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the id_Producto
     */
    public int getId_Producto()
    {
        return id_Producto;
    }

    /**
     * @param id_Producto the id_Producto to set
     */
    public void setId_Producto(int id_Producto)
    {
        this.id_Producto = id_Producto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad()
    {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    /**
     * @return the total
     */
    public float getTotal()
    {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total)
    {
        this.total = total;
    }

    /**
     * @return the peso
     */
    public float getPeso()
    {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso)
    {
        this.peso = peso;
    }

}
