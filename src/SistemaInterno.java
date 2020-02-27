public class SistemaInterno {
    private int senha = 777;

    public void autenticar(Autenticavel verification){
        boolean autentic = verification.autentica(senha);
        if(autentic){
            System.out.println("You can in on sys!");
        }else {
            System.out.println("You can't in on sys!");
        }
    }

}
