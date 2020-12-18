public class DBhandler {
    public void hand(String host){
        System.out.println("Handling db at " + host);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
