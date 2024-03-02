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
public class Metodos_Login {
    private String email;
    private String senha;
    private String funcao;
    private int cpf;
    
    
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    public String getEmail()
    {
        return email;
    }
     
    public void setSenha(String senha)
    {
        this.senha=senha;
    }
    
    public String getSenha()
    {
        return senha;
    }
     
    public void setFuncao(String funcao)
    {
        this.funcao=funcao;
    }
    
    public String getFuncao()
    {
        return funcao;
    } 
    
    public void setCpf(int cpf)
    {
        this.cpf=cpf;
    }
    
    public int getCpf()
    {
        return cpf;
    }
    
}
