/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.biblio.coleção;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import pt.biblio.coleção.Língua;
import pt.biblio.coleção.Livro;

/**
 *
 * @author Admin
 */
public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList();

    public void gerirlivros() {
        livros.add(new Livro("Harry Potter e o Caneco", "Rowling"));
        livros.add(new Livro("SandGuy", "Gaiman"));
        livros.add(new Livro("Dunno", "Some Dude"));
        livros.add(new Livro("Shoggoths in droves", "Anne Doe", true));
        livros.add(new Livro("Neverwhere", "Gaiman"));
        livros.add(new Livro("Deuses Americanos", "Gaiman"));
        livros.add(new Livro("Ajuda o Tim", "Rin", true));
//        livros.add(new Livro(3.0, Língua.Português));

    }
    
    public List<Livro> procurarLivros (Predicate<Livro> filtro){
           return livros.stream().filter(filtro).collect(Collectors.toList());
    }

    /*public ArrayList<Livro> procurar(String autor) {
        ArrayList<Livro> resultados = new ArrayList<>();
        //cria array resultados com os dados dos array livros
        /*iterações
        int i=0;
         for(i=0; i<3;i++){
            livros.add(new Livro());
        do{
            livros.add(new Livro());
            i++;
        }while (i<3);
        i=0
      
                    
        while (i < 3) {
            i++;*/
       
       //procura "Gaiman" em nome de Biblio. Responde String Overrided em Livro
        /*for (Livro livro : livros) {
                if (livro.getAutor() != null && autor.equals(livro.getAutor())) {
                resultados.add(livro);
                
                }
                
            
              //throw new RuntimeException("The computer says no."); 
               //RuntimeException e = new RuntimeException("The computer says no.");
               // throw e;
                }
                //throw new RuntimeException("The computer says no.");
               // System.out.println("The computer says no.");
                if (resultados.isEmpty()) {
                System.out.println("The computer says no.");
                
                if(resultados != null ){
                 System.out.println("Livros encontrados: " + resultados);   
                } 
                
                
            }
              
              return null;


        
      
}*/
    }

    
       
       
 
       
    

