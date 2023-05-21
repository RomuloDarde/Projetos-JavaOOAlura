package exercicios.orientacaoaobjetos.contabancaria;
import java.time.LocalDate;

public class Conta {
    //Atributos
    private Cliente titular;
    private int numero, agencia;
    private static int totalDeContas;
    private int identificador;
    private double saldo;
    private Data dataDeAbertura;


    //Construtor
    public Conta(Cliente titular, int agencia, int numero, Data dataDeAbertura) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.dataDeAbertura = dataDeAbertura;
        this.totalDeContas ++;
        this.identificador = this.totalDeContas;
    }


    //Getters e Setters
    public String getTitular() { return "Nome Titular: " + titular.getNome() + " \nCPF: " + titular.getCpf();}
    public int getAgencia() {return agencia;}
    public int getNumero() {return numero;}
    public double getSaldo() {return saldo;}
    public Data getDataDeAbertura() {return dataDeAbertura;}
    public static int getTotalDeContas() {return totalDeContas;}
    public int getIdentificador() {return identificador;}

    //Métodos Principais
    public void saque (double valor) {;
        if (valor <= saldo && valor > 0) saldo -= valor;
    }

    public void deposita (double valor) {
        if (valor > 0) saldo += valor;
    }

    public void transferePara(Conta conta, double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            conta.saldo += valor;
        }
    }

    public double getRendimentoMensal () {
        return saldo*0.5/100;
    }

    public void statusConta() {
        System.out.println("----------------------------------");
        System.out.println("Número Identificador: " + getIdentificador());
        System.out.println(getTitular());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Data de Abertura: " + getDataDeAbertura().getData());
        System.out.printf("Saldo Atual: R$ %.2f\n", getSaldo());
        System.out.printf("Rendimento Mensal Atual: R$ %.2f\n", getRendimentoMensal());
        System.out.println();
    }

}
