package ejemplo4;

public class Main {

    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();
        Thread c1 = new Thread(new Caballo("Caballo 1", 1000, initialTime));
        Thread c2 = new Thread(new Caballo("Caballo 2", 2000, initialTime));
        Thread c3 = new Thread(new Caballo("Caballo 3", 1500, initialTime));
        Thread c4 = new Thread(new Caballo("Caballo 4", 500, initialTime));
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }    
}
