package me.dio;

public class Vendedor extends FuncionarioCLT {

    private Double valorBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorBonificacao=" + valorBonificacao +
                '}';
    }
}
