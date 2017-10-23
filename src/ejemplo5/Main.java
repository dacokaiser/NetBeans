package ejemplo5;

public class Main {
    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();
        Thread d1 = new Thread(new Descarga("Archivo 1", 4, initialTime));
        Thread d2 = new Thread(new Descarga("Archivo 2", 7, initialTime));  
        Thread d3 = new Thread(new Descarga("Archivo 3", 9, initialTime));
        d1.start();
        d2.start();
        d3.start();
    }            
}
