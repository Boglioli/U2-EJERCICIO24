public class ConexionMySQL implements ConexionBD {
    private boolean conectada = false;
    public void conectar() {
        conectada = true;
        System.out.println("MySQL conectada");
    }
    public void ejecutarConsulta(String sql) {
        if (conectada) {
            System.out.println("MySQL ejecutando: " + sql);
        } else {
            System.out.println("MySQL no está conectada");
        }
    }
    public void desconectar() {
        conectada = false;
        System.out.println("MySQL desconectada");
    }
}
