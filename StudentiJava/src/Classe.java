/*
Classe
GALDINI MATTEO 3CIN 10/10/2024
*/

import java.util.Scanner;

public class Classe{
    // Studente uno, due, tre;
    
    Studente[] studentsList;
    final int DIM; //const int DIM;
    int i;
    String removed;
    
    /*
    public Classe(Studente uno, Studente due, Studente tre){
        this.uno = uno;
        this.due = due;
        this.tre = tre;
        
    }
    */

    public Classe(){
        DIM = 3;
        studentsList = new Studente[DIM];
        i = 0;
        removed = " ";
    }

    
    public String toString(){
        //return studentsList[0] + " " + studentsList[1] + " " + studentsList[2];
        String buffer = "La classe è composta da: \n";
        for (int i = 0; i<studentsList.length; i++) {
            if (studentsList[i] == null){
                buffer = buffer + (i + 1) + ". studente mancante," + " ";
            }
            buffer = buffer + (i + 1) + ". " + studentsList[i] + ", ";
        }

        return buffer;

    }

    public void readStudent(Scanner console){
        


        System.out.print("Insert name: ");
        String name = console.nextLine();
        System.out.print("Insert surname: ");
        String surname = console.nextLine();

        if (i > (DIM - 1)){
            System.out.println("Errore");
        }        
        else{
            studentsList[i] = new Studente(name, surname);
            i++;
        }

    }

    public void removeStudent(Scanner console){
        i--;
        if (i <= 0){
            System.out.println("Errore");
        }
        studentsList[i] = null;
    }

    public void selectStudent(Scanner console){
        System.out.print("Scegli lo studente da eliminare: ");
        String rname = console.nextLine();
        String rsurname = console.nextLine();
        Studente rstudent = new Studente (rname, rsurname);
        for (int i = 0; i<DIM; i++){
            if (rstudent == studentsList[i]){
                studentsList[i] = null;
            }
        }

    }
}