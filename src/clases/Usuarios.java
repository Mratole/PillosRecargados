package clases;

/**
 *
 * @author Kevin
 */
public class Usuarios
{

    private int id;
    private String nomUsuario;
    private String contrasenia;
    private String puesto;

    public Usuarios()
    {
    }

    public Usuarios(int id, String nomUsuario, String contrasenia, String puesto)
    {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.contrasenia = contrasenia;
        this.puesto = puesto;
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
     * @return the nomUsuario
     */
    public String getNomUsuario()
    {
        return nomUsuario;
    }

    /**
     * @param nomUsuario the nomUsuario to set
     */
    public void setNomUsuario(String nomUsuario)
    {
        this.nomUsuario = nomUsuario;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia()
    {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia)
    {
        this.contrasenia = contrasenia;
    }

    /**
     * @return the puesto
     */
    public String getPuesto()
    {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }

}
