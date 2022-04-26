/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cantantes;

//importamos los paquetes que utilizaremos
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author samit
 */
public class Archivo { // creamos nuestra clase
    
        //creamos un método estático de tipo boolean para la creación del archivo
        public static Boolean crearArchivo(ArrayList<artistas> listContent) {
        try { //entra al primer ciclo
            String ruta = "/Documentos/filename.txt"; // definimos la ruta
            File file = new File(ruta); //lo agregamos a un archivo
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            //lo agregamos a la clase filewriter y a su vez este lo agregamos a la clase bufferedwriter
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            listContent.stream().forEach(artista -> { //hacemos una lista 
                try { //leemos todo lo que guardará con la clase buffeeredwriter
                    bw.write(artista.getNombre() + ",");
                    bw.write(artista.getGenero() + ",");
                    bw.write(artista.getCanciones() + ",");
                    bw.write(artista.getAlbums() + ",");
                    bw.write(artista.getSeguidores() + ",");
                } catch (IOException ex) { 
                    JOptionPane.showMessageDialog(null, "ERROR");
                    Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            bw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
        //creamos una clase que es la que guaradará los datos en el archivo.
       public static ArrayList<artistas> getArtistas() throws IOException { 
        String cadena;
        String data = "";
        FileReader f = new FileReader("/Documentos/filename.txt");
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            data = data + "" + cadena;
        }
        ArrayList<artistas> art = new ArrayList<artistas>();
        String[] arreart = data.split(",");
        int lengthCollection = (arreart.length / 5);
        for (int i = 0; i < lengthCollection; i++) {
            String nombre = arreart[i * 5];
            String genero = arreart[(i * 5) + 1];
            String canciones = arreart[(i * 5) + 2];
            String albums = arreart[(i * 5) + 3];
            String seguidores = arreart[(i * 5) + 4];
            
            artistas objArtistas = new artistas(nombre, genero, canciones, albums, seguidores);
            art.add(objArtistas);
        }
        b.close();
        return art;
    } 
}
