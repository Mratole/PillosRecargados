package clases;

/**
 *
 * @author Kevin
 */
public class Reportes
{
    private int id;
    private int id_Productos;
    private int cantidad_Actual;
    private int cantidad_Minima;
    private int cantidad_Maxima;
    private boolean estatus;

    public Reportes()
    {
    }

    public Reportes(int id, int id_Productos, int cantidad_Actual, int cantidad_Minima, int cantidad_Maxima, boolean estatus)
    {
        this.id = id;
        this.id_Productos = id_Productos;
        this.cantidad_Actual = cantidad_Actual;
        this.cantidad_Minima = cantidad_Minima;
        this.cantidad_Maxima = cantidad_Maxima;
        this.estatus = estatus;
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
     * @return the id_Productos
     */
    public int getId_Productos()
    {
        return id_Productos;
    }

    /**
     * @param id_Productos the id_Productos to set
     */
    public void setId_Productos(int id_Productos)
    {
        this.id_Productos = id_Productos;
    }

    /**
     * @return the cantidad_Actual
     */
    public int getCantidad_Actual()
    {
        return cantidad_Actual;
    }

    /**
     * @param cantidad_Actual the cantidad_Actual to set
     */
    public void setCantidad_Actual(int cantidad_Actual)
    {
        this.cantidad_Actual = cantidad_Actual;
    }

    /**
     * @return the cantidad_Minima
     */
    public int getCantidad_Minima()
    {
        return cantidad_Minima;
    }

    /**
     * @param cantidad_Minima the cantidad_Minima to set
     */
    public void setCantidad_Minima(int cantidad_Minima)
    {
        this.cantidad_Minima = cantidad_Minima;
    }

    /**
     * @return the cantidad_Maxima
     */
    public int getCantidad_Maxima()
    {
        return cantidad_Maxima;
    }

    /**
     * @param cantidad_Maxima the cantidad_Maxima to set
     */
    public void setCantidad_Maxima(int cantidad_Maxima)
    {
        this.cantidad_Maxima = cantidad_Maxima;
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
