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
                if (idS != "" && idS != " " && idS != null)
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

    public static ArrayList<Productos> CargarProductos(ArrayList<Object> reg)
    {
        ArrayList<Productos> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 6)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " " && idS != null)
                {
                    int id = Integer.parseInt(idS);
                    String id_proveedorS = ((String) reg.get(i + 1)).trim();
                    int id_Proveedor = Integer.parseInt(id_proveedorS);
                    String nombre = ((String) reg.get(i + 1)).trim();
                    String cantidadS = ((String) reg.get(i + 2)).trim();
                    int cantidad = Integer.parseInt(cantidadS);
                    String precioS = ((String) reg.get(i + 3)).trim();
                    double precio = Double.parseDouble(precioS);
                    String pesoS = ((String) reg.get(i + 4)).trim();
                    double peso = Double.parseDouble(pesoS);
                    String tipoProductoS = ((String) reg.get(i + 5)).trim();
                    int tipoProducto = Integer.parseInt(tipoProductoS);
                    Productos obj = new Productos(id, id_Proveedor, nombre, cantidad, precio, peso, tipoProducto);
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

    public static ArrayList<Compras> CargarCompras(ArrayList<Object> reg)
    {
        ArrayList<Compras> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " " && idS != null)
                {
                    int id = Integer.parseInt(idS);
                    String fecha = ((String) reg.get(i + 1)).trim();
                    String hora = ((String) reg.get(i + 2)).trim();
                    String totalS = ((String) reg.get(i + 3)).trim();
                    float total = Float.parseFloat(totalS);
                    Compras obj = new Compras(id, fecha, hora, total);
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

    public static ArrayList<Detalles> CargarDetalles(ArrayList<Object> reg)
    {
        ArrayList<Detalles> lista = new ArrayList<>();
        try
        {

            for (int i = 0; i < reg.size(); i += 5)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " " && idS != null)
                {
                    int id = Integer.parseInt(idS);
                    String id_ProductosS = ((String) reg.get(i + 1)).trim();
                    int id_Productos = Integer.parseInt(id_ProductosS);
                    String cantidadS = ((String) reg.get(i + 2)).trim();
                    int cantidad = Integer.parseInt(cantidadS);
                    String totalS = ((String) reg.get(i + 3)).trim();
                    float total = Float.parseFloat(totalS);
                    String pesoS = ((String) reg.get(i + 4)).trim();
                    float peso = Float.parseFloat(pesoS);
                    Detalles obj = new Detalles(id, id_Productos, cantidad, total, peso);
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

    public static ArrayList<Usuarios> CargarUsuarios(ArrayList<Object> reg)
    {
        ArrayList<Usuarios> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " " && idS != null)
                {
                    int id = Integer.parseInt(idS);
                    String nomUsuario = ((String) reg.get(i + 1)).trim();
                    String contrasenia = ((String) reg.get(i + 2)).trim();
                    String puesto = ((String) reg.get(i + 3)).trim();
                    Usuarios obj = new Usuarios(id, nomUsuario, contrasenia, puesto);
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

    public static ArrayList<Reportes> CargarReportes(ArrayList<Object> reg)
    {
        ArrayList<Reportes> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 6)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " " && idS != null)
                {
                    int id = Integer.parseInt(idS);
                    String id_ProS = ((String) reg.get(i + 1)).trim();
                    int id_Productos = Integer.parseInt(id_ProS);
                    String cantidad_ActualS = ((String) reg.get(i + 2)).trim();
                    int cantidad_Actual = Integer.parseInt(cantidad_ActualS);
                    String cantidad_MinimaS = ((String) reg.get(i + 3)).trim();
                    int cantidad_Minima = Integer.parseInt(cantidad_MinimaS);
                    String cantidad_MaximaS = ((String) reg.get(i + 4)).trim();
                    int cantidad_Maxima = Integer.parseInt(cantidad_MaximaS);
                    String es = ((String) reg.get(i + 5)).trim();
                    boolean estatus = Boolean.parseBoolean(es);
                    Reportes obj = new Reportes(id, id_Productos, cantidad_Actual, cantidad_Minima, cantidad_Maxima, estatus);
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

    public static void AltasProductos(int id, int id_Proveedores, String nombre,
            int cantidad, double precio, double peso, int tipoProducto)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "productos",
                    "" + id + ","
                    + id_Proveedores + ",'"
                    + nombre + "',"
                    + cantidad + ","
                    + precio + ","
                    + peso + ","
                    + tipoProducto + ""
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }

    }

    public static void AltasCompras(int id, String fecha, String hora, float total)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "compras",
                    "" + id + ","
                    + fecha + "','"
                    + hora + "',"
                    + total + ""
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }
    }

    public static void AltasDetalles(int id, int id_Productos, int cantidad, float total, float peso)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "detalles",
                    "" + id + ","
                    + id_Productos + ","
                    + cantidad + ","
                    + total + ","
                    + peso + ""
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }
    }

    public static void AltasUsuarios(int id, String nomUsuario, String contrasenia, String puesto)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "usuarios",
                    "" + id + ",'"
                    + nomUsuario + "','"
                    + contrasenia + "','"
                    + puesto + "'"
            );
            ManipulaBD.desconecta(con);
            System.out.println("Dato insertado");
        }
    }

    public static void AltasReportes(int id, int id_Productos, int cantidad_Actual, int cantidad_Minima, int cantidad_Maxima, boolean estatus)
    {
        String estatusS = String.valueOf(estatus);
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "reportes",
                    "" + id + ","
                    + id_Productos + ","
                    + cantidad_Actual + ","
                    + cantidad_Minima + ","
                    + cantidad_Maxima + ",'"
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
    public static void BajasProveedores(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "proveedores", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    public static void BajasProductos(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "productos", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    public static void BajasCompras(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "compras", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    public static void BajasDetalles(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "detalles", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    public static void BajasUsuarios(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "usuarios", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    public static void BajasReportes(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "usuarios", "id", "" + id + "");
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

    public static ArrayList<Productos> ConsultaProductos(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Productos> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarProductos(sql.Seleccion(con, "*", "productos", variable + condicion));
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

    public static ArrayList<Compras> ConsultaCompras(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Compras> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarCompras(sql.Seleccion(con, "*", "compras", variable + condicion));
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

    public static ArrayList<Detalles> ConsultaDetalles(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Detalles> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarDetalles(sql.Seleccion(con, "*", "detalles", variable + condicion));
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

    public static ArrayList<Usuarios> ConsultaUsuarios(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Usuarios> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarUsuarios(sql.Seleccion(con, "*", "usuarios", variable + condicion));
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

    public static ArrayList<Reportes> ConsultaReportes(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Reportes> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarReportes(sql.Seleccion(con, "*", "reportes", variable + condicion));
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

    public static void ModificarProductos(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Productos> ap = ManipulaBD.CargarProductos(sql.Seleccion(con, "*", "productos", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "productos", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificado");
            }
        }
    }

    public static void ModificarCompras(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Compras> ap = ManipulaBD.CargarCompras(sql.Seleccion(con, "*", "compras", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "compras", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificado");
            }
        }
    }

    public static void ModificarDetalles(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Detalles> ap = ManipulaBD.CargarDetalles(sql.Seleccion(con, "*", "detalles", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "detalles", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificado");
            }
        }
    }

    public static void ModificarUsuarios(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Usuarios> ap = ManipulaBD.CargarUsuarios(sql.Seleccion(con, "*", "usuarios", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "usuarios", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificado");
            }
        }
    }

    public static void ModificarReportes(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Reportes> ap = ManipulaBD.CargarReportes(sql.Seleccion(con, "*", "reportes", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "reportes", campos, datos, "id=" + id + "");
                ManipulaBD.desconecta(con);
                System.out.println("Modificado");
            }
        }
    }

}
