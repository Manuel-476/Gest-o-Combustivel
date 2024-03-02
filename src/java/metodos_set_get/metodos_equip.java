/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_set_get;

/**
 *
 * @author DELL
 */
public class metodos_equip {
    
    private String nome;
    private int qtd;
    private String posto;
    
    private int id_eq;
    private int num_reg;
    
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    public String getNome()
    {
        return nome;
    }
     

     
    public void setPosto(String posto)
    {
        this.posto=posto;
    }
    
    public String getPosto(){
  
        return posto;
    } 
    
    public void setId_eq(int id_eq)
    {
        this.id_eq=id_eq;
    }
    
    public int getId_eq()
    {
        return id_eq;
    }
    
    public void setNum_reg(int num_reg)
    {
        this.num_reg=num_reg;
    }
    
    public int getNum_reg()
    {
        return num_reg;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
