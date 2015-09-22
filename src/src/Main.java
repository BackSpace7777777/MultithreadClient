package src;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        try
        {
            Socket s=new Socket("localhost",25565);
            DataOutputStream outToServer = new DataOutputStream(s.getOutputStream());   
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
            outToServer.write(new byte[]{'H','e','l','l','o','\n'});
            System.out.println(inFromServer.readLine());
            s.close();
        } catch (IOException ex) {System.out.println(ex);}
    }
    
}
