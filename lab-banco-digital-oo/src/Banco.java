import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Banco {

    private String nome;
    private List<Conta> contaList;
    Set<Conta> contasSet;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<>();
        this.contasSet = new HashSet<>();
    }

    public void adicionarContaCC (ContaCorrente conta){
        contaList.add(conta);
    }

    public void adicionarContaP (Poupanca conta){
        contaList.add(conta);
    }

    public void clientesCadastrados(){
        Set<String> set = new HashSet<>();
        if (!contaList.isEmpty()) {
            for(Conta conta: contaList){
                set.add(conta.cliente.getNome());       
            } 
            System.out.println(set);
                
        }else {
            throw new RuntimeException("Não possui clientes cadastrados!");
          }
    }

    public void contasCadastradas(){
        if (!contaList.isEmpty()) {
            for(Conta conta: contaList){
                conta.extrato();
            }    
        }else {
            throw new RuntimeException("Não possui conta cadastrada!");
          }
    }

    public void imprimirExtrato(int numeroConta) {
        Conta contaEncontrada = null;
        if(!contaList.isEmpty()){
            for(Conta conta: contaList){
                if(conta.getNumero() == numeroConta){
                    contaEncontrada = conta;
                    break;
                } 
            }
            System.out.println(nome);
            contaEncontrada.imprimirExtratoCliente();
        }else {
            throw new RuntimeException("Não possui conta cadastrada!");
          }
    }

    public String getNome() {
        return nome;
    }

}
