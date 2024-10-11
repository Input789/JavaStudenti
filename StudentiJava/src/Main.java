/*
Programma che simula la classe più strana del mondo
GALDINI MATTEO 10/10/2024
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("4CIN, programma avviato");

        Studente galdini = new Studente ("Matteo", "Galdini");

        Scanner console = new Scanner(System.in); //Le informazioni in input che arrivano al mio computer


        /*
        Studente uno = readStudent(console);
        Studente due = readStudent(console);
        Studente tre = readStudent(console);
        */
        
        System.out.println(galdini.getNome() + " " + galdini.getCognome());
        
        /*
        galdini.setNome("Buongiorno");
        galdini.setCognome("Buonasera");
        
        System.out.println(galdini.getNome() + " " + galdini.getCognome());
        */
        
        System.out.println(galdini); //Nome di variabile che contiene oggetti
        
        String end = "1";
        String choice = "2";

        Classe cin4 = new Classe ();
        while (end != "0"){
            System.out.println("Scegli cosa fare: ");
            System.out.println("1 --> Add Student");
            System.out.println("2 --> See Students list");
            System.out.println("3 --> Remove Student");
            System.out.println("0 --> Close Program");
            end = console.nextLine();
            switch(end){
                case "1":
                    cin4.readStudent(console);
                    break;
                case "2":
                    System.out.println(cin4); 
                    break;
                case "3":
                    System.out.println("1 --> Remove Last Student");
                    System.out.println("2 --> Remove Chosen Student");
                    choice = console.nextLine();
                    if (choice == "1"){
                        cin4.removeStudent(console);
                    }
                    if (choice == "2"){
                        cin4.selectStudent(console);
                    }
                    else System.out.println("Wrong Input");
                    break;
                case "0":
                    end = "0";
                    break;

            }

            /*
            cin4.readStudent(console);
            cin4.readStudent(console);
            cin4.readStudent(console);
            cin4.readStudent(console);
            */


             
        }                           
        

        

        console.close();

        System.out.println("4CIN, programma terminato");

        
    }


    /*
    public static Studente readStudent(Scanner console){
        


        System.out.print("Insert name: ");
        String name = console.nextLine();
        System.out.print("Insert surname: ");
        String surname = console.nextLine();

        

        Studente student = new Studente(name, surname);

        return student;
    }
    */

}
