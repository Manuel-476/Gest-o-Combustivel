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
public class metodos_posto {
    
    private String data_inaug;
    private String endereco;
    private String combustivel;
    private String nome;
    private String tanque;
    private String volume;

    
    private int num_reg;
    private int id_combus;
    private int id_tanq;
    private int id_posto;
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public String getNome()
    {
        return nome;
    }
  
    public void setTanque(String tanq)
    {
        this.tanque=tanq;
    }
    public String getTanque()
    {
        return tanque;
    }
    
    public void setIdtanq(int id_tanq)
    {
        this.setId_tanq(id_tanq);
    }
    public int getIdtanq()
    {
        return getId_tanq();
    }
    
    public void setCombustivel(String combus)
    {
        this.combustivel=combus;
    }
    public String getCombustivel()
    {
        return combustivel;
    }
    
    
    public void setEndereco(String endereco)
    {
        this.endereco=endereco;
    }
    public String getEndereco()
    {
        return endereco;
    }
    
    public void setData_inaug(String data)
    {
        this.data_inaug=data;
    }
    public String getData_inaug()
    {
        return data_inaug;
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
     * @return the id_posto
     */
    public int getId_posto() {
        return id_posto;
    }

    /**
     * @param id_posto the id_posto to set
     */
    public void setId_posto(int id_posto) {
        this.id_posto = id_posto;
    }

    /**
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }
}
