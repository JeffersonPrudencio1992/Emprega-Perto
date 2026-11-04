public class Pessoa {

    // encapsulamento//
    private String cpf;
    public String nome;
    private String endereco;

    // construtores//

    public Pessoa(String cpf, String nome, String endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getcpf(){
        return cpf;
    }
    public String getnomem(){
        return nome;
    }
    public String getendereco(){
        return endereco;
    }

    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setenderco(String endereco){
        this.endereco = endereco;
    }
}