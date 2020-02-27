import java.util.concurrent.ExecutionException;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private String cpf;


//    public Funcionario(String nome,String cpf, int idade, double salario)throws Exception{
//        this.setNome(nome);
//        this.setCpf(cpf);
//        this.setIdade(idade);
//        this.setSalario(salario);
//    }

    public abstract double getBonificacao();

    // Getters e Setters
    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}
    public double getSalario(){ return this.salario;}
    public String getCpf() { return cpf;}


    public void setNome(String nome) throws Exception{
        if(nome == null || nome.equals("") || nome.equals(" "))
            throw new Exception("Invalid Name!");

        this.nome = nome;
    }
    public void setIdade(int idade) throws Exception{
        if(idade < 0 || idade < 18 || idade > 100)
            throw new Exception("Invalid Age, please write a age valid!");

        this.idade = idade;
    }
    public void setSalario(double salario) throws Exception{
        if(salario < 0 || salario > Integer.MAX_VALUE)
            throw new Exception("Invalid salary!");

        this.salario = salario;
    }
    public void setCpf(String cpf) throws Exception{
        if(cpf == null || cpf.equals("") || cpf.equals(" "))
            throw new Exception("CPF is not valid!");

        this.cpf = cpf;
    }
}
