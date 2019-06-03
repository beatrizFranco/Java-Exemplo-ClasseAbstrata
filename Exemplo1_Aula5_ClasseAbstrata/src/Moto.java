
public class Moto extends Veiculo{
    
    //Definindo atributos de Moto
    private int cilindrada;
    
    //Construtor vazio
    public Moto(){
        super();
    }
    
    //Construtor com parâmetros
    public Moto(String marca, String modelo, int pCilindrada){
            super(marca,modelo);
            this.setCilindrada(pCilindrada);
}

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    //Método da superclasse
    void abastecer(){
        
    }
}
