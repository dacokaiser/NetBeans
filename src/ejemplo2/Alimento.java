package ejemplo2;

public class Alimento implements Runnable {
    String nombre; // Nombre del alimento
    float tiempococcion; //Tiempo de coccion en minutos  
    private long initialTime;

    public Alimento(String nombre, int tiempococcion, long initialTime) {
        this.nombre = nombre;
        this.tiempococcion = tiempococcion;
        this.initialTime = initialTime;
    }

  

    @Override
    public void run() {
        float i=1;
        float porcentaje;
        System.out.println("Empieza a cocinarse: "+this.nombre);
        while(i<=this.tiempococcion){
            porcentaje = (i/this.tiempococcion)*100;            
            try{
                Thread.sleep(1000);
                System.out.println(this.nombre+" - Cocinando "+(float)Math.round(porcentaje * 100)/100+"% - t = "+
                    (System.currentTimeMillis()-this.initialTime)/1000 + " min");
            }catch(InterruptedException ex){
            }            
        i++;
        }
        System.out.println("Se ha cocinado: "+this.nombre);
    }
}
