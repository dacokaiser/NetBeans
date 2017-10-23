package ejemplo1;

public class Main {

    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();
        Thread a1 = new Thread(new Avion("Avion 1", 222, 5, initialTime));
        Thread a2 = new Thread(new Avion("Avion 2", 140, 8, initialTime));
        a1.start();
        a2.start();
    }    
}
