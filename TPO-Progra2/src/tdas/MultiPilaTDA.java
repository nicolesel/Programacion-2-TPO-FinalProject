package tdas;

import tda.PilaTDA;

public interface MultiPilaTDA {
	void inicializar(); //c
	//inicializada y pila inicializada
	void apilar(PilaTDA pila); //l
	//inicializada y pila inicializada
	void desapilar(PilaTDA pila); //l
	// inicializada y cant mayor o igual que cero
	PilaTDA tope(int cant); //l
	 //inicializada
	boolean pilaVacia();//c
	
	
	
	
	//no va
	void print();
}
