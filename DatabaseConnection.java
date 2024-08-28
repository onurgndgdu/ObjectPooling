public class DatabaseConnection {

    private long creationTime;

    public DatabaseConnection() {
        this.creationTime = System.currentTimeMillis();
    }
    public void connect(){
        System.out.println("Connected to Database");
    }
    public void disconnect(){
        System.out.println("Disconnected from Database");
    }
    public boolean isExpired(long timeOut){
        return (System.currentTimeMillis() - this.creationTime) > timeOut;
    }
}
