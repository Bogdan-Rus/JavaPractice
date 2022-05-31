package Structuri;

import org.junit.Test;

public class Matematica {

    //Structuri=alternative si repetitive
    //Structuri alternative=if...then...else si switch...case

    @Test
    public void MatematicaTest(){
        NumarMaiMareCa20();
        Numarestepar(20);
        NumarMaiMareCaNumar(68,15);
        NumarMaiMareCaNumar(15,70);
        VerificParitateNumar( 21);
        VerificParitateNumar( 64);
        VerificNumarImparDivizibilV2(5);
        VerificNumarImparDivizibilV2(10);
        VerificNumarImparDivizibilV2(9);
        VerificNumarImparDivizibilV1(14);
        PrinteazaZi("Duminica");
    }

    private void VerificNumarImparDivizibil(int i) {
    }

    //Verificam daca un nr e mai mare ca 20
    public void NumarMaiMareCa20(){
        if (38>20){
            System.out.println("Numarul 38 este mai mare ca 20");
        }
        else {
            System.out.println("Numarul 38 este mai mic ca 20");
        }

    }

    public void NumarMaiMareCaNumar(Integer Numar, Integer Comparatie){
        if (Numar>Comparatie){
            System.out.println("Numarul" +Numar+ " este mai mare ca "+Comparatie);
        }

        else {
            System.out.println("Numarul" +Numar+ " este mai mic ca "+Comparatie);
        }

    }
    //Verificam daca un nr este par
    // "/" este folosit pt impartire
    //"%" este folosit la impartiere dar afiseaza restul
    // 4:2= 2.0  5:2=2.1  6:2=3 7:2=3.1
    public void Numarestepar(int i){
        if (8%2==0) {
            System.out.println("Numarul este par");
        }
        else {
            System.out.println("numarul este impar");
        }
    }


    public void VerificParitateNumar(Integer Number) {
        if (Number % 2 == 0) {
            System.out.println(Number + "este par");
        } else {
            System.out.println(Number + "este impar");
        }

    }

    //Verific daca un numar este impar si divizibil cu 5
    public void  VerificNumarImparDivizibilV1(Integer Numar) {
        if (Numar % 2 == 1 && Numar % 5 == 0) {
            System.out.println(Numar + "este impar si divizibil cu 5");
        } else {
            System.out.println(Numar + " nu este impar si nici divizibil cu 5");
        }
    }


    public void VerificNumarImparDivizibilV2(Integer Numar) {

        if (Numar % 2 == 1) {
            if (Numar % 5 == 0) {
                System.out.println(Numar + " este impar si divizibil cu 5");
            }
            else{
                System.out.print(Numar + " este par si divizibil cu 5");
            }
        }
        else {
            if (Numar%5==0){
                System.out.println(Numar + " este impar si divizibil cu 5");
            }
            else {
                System.out.println(Numar + " este par dar nu este divizibil cu 5");
            }
        }


    }
    //Switch case pe zilele saptamanii
    public void PrinteazaZi(String ZiCurenta){
        switch (ZiCurenta){
            case"Duminica":
                System.out.println("Astazi este duminica");
                break;
            case "Luni":
                System.out.println("Astazi este luni");
            case "Marti":
                System.out.println("Astazi este marti");
        }
    }



}
