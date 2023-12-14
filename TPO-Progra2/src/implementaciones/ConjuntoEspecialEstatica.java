package implementaciones;

import imple.Conjunto;
import tda.ConjuntoTDA;
import tdas.ConjuntoEspecialTDA;

public class ConjuntoEspecialEstatica implements ConjuntoEspecialTDA{

	public class Respuesta{
		public boolean error;
		public int rta;
	}
	
	private ConjuntoTDA conjunto;
	
	@Override
	public void inicializarConjunto() { //-> c
		conjunto = new Conjunto(); //c
		conjunto.inicializarConjunto(); //c
		//c+c=c
	}

	@Override
	public Respuesta agregar(int valor) { //-> l
		Respuesta r= new Respuesta(); //c
		if(conjunto.pertenece(valor)) { //l 
			r.error=true; //c
		} //-> l
		else { //si no pertenece, lo agrega y verifica si esta bien agregado.
			conjunto.agregar(valor); //l
			if(conjunto.pertenece(valor)) { //l
				r.error=false; //c
			} //-> l
			else {
				r.error = true; //c
			} //-> c
		} // l + l + c = l
		return r;
		// c+l+l=l
	}

	@Override
	public Respuesta sacar(int valor) { //-> l
		Respuesta r= new Respuesta(); //c
		if(!conjunto.pertenece(valor)) { //l
			r.error=true; //c
		}//-> l
		else { //si pertenece lo saca y verifica si se saco bien.
			conjunto.sacar(valor); //l
			if(conjunto.pertenece(valor)) { //l
				r.error=true; //c
			}//-> l
			else {
				r.error = false; //c
			}//->c
		}//->l
		return r;
		//c+l+l=l
	}

	@Override
	public Respuesta elegir() { //-> c
		Respuesta r = new Respuesta(); //c
		if(conjunto.conjuntoVacio()) { //c
			r.error=true; //c
		}//-> c
		else {
			r.error=false; //c
			r.rta=conjunto.elegir(); //c
		}//-> c
		return r;
		//c+c+c= c
	}

	@Override
	public boolean pertenece(int valor) { //-> l 
		return conjunto.pertenece(valor); //l
	}

	@Override
	public boolean conjuntoVacio() { //-> c
		return conjunto.conjuntoVacio(); //c
	}
	
}
