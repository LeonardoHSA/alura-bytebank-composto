
public class TesteSacaNegativo {

		public static void main(String[] args) {
			
			Conta conta = new Conta();
			conta.deposita(100);
			System.out.println(conta.saca(200));
			
			System.out.println(conta.getSaldo()); // Desta forma conseguimos imprimir o valor de saldo pdindo permiss�o a classe atrav�s do m�todo mostraSaldo, j� que agora o atributo slado � privado temos que invocar um m�todo espec�fico para conseguir ver o saldo
			
			
			// Proibido
			//conta.saldo -= 101;
			/* Desta forma estamos trabalhando com o saldo da conta diretamente, sem invocar nenhum m�todo, atribuindo um valor ao slado diretamente. Sempre temos que trabalhar com m�todos para que n�o se possa mudar o valor de algum atributo diretamente. Temos que fazer que saldo n�o seja lido e nem acessado de uma maneira direta, para isso podemos fazer com que atributos sejam privados*/
			
		}
}
