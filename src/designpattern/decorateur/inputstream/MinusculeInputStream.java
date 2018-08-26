package designpattern.decorateur.inputstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


public class MinusculeInputStream extends FilterInputStream {
    
    public MinusculeInputStream(InputStream input){
        super(input);
    }
     public int read() throws IOException{
         int c = super.read();
         return (c == -1 ? c : Character.toLowerCase((char)c));        
     }
     
    public int read(byte[] b, int decal, int lg) throws IOException {
        int resultat = super.read(b, decal, lg);
        for (int i = decal; i< decal+resultat; i++){
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return resultat;
    }
}
