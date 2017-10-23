package ejemplo4;

public class Caballo implements Runnable{
   String nombre; // Nombre del Caballo
   int rt; // Razón de tiempo
   private long initialTime;

    public Caballo(String nombre, int rt, long initialTime) {
        this.nombre = nombre;
        this.rt = rt;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        int i=0;
        int distancia = 5;
        System.out.println("Sale el "+this.nombre);
        while(i<5){
            try{
                Thread.sleep(this.rt);
                System.out.println(this.nombre+" - Distancia recorrida: "+distancia+" m - t = "+
                    (System.currentTimeMillis()-this.initialTime)/1000 + "seg");
            }catch(InterruptedException ex){
            }
        distancia += 5;             
        i++;
        }
        System.out.println("Llegó a la meta el "+this.nombre);
    }
}
    
