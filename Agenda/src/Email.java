
import java.util.*;

/**
 * 
 */
public class Email {
    /**
     * 
     */
    private String correo;
    private int tipo;

    /**
     * @param correo: correo
     */
    public Email(String correo, int tipo) {
        this.correo = correo;
        
        if(0 <= tipo && tipo <= 3){
            this.tipo = tipo;
        }
        else{
            this.tipo = 0;
        }
    }
    
    public Email(String correo){
        this(correo,0);
    }
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString(){
        switch(tipo){
            case 1:
                return "Correo personal:" + correo;
            case 2:
                return "Correo de trabajo:" + correo;
            case 3:
                return "Correo de escuela:" + correo;
            default:
                return "Otro correo:" + correo;
        }
    }
    
}