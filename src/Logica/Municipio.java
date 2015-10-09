/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author gusta
 */
public class Municipio {

    private String id;
    private String nombre;
    private Participantes[] participantes;

    public Municipio(String id, String nombre, Participantes[] participantes) {
        this.id = id;
        this.nombre = nombre;
        participantes = new Participantes[1000];
    }

    public int buscarParticipante(String numIns) {
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] != null) {
                if (participantes[i].getNumInsc().equals(numIns)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Participantes[] getParticipantes() {
        return participantes;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public boolean agregarParticipante(Participantes p) {
        if (buscarParticipante(p.getNumInsc()) == -1) {
            for (int i = 0; i < participantes.length; i++) {
                if (participantes[i] == null) {
                    participantes[i] = p;
                    return true;
                }
            }
        }
        return false;
    }

    public int contarClasificados() {
        int res = 0;
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] != null) {
                if (participantes[i].getCalificacion() > 80) {
                    res++;
                }
            }
        }
        return res;
    }
}
