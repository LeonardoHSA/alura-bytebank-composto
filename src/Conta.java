public class Conta { // Classe chamada Conta
	private double saldo;	//	''	''	''	''	// Com o private fazemos com que atributo saldo n�o seja modificado e nem lido diretamente, sem que pase por um m�todo da pr�pria calsse
	int agencia;	// atributos da classe
	int numero;		//	''	''	''	''
	Cliente titular; //	''	''	''	''
	// Se quisermos relacionar a nossa conta com algum cliente precisamos rfer�nciar o titular para a classe Cliente, como foi feito
	
	public void deposita(double valor){ // Criando o m�todo depositar
		this.saldo += valor; /* this � uma palavra reservada no java para refer�nciar o objeto que esteja invocando este m�todo, que no caso � o objeto contaPaulo, ou qualquer conta que voc� esteja invocando determinado m�todo*/
	}
	
	public boolean saca(double valor) { /* Um m�todo que retorna um valor booleano para o usu�rio ( true ou false)*/
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true; /* O return � uma palavra chave do java, ele para a execu��o do m�todo e volta (Retorna) para quem estava chamando o m�todo, que no caso � a conta que estiver invocando o m�todo*/
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); // POdemos reutilizar um m�todo da sua pr�pria classe. que no caso � o deposita
			return true;
		} else {
			return false;
		}
	}
	
	// Agora que o atributo saldo � privado, temos que criar um m�todo para que se possa concultar o saldo
	
	public double getSaldo() { /* get � uma conven��o para quando queremos imprimir um valor na tela*/
		return this.saldo;
	}
}

// Quando n�o se quer que nenhuma mensagem de retorno volte para o usu�rio colocamos a palavra reservada void no m�todo a ser criado

// OBS: N�o existe m�todos dentro de m�todos 