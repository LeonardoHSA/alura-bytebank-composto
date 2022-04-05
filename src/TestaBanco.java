
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo silveira;";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		// Associa o Cliente paulo a conta contaPaulo
		contaPaulo.titular = paulo; // Desta maneira conseguimos associar o objeto Conta contaPaulo para o objeto Cliente paulo 
		System.out.println(contaPaulo.titular.nome);
		System.out.println(contaPaulo.titular);
		System.out.println(paulo);
	}
}
