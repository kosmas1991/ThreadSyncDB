public class DBThread extends Thread {
    private final String host;
    private final DBhandler dbhandler;

    public DBThread(String host, DBhandler dbhandler) {
        this.host = host;
        this.dbhandler = dbhandler;
    }

    @Override
    public void run() {
        synchronized (dbhandler){
            dbhandler.hand(this.host);
        }
    }
}
