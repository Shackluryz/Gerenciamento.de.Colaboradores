package me.dio;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua funcionario","Complemento endereço funcionario", "Bairro funcionario");
        System.out.println("-------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Lucas Seller");
        vendedor.setDocumento("000.000.000-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-------");

        OperadorDeCaixa operadorCaixa = new OperadorDeCaixa("Lucas Seller", "000.000.000-00", 2000d, endereco);
        System.out.println(operadorCaixa);
        System.out.println("-------");

        Gerente gerente = new Gerente();
        gerente.setNome("Lucas Seller");
        gerente.setDocumento("000.000.000-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calcularRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);
    }
}
