
public class Persona {
    int id;
    String nombre;
    String domicilio;
    String telefono;
    
    public Persona(int id,String nombre,String domicilio,String telefono){
        this.id = id; // 0
        this.nombre = nombre; // 1
        this.domicilio = domicilio; // 2
        this.telefono = telefono; // 3
    }
    
    public String[] toRenglon(){
        String[] vector = new String[4];
        
        vector[0] = ""+id;
        vector[1] = ""+nombre;
        vector[2] = ""+domicilio;
        vector[3] = ""+telefono;
        
        return vector;
    }
    
}
