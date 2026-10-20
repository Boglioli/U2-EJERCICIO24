public class ConexionMongoDB implements ConexionBD {
    private boolean conectada = false;
    public void conectar() {
        conectada = true;
        System.out.println("mongoDB conectada");
    }
    public void ejecutarConsulta(String sql) {
        if (conectada) {
            System.out.println("mongoDB ejecutando: " + sql);
        } else {
            System.out.println("mongoDB no está conectada");
        }
    }
    public void desconectar() {
        conectada = false;
        System.out.println("mongoDB desconectada");
    }
}
