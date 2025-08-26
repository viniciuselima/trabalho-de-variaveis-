import java.text.DecimalFormat;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
     // Manipulação de Dados e Cálculos em Java com Desafio




                // Variáveis
                String nomeProduto = "Cafeteira Elétrica";
                double precoUnitario = 520.50;
                int quantidadeComprada = 10;
                double taxaImposto = 0.18;
                double margemLucro = 0.30;

                // 3. Operações
                double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
                double valorImposto = valorTotalSemImpostos * taxaImposto;
                double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;

                double precoVenda = valorTotalComImpostos * (1 + margemLucro);

                // 4. Desafio Extra: Arredondamento e Formatação
                DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");

                String valorTotalComImpostosFormatado = formatoMoeda.format(valorTotalComImpostos);
                String precoVendaFormatado = formatoMoeda.format(precoVenda);

                String mensagemFinal = "Produto: " + nomeProduto +
                        "\nValor total com impostos: " + valorTotalComImpostosFormatado +
                        "\nPreço de venda sugerido (com margem de lucro): " + precoVendaFormatado;

                // 5. Exibição de Resultados
                System.out.println("Dados do Produto ");
                System.out.println("Nome do produto: " + nomeProduto);
                System.out.println("Preço unitário: " + formatoMoeda.format(precoUnitario));
                System.out.println("Quantidade comprada: " + quantidadeComprada);
                System.out.println("Taxa de imposto: " + (taxaImposto * 100) + "%");
                System.out.println("Margem de lucro: " + (margemLucro * 100) + "%");

                System.out.println("Cálculos");
                System.out.println("Valor total sem impostos: " + formatoMoeda.format(valorTotalSemImpostos));
                System.out.println("Valor do imposto: " + formatoMoeda.format(valorImposto));
                System.out.println("Valor total com impostos: " + valorTotalComImpostosFormatado);
                System.out.println("Preço de venda com margem de lucro: " + precoVendaFormatado);

                System.out.println("Mensagem Final");
                System.out.println(mensagemFinal);
























    }
}