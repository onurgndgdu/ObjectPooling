public class ObjectPoolingMain {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        DatabaseConnection databaseConnection = new DatabaseConnection();

        if(databaseConnection != null) {
            databaseConnection.connect();
        }
        pool.releaseConnection(databaseConnection);
    }
}
