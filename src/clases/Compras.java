
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
        this. fecha = fecha;
        this. hora = hora;
        this.total = total;
}

    /**
  * 
     * @param id
  */
 public void setid(int id)
 {
     this.id = id;
 }
 /**
  * @return the id
  */
 public String getfecha()
 {
     return fecha;
 }
 /**
     * @param fecha
  * 
  */
 public void setfecha(String fecha)
 {
     this.fecha = fecha;
 }
 /**
  * @return the hohra 
  */
 public String gethora()
 {
     return hora;
 }
 /**
  * @param hora  the id hora  set
  */
 public void sethora(String hora)
 {
     this.hora = hora ;
 }
 /**
  * @return the total
  */
 public boolean istotal()
 {
     return total;
 }

 /**
     * @param total
  */
 public void settotal(boolean total)
 {
     this.total = total;
 }
 
}