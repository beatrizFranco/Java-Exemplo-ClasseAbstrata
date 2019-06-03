
public class Carro extends Veiculo{
    
    //Definindo atributos de Carro
    private int portas;
    
    //Construtor vazio
    public Carro(){
        super();
    }
    
    //Construtor com parâmetros
    public Carro(String marca, String modelo, int pPortas){
        super(marca,modelo);
        this.setPortas(pPortas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    //Método da superclasse
    void abastecer(){
        
    }
    
}
