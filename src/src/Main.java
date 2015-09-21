package src;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        try
        {
            Socket s=new Socket("localhost",666);
        } catch (IOException ex) {System.out.println(ex);}
    }
    
}
