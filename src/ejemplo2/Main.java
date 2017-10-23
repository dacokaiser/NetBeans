package ejemplo2;

public class Main {
    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();
        Thread a1 = new Thread(new Alimento("Brócoli",7, initialTime));
        Thread a2 = new Thread(new Alimento("Papas", 10, initialTime));
        Thread a3 = new Thread(new Alimento("Pollo", 4, initialTime));
        a1.start();
        a2.start();
        a3.start();
    }            
}
