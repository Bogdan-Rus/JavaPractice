package OOPMostenire;

import java.util.List;

public class Fotbal extends Sport {

    public  boolean capitan;
    public Integer nrEchipamente;
    public List<String> Reguli;

    public Fotbal(String nume, String denumire,
                  Boolean esteEchipa, Integer nrmembrii,
                  boolean Capitan, Integer nrEchipamente,List<String>Reguli) {
        super(nume, denumire, esteEchipa, nrmembrii);



        }
}




