/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// el nombre del paquete al que pertenece nuestra clase
package com.mycompany.cantantes;

/**
 *
 * @author samit
 */
public class artistas { //creamos nuestra primera clase donde vendrán los atributos
    // creamos variables
    public String nombre;
    public String genero;
    public String canciones;
    public String albums;
    public String seguidores;
    
    // creamos método constructor
    public artistas(String nombre, String genero, String canciones, String albums, String segui){
        this.nombre=nombre;
        this.genero=genero;
        this.canciones=canciones;
        this.albums=albums;
        this.seguidores=segui;
    }

    // creamos métodos SET Y GET de cada variable
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCanciones() {
        return canciones;
    }

    public void setCanciones(String canciones) {
        this.canciones = canciones;
    }

    public String getAlbums() {
        return albums;
    }

    public void setAlbums(String albums) {
        this.albums = albums;
    }

    public String getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(String seguidores) {
        this.seguidores = seguidores;
    }
    
    
}
