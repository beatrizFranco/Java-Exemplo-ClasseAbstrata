
public class Caminhao extends Veiculo{
    
    //Definindo atributos de Caminhao
    private int capacidade;
    
    //Construtor vazio
    public Caminhao(){
        super();
    }
    
    //Construtor com parêmetros
    public Caminhao(String marca, String modelo, int pCapacidade){
        super(marca, modelo);
        this.setCapacidade(pCapacidade);
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    //Método da superclasse
    void abastecer(){
        
    }
}
