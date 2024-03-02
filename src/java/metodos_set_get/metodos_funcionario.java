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
public class metodos_funcionario {
    
    private String nome;
    private String data_nasc;
    private String est_civil;
    private String genero;
    private String grau_acad;
    private String nacionalidade;
    private String nacionalidade2;
    private String tel;
    private String tel2;
    private String posto;
    private String departamento;
    private String funcao;
    private String mae;
    private String pai;
    private String deficiencia;
    
    private int cpf;
    private int id_nacio;
    private int id_nacioalt;
    private int num_reg;
    private int id_depart;
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setPai(String pai)
    {
        this.pai=pai;
    }
    
    public String getPai()
    {
        return pai;
    }
    
    public void setMae(String mae)
    {
        this.mae=mae;
    }
    
    public String getMae()
    {
        return mae;
    }
     
    public void setFuncao(String funcao)
    {
        this.funcao=funcao;
    }
    
    public String getFuncao()
    {
        return funcao;
    }
     
    
    public void setData_nasc(String data_nasc)
    {
        this.data_nasc=data_nasc;
    }
    
    public String getData_nasc()
    {
        return data_nasc;
    }
    public void setEst_civil(String est_civil)
    {
        this.est_civil=est_civil;
    }
    
    public String getEst_civil()
    {
        return est_civil;
    } 
    
    public void setGrau_acad(String grau_acad)
    {
        this.grau_acad=grau_acad;
    }
    
    public String getGrau_acad()
    {
        return grau_acad;
    } 
   
    public void setGenero(String genero)
    {
        this.genero=genero;
    }
     
    public String getGenero()
    {
        return genero;
    }
    
    public void setDeficiencia(String def)
    {
        this.deficiencia=def;
    }
     
    public String getDeficiencia()
    {
        return deficiencia;
    }    
    
    public void setTel(String tel)
    {
        this.tel=tel;
    }
    public String getTel()
    {
        return tel;
    }

    public void setTelAlt(String tel)
    {
        this.tel2=tel;
    }
    public String getTelAlt()
    {
        return tel2;
    }
    
    public void setPosto(String posto)
    {
        this.posto=posto;
    }
    
    public String getPosto()
    {
        return posto;
    } 
    
    public void setNacionalidade(String nacio)
    {
        this.nacionalidade=nacio;
    }
    
    public String getNacionalidade()
    {
        return nacionalidade;
    } 
    
    public void setNacionalidadeAlt(String nacio)
    {
        this.nacionalidade2=nacio;
    }
    
    public String getNacionalidadeAlt()
    {
        return nacionalidade2;
    } 
    
     
    public void setDepatamento(String depart)
    {
        this.departamento=depart;
    }
    public String getDepartamento()
    {
        return departamento;
    } 
    
    public void setCpf(int cpf)
    {
        this.cpf=cpf;
    }
    
    public int getCpf()
    {
        return cpf;
    }
    
    
    public void setid_nacio(int id_nacio)
    {
        this.id_nacio=id_nacio;
    }
    public int getid_nacio()
    {
        return id_nacio;
    }
    
    public void setid_nacioAlt(int id_nacio)
    {
        this.id_nacioalt=id_nacio;
    }
    public int getid_nacioAlt()
    {
        return id_nacioalt;
    }
    
    public void setNum_reg(int num_reg)
    {
        this.num_reg=num_reg;
    } 
    public int getNum_reg()
    {
        return num_reg;
    }
    
    public void setId_depart(int id_depart)
    {
        this.id_depart=id_depart;
    }
    public int getId_depart()
    {
        return id_depart;
    }
}
