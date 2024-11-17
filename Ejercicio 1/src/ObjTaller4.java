public class ObjTaller4 {
    
    public static void main(String[] args) {
        String[] nombres = {"Alejandro", "Jaime", "Daniel", "Santiago", "Alexander"};
        Persona[] personas = new Persona[5];
        
        for (int i = 0; i < nombres.length; i++) {
            personas[i] = new Persona(nombres[i]);
        }
        
        Vehiculo auto = new Vehiculo("ABC-306", Motor.ELECTRICO, personas[4]);
        
        Vehiculo auto2 = new Vehiculo("TXT-452", Motor.GASOLINA);
        
        personas[0] = null;
        personas[1] = personas[2];
        personas[4] = null;
        personas[3].finalize();
        System.out.println(personas[3]);
    }
}