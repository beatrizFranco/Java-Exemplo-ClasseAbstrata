/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beatriz
 */
public class Classe {
    
    public static void main(String[] args) {
        
        //Criando objeto do tipo Carro usando o contrutor vazio
        Carro ObjCarro = new Carro();
        
	//ALTEREI AQUI!!

        //Criando objeto do tipo Onibus usando construtor com parâmetros
        Onibus ObjOnibus = new Onibus("Mercedez Bens","Paradiso",50);
        
        //Criando objeto do tipo Caminhao usando construto vazio
        Caminhao ObjCaminhao = new Caminhao();
        
        //Criando objeto do tipo Moto usando contrutor com parâmetros
        Moto ObjMoto = new Moto("Honda","Falcon",400);
        
        //Exibindo os dados da moto
        System.out.println("Dados da Moto: \n" +
                "Marca: " + ObjMoto.getMarca() + "\n" +
                "Modelo: " + ObjMoto.getModelo() + "\n" +
                "Cilindrada: " + ObjMoto.getCilindrada() + "\n");
    }
}
