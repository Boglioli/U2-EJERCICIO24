public class ConexionPostgreSQL implements ConexionBD {
    private boolean conectada = false;
    public void conectar() {
        conectada = true;
        System.out.println("postgreSQL conectada");
    }
    public void ejecutarConsulta(String sql) {
        if (conectada) {
            System.out.println("postgreSQL ejecutando: " + sql);
        } else {
            System.out.println("postgreSQL no está conectada");
        }
    }
    public void desconectar() {
        conectada = false;
        System.out.println("postgreSQL desconectada");
    }
}
