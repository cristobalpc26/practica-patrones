/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_proxy;

import src.users.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import src.patron_factory_method_productos.Producto;
import src.patron_iterator.AgregadoEmpleados;
import src.patron_iterator.IteradorEmpleados;

/**
 *
 * @author cris
 */
public class ServidorBD implements ServicioBD {

    private Connection con;
    private Statement set;
    private ResultSet rs;

    public ServidorBD() {
        this.abrirConexion();
    }

    public void abrirConexion() {
        //String sURL = "jdbc:odbc:mvc";
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/stockManager", "app", "app");
            System.out.println("Se ha conectado a la base de datos");
        } catch (Exception e) {
            System.out.println("No se ha conectado a la base de datos");
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        try {
            con.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void insertarEmpleado(Empleado e) {
        try {
            set = con.createStatement();
            int res = set.executeUpdate("INSERT INTO EMPLEADO VALUES ('" + e.getDni() + "','" + e.getNombre() + "','" + e.getApellidos() + "','"
                    + e.getCorreo() + "','" + e.getPassword() + "','" + e.getHorario() + "','" + e.getTelefono() + "','" + e.getCategoria() + ")");
            if (res == -1) {
                System.out.println("No se ha introducido el nuevo empleado");
            }

            set.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("El método existeUsuario no se ejecuta correctamente");

        }
    }

    @Override
    public void eliminarEmpleado(String dni) {
        try {
            set = con.createStatement();
            int res = set.executeUpdate("DELETE FROM EMPLEADO WHERE DNI = '" + dni + "'");
            if (res == -1) {
                System.out.println("No se ha podido eliminar el empleado");
            }
            set.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("El método eliminarEmpleado no se ejecuta correctamente");

        }
    }

    @Override
    public void modificarEmpleado(Empleado e) {
        try {
            set = con.createStatement();
            int res = set.executeUpdate("UPDATE EMPLEADO SET NOMBRE='" + e.getNombre() + "',APELLIDOS='" + e.getApellidos() + "',CORREO='" + e.getCorreo()
                    + "',PASSWORD='" + e.getPassword() + "',HORARIO='" + e.getHorario() + "',TELEFONO='" + e.getTelefono() + "',CATEGORIA='" + e.getCategoria() + "'where DNI='" + e.getDni() + "'");
            if (res == -1) {
                System.out.println("No se ha podido modificar el empleado");
            }
            set.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("El método existeUsuario no se ejecuta correctamente");

        }
    }

    // SI no se usa, quitar , dejsrlo de moemento
    @Override
    public String getDniEmpleado(String login, String passwd) {
        String dni = "";
        try {
            set = con.createStatement();
            rs = set.executeQuery("SELECT * FROM EMPLEADO WHERE CORREO='" + login + "'AND PASSWORD='" + passwd + "'");
            while (rs.next()) {
                dni = rs.getString("DNI");
                dni = dni.trim();
            }
            rs.close();
            set.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("El método existeUsuario no se ejecuta correctamente");

        }
        return dni;
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado aux;
        try {
            set = con.createStatement();
            rs = set.executeQuery("SELECT * FROM EMPLEADO");
            while (rs.next()) {
                aux = new Empleado(rs.getString("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDOS"), rs.getString("CORREO"),
                        rs.getString("PASSWORD"), rs.getString("HORARIO"), rs.getString("TELEFONO"), rs.getString("CATEGORIA"));
                empleados.add(aux);
            }
            rs.close();
            set.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("El método existeUsuario no se ejecuta correctamente");

        }

        return empleados;
    }

    @Override

    public ArrayList<Empleado> consultagetEmpleadosDNI(String dni) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado aux;
        try {
            set = con.createStatement();
            rs = set.executeQuery("SELECT * FROM EMPLEADO where DNI='" + dni + "'");

            while (rs.next()) {
                aux = new Empleado(rs.getString("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDOS"), rs.getString("CORREO"),
                        rs.getString("PASSWORD"), rs.getString("HORARIO"), rs.getString("TELEFONO"), rs.getString("CATEGORIA"));
                empleados.add(aux);
            }
            rs.close();
            set.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("El método existeUsuario no se ejecuta correctamente");

        }
        return empleados;

    }

    @Override

    public ArrayList<Empleado> consultagetEmpleadosNombre(String nombre) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado aux;
        try {
            set = con.createStatement();
            rs = set.executeQuery("SELECT * FROM EMPLEADO where NOMBRE='" + nombre + "'");

            while (rs.next()) {
                aux = new Empleado(rs.getString("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDOS"), rs.getString("CORREO"),
                        rs.getString("PASSWORD"), rs.getString("HORARIO"), rs.getString("TELEFONO"), rs.getString("CATEGORIA"));
                empleados.add(aux);
            }
            rs.close();
            set.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("El método existeUsuario no se ejecuta correctamente");

        }
        return empleados;

    }

    @Override
    public void insertarProducto(Producto p) {
        try {
            set = con.createStatement();
            int res = set.executeUpdate("INSERT INTO PRODUCTO VALUES ('" + p.getId() + "','" + p.getCategoria() + "','"
                    + p.getNombre() + "','" + p.getMarca() + "','" + p.getPrecio() + "','" + p.getUnidades() + "','" + p.getProcedencia() + "','"
                    + p.getFechaLlegada() + "','" + p.getFechaCaducidad() + "','" + p.getLocalizacion() + ")");
            if (res == -1) {
                System.out.println("No se ha introducido el nuevo producto");
            }

            set.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("El método insertarProducto no se ejecuta correctamente");

        }
    }

    @Override
    public void eliminarProducto(String idProducto) {
        try {
            set = con.createStatement();
            int res = set.executeUpdate("DELETE FROM PRODUCTO WHERE ID_PRODUCTO = '" + idProducto + "'");
            if (res == -1) {
                System.out.println("No se ha podido eliminar el producto");
            }
            set.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("El método eliminarProducto no se ejecuta correctamente");

        }

    }

    @Override
    public void modificarProducto(Producto p) {

        try {
            set = con.createStatement();
            int res = set.executeUpdate("UPDATE EMPLEADO SET CATEGORIA='" + p.getCategoria()
                    + "',NOMBRE='" + p.getNombre() + "',MARCA='" + p.getMarca() + "',PRECIO='" + p.getPrecio() + "',UNIDADES='" + p.getUnidades()
                    + "',PROCEDENCIA='" + p.getProcedencia() + "',FECHA_LLEGADA='" + p.getFechaLlegada() + "',FECHA_CADUCIDAD='" + p.getFechaCaducidad()
                    + "'where ID_PRODUCTO='" + p.getId() + "'");
            if (res == -1) {
                System.out.println("No se ha podido modificar el empleado");
            }
            set.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("El método existeUsuario no se ejecuta correctamente");

        }
    }

    @Override
    public ArrayList<Producto> consultagetProductoNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> consultagetProductosFechaCaducidad(Date Fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> consultagetProductosUnidades(int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> getProductos() {

        ArrayList<Producto> productos = new ArrayList<>();
        /*
        Producto auxP;
        try {
            set = con.createStatement();
            rs = set.executeQuery("SELECT * FROM PRODUCTO");
            while (rs.next()) {
                if(rs.)
                
                auxP = new Producto(rs.getString("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDOS"), rs.getString("CORREO"),
                        rs.getString("PASSWORD"), rs.getString("HORARIO"), rs.getString("TELEFONO"), rs.getString("CATEGORIA"));
                productos.add(auxP);
            }
            rs.close();
            set.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("El método getProductos no se ejecuta correctamente");

        }
         */
        return productos;
    }
}
