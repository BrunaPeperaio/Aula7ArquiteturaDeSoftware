package Exercicio2_1_FactoryMethod;
/**
 * 
 * @author Bruna Peperaio Gon�alves
 * 			201506300
 *
 */
public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
