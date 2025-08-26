//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Variáveis parte 1
        String nome = "Vinicius";
        int idadePessoa = 19;
        double salarioMensalBruto = 4500.00;
        int mesesTrabalhados = 12;
        int quantidadeProdutosComprados = 25;

        // Operações
        double salarioAnualBruto = salarioMensalBruto * mesesTrabalhados;
        double desconto = 2000.00;
        double salarioAnualLiquido = salarioAnualBruto - desconto;
        double valorTotalCompras = 3750.00;
        double mediaPorProduto = valorTotalCompras / quantidadeProdutosComprados;
        String mensagemFinal = "Olá, " + nome + "! Seu salário anual líquido é R$ " + String.format("%.2f", salarioAnualLiquido);

        //Exibição de Resultados

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idadePessoa + " anos");
        System.out.println("Salário mensal bruto: R$ " + String.format("%.2f", salarioMensalBruto));
        System.out.println("Meses trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de produtos comprados: " + quantidadeProdutosComprados);
        System.out.println("Salário anual bruto: R$ " + String.format("%.2f", salarioAnualBruto));
        System.out.println("Desconto aplicado: R$ " + String.format("%.2f", desconto));
        System.out.println("Salário anual líquido: R$ " + String.format("%.2f", salarioAnualLiquido));
        System.out.println("Valor total de compras: R$ " + String.format("%.2f", valorTotalCompras));
        System.out.println("Média por produto: R$ " + String.format("%.2f", mediaPorProduto));
        System.out.println(mensagemFinal);
    }
}