package ejemplo1;

public class Avion implements Runnable{
   String nombre; // Nombre del Avion
   int velocidad; // Velocidad en metros por segundo
   int distancia; // Distancia recorrida
   int tiempovuelo; //Tiempo de vuelo en segundos
   private long initialTime;

    public Avion(String nombre, int velocidad, int tiempovuelo, long initialTime) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.tiempovuelo = tiempovuelo;
        this.initialTime = initialTime;        
    }
    
    @Override
    public void run() {
        int i=0;
        this.distancia = this.velocidad;
        System.out.println("Despega el "+this.nombre);
        while(i<this.tiempovuelo){
            try{
                Thread.sleep(1000);
                System.out.println(this.nombre+" - Distancia recorrida: "+this.distancia+"m, en t = "+
                    (System.currentTimeMillis()-this.initialTime)/1000 + "seg");
            }catch(InterruptedException ex){
            }
        this.distancia += this.velocidad;               
        i++;
        }
        System.out.println("Aterriza el "+this.nombre);
    }
}
    
