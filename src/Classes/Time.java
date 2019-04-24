/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author pedro
 */
public class Time {
    private String nome;
    private int pontuacao;
    
    public void setName(String nome){
        this.nome = nome;
    }
    
    public String getName(){
        return this.nome;
    }
    
    public void aumentaPont(){        
        this.pontuacao++;
    }
    
    public void diminuiPont(){        
        if(this.pontuacao > 0) this.pontuacao--;
    }
    
    public int getPont(){
        return this.pontuacao;
    }
    
    public int resetPont(){
        this.pontuacao = 0;
        return this.pontuacao;
    }
}
