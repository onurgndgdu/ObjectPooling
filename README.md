## Connection Pooling Java Application
This project demonstrates a simple Connection Pooling mechanism in Java. Connection pooling is a design pattern used to minimize the overhead of repeatedly opening and closing connections to a resource, such as a database, by reusing a set of initialized connections.

Features:

Connection Pool: Maintains a pool of database connections to be reused.
Reusable Connections: Allows connections to be borrowed, used, and returned to the pool.
Synchronized Access: Ensures that multiple threads can safely access and manage the connection pool.
Classes:

ConnectionPool:
Manages a pool of DatabaseConnection objects.
Provides methods to release and reuse connections.
DatabaseConnection:
Simulates a database connection with methods to connect and disconnect.
Tracks the connection's creation time and checks for expiration based on a timeout value.
ObjectPoolingMain:
The main class that demonstrates how the connection pool works by creating a pool and a connection, using the connection, and then returning it to the pool.
Code Explanation:

ConnectionPool Class:
Maintains two lists: availableConnections (connections that are free to use) and usedConnection (connections that are currently in use).
Upon initialization, it creates a predefined number of connections (defined by MAX_POOL_SIZE, set to 5 in this case).
The releaseConnection method returns a connection to the pool and removes it from the usedConnection list. This method is synchronized to ensure thread safety.
DatabaseConnection Class:
Represents a connection to a database with methods to connect() and disconnect().
Stores the creation time of each connection.
Provides an isExpired() method to check if the connection has timed out based on a specified timeout value.
ObjectPoolingMain Class:
Initializes a connection pool and demonstrates borrowing a connection, using it, and then releasing it back to the pool.

### Example Output
Connected to Database
Connection released: DatabaseConnection@15db9742

