package tdas;

import tda.ConjuntoTDA;

public interface DiccionarioSimpleModTDA {
	void inicializar();//c
	//inicializada
	void agregar(int clave, int valor); //l
	//inicializada
	void eliminar(int clave); //l
	//inicializada y clave existente
	int recuperar(int clave); //l
	//inicializada y clave existente
	int recuperarMod(int clave); //l
	//inicializada
	ConjuntoTDA claves(); //p
}
