
/**
 * Escreva uma descrição da classe j aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
class Porcelanato extends Produto {
    private final double areaPorPorcelanato = 0.81;
    private final double precoUnitario = 175.0;

    @Override
    public int calcularQuantidade(double area) {
        return (int) Math.ceil(area / areaPorPorcelanato);
    }

    @Override
    public double getPrecoUnitario() {
        return precoUnitario;
    }
}

