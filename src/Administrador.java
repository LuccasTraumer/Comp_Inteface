public class Administrador extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticar;
    public Administrador(){
        autenticar = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 200;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticar.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticar.autentica(senha);
    }
}
