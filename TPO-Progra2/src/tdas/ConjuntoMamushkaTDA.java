package tdas;

public interface ConjuntoMamushkaTDA {
	void inicializar(); //c
	//inicializado
	void guardar(int dato); //c
	//inicializado
	void sacar(int dato); //l
	//inicializado y no vacio
	int elegir(); //c
	//inicializado
	int perteceCant(int dato); //l
	//inicializado
	boolean estaVacio();//c
}
