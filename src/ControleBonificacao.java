public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario func){
        this.soma += func.getBonificacao();
    }
    public double getSoma(){return this.soma;}
}
