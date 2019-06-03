
public class Onibus extends Veiculo{
    
    //Definindo atributos de Onibus
    private int lugares;
    
    //Construtor vazio
    public Onibus(){
        super();
    }
    
    //Construtor com parâmetros
    public Onibus(String marca, String modelo, int pLugares){
        super(marca,modelo);
        this.setLugares(pLugares);
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
    
    //Método da superclasse
    void abastecer(){
        
    }
}
