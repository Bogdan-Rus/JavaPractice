package Structuri;

import org.junit.Test;

import java.lang.module.FindException;

public class Algebra {

    @Test
    public void Algebratest(){
        //Printeazanr();
       // PrinteazanrWhile();
        PrinteazaPar(20);


    }
    //printam primele 50 de numere
public void Printeazanr(){
        for (Integer index=0; index<51; index++){
       System.out.println( index );
        }
    }
    //printam primele 50 de numere[0...50] cu WHILE
    //While are un numar infinit de pasi
    //While se foloseste cand trebuie sa astepti
    public void PrinteazanrWhile(){
        Integer index=0;
        while (index<51){
            System.out.println(index);
            index++;


        }

    }

    //Printeaza numerele pare de la la un 0 la un numar
    public void PrinteazaPar(Integer capat){
        for (Integer index=0; index<capat+1; index++){
            if (index%2==0){
                System.out.println(index);
            }
        }
    }



}

