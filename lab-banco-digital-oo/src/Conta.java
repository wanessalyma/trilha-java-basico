import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public abstract class Conta {
    private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private List<Transacoes> transacoes;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacoes(new Date(), "Depósito", valor));
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add(new Transacoes(new Date(), "Saque", valor));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo) {
            sacar(valor);
            contaDestino.depositar(valor);
            transacoes.add(new Transacoes(new Date(), "Transferência", valor));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    protected void extrato() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    protected void imprimirExtratoCliente() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("Transações:");
        for (Transacoes t : transacoes) {
            System.out.println(t);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public List<Transacoes> getTransacoes() {
        return transacoes;
    }
    
}
