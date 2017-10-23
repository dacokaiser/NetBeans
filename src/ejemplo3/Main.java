package ejemplo3;

public class Main {
    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();
        Thread p1 = new Thread(new Programa("NetBeans", 5, initialTime));
        Thread p2 = new Thread(new Programa("Eclipse", 8, initialTime));        
        p1.start();
        p2.start();
    }            
}
