
public class TesteSacaNegativo {

		public static void main(String[] args) {
			
			Conta conta = new Conta();
			conta.deposita(100);
			System.out.println(conta.saca(200));
			
			System.out.println(conta.getSaldo()); // Desta forma conseguimos imprimir o valor de saldo pdindo permissão a classe através do método mostraSaldo, já que agora o atributo slado é privado temos que invocar um método específico para conseguir ver o saldo
			
			
			// Proibido
			//conta.saldo -= 101;
			/* Desta forma estamos trabalhando com o saldo da conta diretamente, sem invocar nenhum método, atribuindo um valor ao slado diretamente. Sempre temos que trabalhar com métodos para que não se possa mudar o valor de algum atributo diretamente. Temos que fazer que saldo não seja lido e nem acessado de uma maneira direta, para isso podemos fazer com que atributos sejam privados*/
			
		}
}
