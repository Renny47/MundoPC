package MundoPc;

import com.gm.MundoPc.*;

public class  MundoPc {
    public static void main(String[] args) {
        
          
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado TecladoHP = new Teclado("bluetooh", "HP");
        Raton ratonHP = new Raton("bluetooh", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, TecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("GAMER", 13);
        Teclado TecladoGamer = new Teclado("bluetooh", "GAMER");
        Raton ratonGamer = new Raton("bluetooh", "GAMER");
        Computadora computadoraGamer = new Computadora("Computadora GAMER", monitorGamer, TecladoGamer, ratonGamer);

   
         Orden orden1 = new Orden();
      orden1.agregarComputadora(computadoraHP);
      orden1.agregarComputadora(computadoraGamer);
      
      
      orden1.mostrarOrden();
   
 
    
    }
    
    
}
    


