package dados;

import java.util.ArrayList;

public class GerenciaRobo {
    private ArrayList<Robo> robos;
    public GerenciaRobo(){
        robos = new ArrayList<>();
    }
    //Método que retorne o ArrayList de robos
    public ArrayList<Robo> getRobos(){
        return robos;
    }

    //Método para cadastrar um Robo no ArrayList de robos
    public boolean cadastraRobo(Robo robo){
        int id = robo.getId();
        if (consultaRobo(id) == null){
            return robos.add(robo);
        }
        return false;
    }
    //Método para consultar um Robo pelo id
    public Robo consultaRobo(int id){
        for (Robo roboAux:robos){
            if (id == roboAux.getId()){
                return roboAux;
            }
        }
        return null;
    }
}
