package tdas;

import tda.ConjuntoTDA;

public interface DiccionarioSimpleTDA {
	void inicializar();//c
	//inicializada
	void agregar(int clave, int valor); //l
	//inicializada
	void eliminar(int clave); //p
	//inicializada y clave existente
	int recuperar(int clave);//p
	//inicializada
	ConjuntoTDA claves(); //p
	
}
