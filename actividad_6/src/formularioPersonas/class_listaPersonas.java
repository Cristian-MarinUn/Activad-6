package formularioPersonas;

import java.util.*;

public class class_listaPersonas {
    
    public static ArrayList<class_persona> personas;

     // Atributo que identifica un vector de personas

    public class_listaPersonas(){
        personas = new ArrayList();
        
    }
    
    public void añadirPersona(class_persona p) {
        personas.add(p);
    }
    
    public void eliminarPersona(int i) {
        personas.remove(i);

    }
    
    public void borrarLista() {
        personas.removeAll(personas);
    }

}
