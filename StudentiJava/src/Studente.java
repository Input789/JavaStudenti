/*
Classe 4CIN studente
GALDINI MATTEO 10/10/2024
*/

public class Studente
{
    //Attributi
    private String nome, cognome;
    
    //Costruttore
    public Studente (String nome, String cognome){
        this.nome = nome; //Il this è un riferimento a se stesso, punta su se stesso
        this.cognome = cognome;
        
    }
    
    
    //Metodi
    public void setNome(String nome){
        
        this.nome = nome;
        
        /*
        if (nome.equals("Matteo")){
            this.nome = nome;
            this.cognome = "Galdini";
        
            
        }else System.out.println("Non ti permettere");
        */
        
    }
    
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    public String getNome(){
        return nome;
        
    }
    
    public String getCognome(){
        return cognome;
        
    }
    
    public String toString(){
        return nome + " " + cognome;
    }

}
