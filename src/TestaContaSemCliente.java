
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaMarcela = new Conta();
		System.out.println(contaMarcela.getSaldo());
		
		contaMarcela.titular = new Cliente(); // podemos criar a associação em uma linha, como é o caso. Ao executarmos a aplicação, será impresso um Id referente ao Cliente, revelando a associação feita entre os objetos.
		System.out.println(contaMarcela.titular);
		
		contaMarcela.titular.nome = "Marcela";
		System.out.println(contaMarcela.titular.nome);
	}
}
