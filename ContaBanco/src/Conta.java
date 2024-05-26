public class Conta {
    int numero = 1021;
    String agencia = "067-8";
    String nome = "MARIO ANDRADE";
    double saldo = 237.48;

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public void setNumero(int numero){
        this.numero= numero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " +  agencia
    + ", sua conta é " + numero + " e seu saldo de " + saldo + " já está disponível para saque.";
    }
}
