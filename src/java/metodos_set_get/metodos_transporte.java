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
public class metodos_transporte {
      
    private String placa;
    private String marca;
    private String modelo;
    private String categoria;
    private String deposito_vol;
    private String data;
    private String departamento;
    private String combustivel;
    private String nome;

    private int num_reg;
    private int id_trans;
    private int id_depart;
    private int id_combus;
    private int id_tanq;
    private int id_cat;
    
    public void setPlaca(String placa)
    {
        this.placa=placa;
    }
    public String getPlaca()
    {
        return placa;
    }
    
    public void setDeposito_vol(String depos)
    {
        this.deposito_vol =depos;
    }
    public String getDeposito_vol()
    {
        return deposito_vol;
    }
    
    public void setCategoria(String cat)
    {
        this.categoria=cat;
    }
    public String getCategoria()
    {
        return categoria;
    }
    
    
    public void setCombustivel(String combus)
    {
        this.combustivel=combus;
    }
    public String getCombustivel()
    {
        return combustivel;
    }
    
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public String getMarca()
    {
        return marca;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo=modelo;
    }
    public String getModelo()
    {
        return modelo;
    }
    
     
    public void setDepatamento(String depart)
    {
        this.departamento=depart;
    }
    public String getDepartamento()
    {
        return departamento;
    }
    
    public void setData(String data)
    {
        this.data=data;
    }
    public String getData()
    {
        return data;
    }
    
    public void setNum_reg(int num_reg)
    {
        this.num_reg=num_reg;
    }
    public int getNum_reg()
    {
        return num_reg;
    }
    
    public void setId_combus(int id_combus)
    {
        this.id_combus=id_combus;
    }
    public int getId_combus()
    {
        return id_combus;
    }
    
    public void setId_depart(int id_depart)
    {
        this.id_depart=id_depart;
    } 
    public int getId_depart()
    {
        return id_depart;
    }
    
    public void setId_categ(int id_cat)
    {
        this.setId_cat(id_cat);
    }
    public int getId_categ()
    {
        return getId_cat();
    }
    
    public void setId_trans(int id_trans)
    {
        this.id_trans=id_trans;
    }
    public int getId_trans()
    {
        return id_trans;
    }

    /**
     * @return the id_tanq
     */
    public int getId_tanq() {
        return id_tanq;
    }

    /**
     * @param id_tanq the id_tanq to set
     */
    public void setId_tanq(int id_tanq) {
        this.id_tanq = id_tanq;
    }

    /**
     * @return the id_cat
     */
    public int getId_cat() {
        return id_cat;
    }

    /**
     * @param id_cat the id_cat to set
     */
    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
