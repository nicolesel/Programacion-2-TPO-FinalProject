package tdas;

import implementaciones.ConjuntoEspecialEstatica.Respuesta;

public interface ConjuntoEspecialTDA { 
	public void inicializarConjunto(); //c
	//debe estar inicializado
	public Respuesta agregar(int valor); //l
	//debe estar inicializado
	public Respuesta sacar(int valor); //l
	//debe estar inicializado
	public Respuesta elegir(); //c
	 //debe estar inicializado
	public boolean pertenece(int valor);//l
	//debe estar inicializado
	public boolean conjuntoVacio(); //c
}
