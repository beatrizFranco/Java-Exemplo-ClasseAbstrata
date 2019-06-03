/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beatriz
 */
public abstract class Veiculo {
    
    
    //Definindo os atributos da classe abstrata
    private String marca;
    private String modelo;
    
    //Construtor vazio
    public Veiculo(){
        this(" "," ");
    }
    
    //Construtor com parâmetros
    public Veiculo (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //Definindo método abstrato
    abstract void abastecer();
    
}
