
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaMarcela = new Conta();
		System.out.println(contaMarcela.getSaldo());
		
		contaMarcela.titular = new Cliente(); // podemos criar a associa��o em uma linha, como � o caso. Ao executarmos a aplica��o, ser� impresso um Id referente ao Cliente, revelando a associa��o feita entre os objetos.
		System.out.println(contaMarcela.titular);
		
		contaMarcela.titular.nome = "Marcela";
		System.out.println(contaMarcela.titular.nome);
	}
}
