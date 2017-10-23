package ejemplo5;


public class Descarga implements Runnable {
    String nombre; // Nombre de la descarga
    float tdescarga; //Tiempo de la descarga 
    private long initialTime;

    public Descarga(String nombre, float tdescarga, long initialTime) {
        this.nombre = nombre;
        this.tdescarga = tdescarga;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        float i=1;
        float porcentaje;
        System.out.println("Empieza a descargarse: "+this.nombre);
        while(i<=this.tdescarga){
            porcentaje = (i/this.tdescarga)*100;            
            try{
                Thread.sleep(1000);
                System.out.println(this.nombre+" - Descargando "+(float)Math.round(porcentaje * 100)/100+"% - t = "+
                    (System.currentTimeMillis()-this.initialTime)/1000 + " min");
            }catch(InterruptedException ex){
            }            
        i++;
        }
        System.out.println("Se ha descargado: "+this.nombre);
    }
}
