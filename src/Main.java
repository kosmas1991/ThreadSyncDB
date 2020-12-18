public class Main {
    public static void main(String[] args) {
        DBhandler hand1 = new DBhandler();
        DBThread T1 = new DBThread("localhost",hand1);
        DBThread T2 = new DBThread("127.0.0.1",hand1);

        T1.start();
        T2.start();
    }
}
