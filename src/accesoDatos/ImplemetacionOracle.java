package accesoDatos;

public class ImplemetacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Orcale");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Orcale");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Orcale");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Orcale");
    }

}
