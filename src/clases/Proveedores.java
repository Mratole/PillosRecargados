package clases;

/**
 *
 * @author Kevin
 */
public class Proveedores
{
    private int id;
    private String rfc;
    private String empresa;
    private String direccion;
    private String sector;
    private String telEmpresa;
    private String contacto;
    private String telContacto;
    private boolean estatus;

    public Proveedores()
    {
    }

    public Proveedores(int id, String rfc, String empresa, String direccion, String sector, String telEmpresa, String contacto, String telContacto, boolean estatus)
    {
        this.id = id;
        this.rfc = rfc;
        this.empresa = empresa;
        this.direccion = direccion;
        this.sector = sector;
        this.telEmpresa = telEmpresa;
        this.contacto = contacto;
        this.telContacto = telContacto;
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
     * @return the rfc
     */
    public String getRfc()
    {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc)
    {
        this.rfc = rfc;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa()
    {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa)
    {
        this.empresa = empresa;
    }

    /**
     * @return the direccion
     */
    public String getDireccion()
    {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    /**
     * @return the sector
     */
    public String getSector()
    {
        return sector;
    }

    /**
     * @param sector the sector to set
     */
    public void setSector(String sector)
    {
        this.sector = sector;
    }

    /**
     * @return the telEmpresa
     */
    public String getTelEmpresa()
    {
        return telEmpresa;
    }

    /**
     * @param telEmpresa the telEmpresa to set
     */
    public void setTelEmpresa(String telEmpresa)
    {
        this.telEmpresa = telEmpresa;
    }

    /**
     * @return the contacto
     */
    public String getContacto()
    {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto)
    {
        this.contacto = contacto;
    }

    /**
     * @return the telContacto
     */
    public String getTelContacto()
    {
        return telContacto;
    }

    /**
     * @param telContacto the telContacto to set
     */
    public void setTelContacto(String telContacto)
    {
        this.telContacto = telContacto;
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
