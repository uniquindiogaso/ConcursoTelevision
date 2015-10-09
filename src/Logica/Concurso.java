package Logica;

/**
 *
 * @author gusta
 */
public class Concurso {

    private int numActPar;
    private Municipio[][] municipios;

    public Concurso(int n) {
        municipios = new Municipio[n][20];
    }

    public void cambiarCancion(String numIns, String cancion) {
        for (int i = 0; i < municipios.length; i++) {
            for (int j = 0; j < municipios[0].length; j++) {
                if (municipios[i][j] != null) {
                    int pos = municipios[i][j].buscarParticipante(numIns);
                    if (pos != -1) {
                        municipios[i][j].getParticipantes()[pos].setCancion(cancion);
                    }
                }
            }
        }
    }

    public boolean buscarMunicipio(String id) {
        for (int i = municipios.length - 1; i >= 0; i--) {
            for (int j = 0; j < municipios[0].length; j++) {
                if (municipios[i][j] != null) {
                    if (municipios[i][j].getId().equals(id)) {
                        return true;
                    }
                }

            }

        }
        return false;

    }

    public void agregarMunicipio(Municipio m) {
        if (!buscarMunicipio(m.getId())) {
            for (int i = municipios.length - 1; i >= 0; i--) {
                for (int j = 0; j < municipios[0].length; j++) {
                    if (municipios[i][j] == null) {
                        municipios[i][j] = m;
                        return;
                    }

                }
            }
        }
    }

    public boolean agregarParcipante(String id, Participantes p) {
        if (buscarMunicipio(id)) {
            for (int i = 0; i < municipios.length; i++) {
                for (int j = 0; j < municipios[0].length; j++) {
                    if (municipios[i][j] != null) {
                        if (municipios[i][j].getId().equals(id)) {
                            return municipios[i][j].agregarParticipante(p);
                        }
                    }
                }
            }
        }
        return false;
    }

    public String masClasificados() {
        String res = "";
        int max = -1;

        for (int i = 0; i < municipios.length; i++) {
            for (int j = 0; j < municipios[i].length; j++) {
                if (municipios[i][j] != null) {
                    if (municipios[i][j].contarClasificados() > max) {
                        max = municipios[i][j].contarClasificados();
                        res = municipios[i][j].getNombre();
                    }
                }
            }

        }

        return res;
    }

}
