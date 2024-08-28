import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private List<DatabaseConnection> availableConnections = new ArrayList<DatabaseConnection>();
    private List<DatabaseConnection> usedConnection = new ArrayList<>();
    private static final int MAX_POOL_SIZE = 5;

    public ConnectionPool() {
        for (int i = 0; i < MAX_POOL_SIZE; i++) {
            availableConnections.add(new DatabaseConnection());
        }
    }
}
