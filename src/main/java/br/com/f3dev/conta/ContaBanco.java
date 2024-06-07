package br.com.f3dev.conta;

public class ContaBanco {

    public Integer numero;
    public String agencia;
    public String nomeCliente;
    public Double saldo;

    @Override
    public String toString() {
        return "ContaBanco{" + '\n' +
                "Número=" + numero + '\n' +
                "Agência=" + agencia + '\n' +
                "Nome Cliente=" + nomeCliente + '\n' +
                "Saldo=" + saldo + '\n' +
                '}';
    }
}
