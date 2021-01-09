package clases;

/**
 *
 * @author juan
 */
public class Compras
{

    private int id;
    private String fecha;
    private String hora;
    private boolean total;

    public Compras()
    {

    }

    /**
     *
     * @param id
     * @param fecha
     * @param hora
     * @param total
     */
    public Compras(int id, String fecha, String hora, boolean total)
    {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
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
     * @return the fecha
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora()
    {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora)
    {
        this.hora = hora;
    }

    /**
     * @return the total
     */
    public boolean isTotal()
    {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(boolean total)
    {
        this.total = total;
    }
}
