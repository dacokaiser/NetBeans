package ejemplo3;


public class Programa implements Runnable {
    String nombre; // Nombre del programa
    float tinstalacion; //Tiempo de instalacion
    private long initialTime;

    public Programa(String nombre, float tinstalacion, long initialTime) {
        this.nombre = nombre;
        this.tinstalacion = tinstalacion;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        float i=1;
        float porcentaje;
        System.out.println("Empieza a instalarse: "+this.nombre);
        while(i<=this.tinstalacion){
            porcentaje = (i/this.tinstalacion)*100;            
            try{
                Thread.sleep(1000);
                System.out.println(this.nombre+" - Instalando "+(float)Math.round(porcentaje * 100)/100+"% - t = "+
                    (System.currentTimeMillis()-this.initialTime)/1000 + " min");
            }catch(InterruptedException ex){
            }            
        i++;
        }
        System.out.println("Se ha instalado: "+this.nombre);
    }
}
