package VariableMethod;

import org.junit.Test;

import java.awt.font.NumericShaper;

public class Cursant {

    //acesta e un comentariu
    /*acesta este un alt fel de comentariu */
    //Class= o colectie de variabile si metode
    //Intr-un fisier Java putem avea mai multe clase
    //Recunoastem o clasa dupa cuvantul cheie "class"
    //Structura clasa= public class Nume {}
    //Orice structura invatam trebuie scrisa in interiorul unei clase (Java)
    //Variabila= atributul unei clase
    //O clasa poate avea n variabile / sau deloc
    //Tipuri variabile= globala si locala
    //O variabila trebuie sau nu sa primeasca o valoare
    //Structura variabila globala= public tip variabila Nume
    //Dam o valoare unei variabile cu =
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Ocupatie;
    public Character Sex;
    public Double Inaltime;
    public Boolean esteAngajat;
    //Metoda= actiunea unei clase
    //O clasa poate sa contina sau nu n metode
    //Tipuri metode:void si return
    //Structura metoda void= public void Nume(){}
    //Metodele pot sau nu sa contina parametrii

    @Test
    public void AtribuireVariabile() {
        //Dam valori pt variabilele de mai sus
        //Nume=''rus '';
        //Prenume=;;bogdan'';
        //Varsta=34;
        //Ocupatie="ocupatie";
        //Sex='M';
        //Inaltime=1.76;
        //esteAngajat=true;}
        //Printam o valoare in consola
        System.out.print(Nume + '\n' + Prenume);
        System.out.print(Nume);
        System.out.print('\n');
        System.out.print(Prenume);

        printeazaNota();

        promovareCurs();

        System.out.println(getSalarV1());
        System.out.println(getSalarV2());

    }

    //print vs printl
    // print-printeaza si ramane pe randul curent
    //printl- printeaza si sare la randul urmator



    //variabila locala= tipvariabila+ nume
    public void  printeazaNota(){
        Integer notamanual=10;
        Integer notaautomation=10;
        System.out.println("Cursantul Paula J a luat notele:"+notamanual+','+notaautomation);


    }

    public void promovareCurs(){
        Boolean promovare=true;
        System.out.print("A promovat cursantul"+Nume+" "+Prenume +"?");
        System.out.println(promovare);
    }

    //Metoda return=exprimare care contine "returneaza"
    //Structura metoda return= public "tip de data"+ Nume(){}
    //Exista o conventie in Java ca metodele cu return sa aiba in fata "get"
    //Returnam salariul dorit
    public String getSalarV1(){
        Integer Salariu=3000;
        String s= String.valueOf(Salariu)+" Lei";
        return s;
        //nu poti sa lipesti integer cu string prin +
        //cauti pe google=convert integer to string java
    }
    public Integer getSalarV2(){
        Integer salar=5000;
        return salar;

    }

}

//17.05.2022
//Structuri=sunt de 2 feluri
//Structuri alternative si repetitive
// Strcturi alternative: if...then...else/
//Structuri alternative:switch...case 1...case 2




