package OOPMostenire;

public class Sport {
    public String Nume;
    public  String Denumire;
    public  Boolean esteEchipa;
    public Integer Nrmembrii;

    public Sport(String nume, String denumire,
                 Boolean esteEchipa, Integer nrmembrii) {
        Nume = nume;
        Denumire = denumire;
        this.esteEchipa = esteEchipa;
        Nrmembrii = nrmembrii;
    }
    //oop Mostenire=principiul pe baza caruia clasa parinte, poate sa fie mostenita de n clase copii
    //poti sa faci cate obiecte. clase vrei
    //Exemplu:casa bunicilor cu nepotii
    //In Java, putem mostenii o singura clasa
    //Pentru ca este un limbaj care poate mostenii o singura clasa
    //Cu mostenirea
    //In momentul in care clasa copil, mosteneste clasa parinte trebuie sa apelam constructorul din clasa parinte
    //Si in copil trebuie sa avem un constructor
    //Parintele merge primul, se apeleaza

    public  void  InfoSport(){




    }
}


