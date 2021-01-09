package clases;

import java.sql.Connection;
import java.util.ArrayList;
import poo.bd.Conexion;
import poo.bd.Querys;

/**
 *
 * @author Kevin
 */
public class ManipulaBD
{

    private static Conexion con = new Conexion();

    public static Connection conecta()
    {
        try
        {
            return con.Conecta("localhost:3306", "pillos", "root", "", 2);
        } catch (Exception e)
        {
            System.out.println("No se pudo we");
            return null;
        }
    }

    public static void desconecta(Connection conn)
    {
        con.desconectar(conn);
    }

    public static ArrayList<Proveedores> CargarProveedores(ArrayList<Object> reg)
    {
        ArrayList<Proveedores> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 9)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != " " && idS != "")
                {
                    int id = Integer.parseInt(idS);
                    String rfc = ((String) reg.get(i + 1)).trim();
                    String empresa = ((String) reg.get(i + 2)).trim();
                    String direccion = ((String) reg.get(i + 3)).trim();
                    String sector = ((String) reg.get(i + 4)).trim();
                    String telEmpresa = ((String) reg.get(i + 5)).trim();
                    String contacto = ((String) reg.get(i + 6)).trim();
                    String telContacto = ((String) reg.get(i + 7)).trim();
                    String estatusS = ((String) reg.get(i + 8)).trim();
                    boolean estatus = Boolean.parseBoolean(estatusS);
                    Proveedores obj = new Proveedores(id, rfc, empresa, direccion, sector, telEmpresa,
                            contacto, telContacto, estatus);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            if (!lista.isEmpty())
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    /**
     * Método para insertar dato en la base en la tabla proveedores
     *
     * @param id tipo int
     * @param rfc tipo String
     * @param empresa tipo String
     * @param direccion tipo String
     * @param sector tipo String
     * @param telEmpresa tipo String
     * @param contacto tipo String
     * @param telContacto tipo String
     * @param estatus tipo String
     */
    public static void AltasProveedores(int id, String rfc, String empresa, String direccion,
            String sector, String telEmpresa, String contacto, String telContacto, boolean estatus)
    {
        String estatusS = String.valueOf(estatus);
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "proveedores",
                    "" + id + ",'"
                    + rfc + "','"
                    + empresa + "','"
                    + direccion + "','"
                    + sector + "','"
                    + telEmpresa + "','"
                    + contacto + "','"
                    + telContacto + "','"
                    + estatusS + "'"
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }
    }

    /**
     * Método para eliminar de la bd que permite solo id para evitar errores
     *
     * @param id tipo int
     */
    public static void BajasPersonas(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "proveedores", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Método para consultar datos en la base de datos a partir de lo que desee
     * hacer el programador
     *
     * @param variable a travez de la cual se buscara el objeto...ejemplo "id!="
     * @param condicion con la cual se hara la comparacion "-1"
     * @return todos los datos que cumplan la condicion
     */
    public static ArrayList<Proveedores> ConsultaProveedores(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Proveedores> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarProveedores(sql.Seleccion(con, "*", "proveedores", variable + condicion));
            if (ap != null)
            {
                System.out.println("Encontrado(s)");
            } else
            {
                System.out.println("No se encontro ni maiz");
            }
        }
        ManipulaBD.desconecta(con);
        return ap;
    }

    /**
     * 
     * @param id
     * @param campos rfc,id
     * @param datos "'9y4fh48yw',5"
     */
    public static void ModificarProveedores(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Proveedores> ap = ManipulaBD.CargarProveedores(sql.Seleccion(con, "*", "proveedores", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "proveedores", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificado");
            }
        }
    }
}

