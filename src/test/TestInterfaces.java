
package test;

import accesoDatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySQL();
//        datos.insertar();
//        datos.actualizar();
//        datos.eliminar();
//        datos.listar();
//imprimir(datos);
        datos = new ImplemetacionOracle();
//        datos.listar();
imprimir(datos);
        
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
