/*
 * Parte de la calculadora que ejecuta el servidor
 */
package SERVER;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class Servidor extends Thread {

    private Socket clientSocket;

    public Servidor(Socket socket) {
        clientSocket = socket;
    }

    public void run() {
        float resultado = 0;
        try {
            String[] msj;

            InputStream is = clientSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();

            byte[] mensaje = new byte[25];
            is.read(mensaje);

            msj = new String(mensaje).split(",");
            System.out.println("Op1: " + msj[0]);
            System.out.println("Op2: " + msj[1]);

            switch (msj[2]) {
                case "+":
                    System.out.println("Operación: suma");
                    resultado = Float.valueOf(msj[0]) + Float.valueOf(msj[1]);
                    break;
                case "-":
                    System.out.println("Operación: resta");
                    resultado = Float.valueOf(msj[0]) - Float.valueOf(msj[1]);
                    break;
                case "*":
                    System.out.println("Operación: producto");
                    resultado = Float.valueOf(msj[0]) * Float.valueOf(msj[1]);
                    break;
                case "/":
                    System.out.println("Operación: division");
                    resultado = Float.valueOf(msj[0]) / Float.valueOf(msj[1]);
                    break;
            }

            os.write(String.valueOf(resultado).getBytes());

            System.out.println("Mensaje enviado");

            System.out.println("Terminado");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Creando socket servidor");

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket();
            System.out.println("Realizando el bind");
            int puerto =6666; //Integer.parseInt(JOptionPane.showInputDialog("Introducir puerto servidor:"));
            InetSocketAddress addr = new InetSocketAddress("localhost", puerto);
            serverSocket.bind(addr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Aceptando conexiones");

        while (serverSocket != null) {
            try {
                Socket newSocket = serverSocket.accept();
                System.out.println("Conexión establecida");

                Servidor hilo = new Servidor(newSocket);
                hilo.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Terminado");
        }
    }
}
