package com.example.hugu.watchmarker.model;

import android.util.Log;
import android.widget.TextView;

import com.example.hugu.watchmarker.Marcador;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by hugu on 27/01/15.
 */
public class ServerListener extends Thread {

    Marcador m;
    public void asd(){

    }

    public void run(){
        Log.i("Listening","asd");

        try {
//            Thread.sleep(100);
            byte[] missatge = new byte[1024];
            int portEscoltar = 5554;
            DatagramSocket socket = new DatagramSocket(portEscoltar);
            while (true) {

                DatagramPacket paquet = new DatagramPacket(missatge, missatge.length);

                socket.receive(paquet);
                Log.i("Paquete recibido","asd");

                String s = new String(missatge, "UTF-8");
                m.setNewAction(s);

            }
        } catch (Exception e) {
            Log.i("Error de cliente",e.toString());
            // TODO: handle exception
        }

    }

    public void setActivity(Marcador activity) {
        m = activity;
    }
}
