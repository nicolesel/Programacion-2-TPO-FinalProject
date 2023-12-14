package implementaciones;

import imple.ColaPrioridad;
import imple.Conjunto;
import tda.ColaPrioridadTDA;
import tda.ConjuntoTDA;
import tdas.DiccionarioSimpleTDA;

public class DiccionarioSimpleEstatica implements DiccionarioSimpleTDA {
	
	private ColaPrioridadTDA cola;

	@Override
	public void inicializar() {//-> c
		cola = new ColaPrioridad();//c
		cola.inicializarCola();//c
		//c+c=c
	}

	@Override
	public void agregar(int clave, int valor) {//-> l
		cola.acolarPrioridad(clave, valor);//l
	}

	@Override
	public void eliminar(int clave) {//-> p
		ColaPrioridadTDA cola2= new ColaPrioridad();//c
		cola2.inicializarCola();//c
		while(!cola.colaVacia() && cola.primero()!=clave) {//c
			cola2.acolarPrioridad(cola.primero(), cola.prioridad());//l
			cola.desacolar();//c
		}//n*(c+l+c)= p
		cola.desacolar();//c
		while(!cola2.colaVacia()) { //c
			cola.acolarPrioridad(cola2.primero(), cola2.prioridad());//l
			cola2.desacolar();//c
		}//n*(c+l+c)= p
		//c+c+p+c+p=p
	}

	@Override
	public int recuperar(int clave) {//-> p
		ColaPrioridadTDA cola2= new ColaPrioridad();//c
		cola2.inicializarCola();//c
		while(!cola.colaVacia() && cola.primero()!=clave) {//c
			cola2.acolarPrioridad(cola.primero(), cola.prioridad());//l
			cola.desacolar();//c
		}//n*(c+l+c)=p
		int valor = cola.prioridad();//c
		while(!cola2.colaVacia()) {//c
			cola.acolarPrioridad(cola2.primero(), cola2.prioridad());//l
			cola2.desacolar();//c
		}//n*(c+l+c)=p
		return valor;
		//c+c+p+c+p=p
	}

	@Override
	public ConjuntoTDA claves() {//-> p
		ConjuntoTDA c= new Conjunto();//c
		c.inicializarConjunto();//c
		ColaPrioridadTDA cola2= new ColaPrioridad();//c
		cola2.inicializarCola();//c
		while(!cola.colaVacia()) {//c
			c.agregar(cola.primero());//l
			cola2.acolarPrioridad(cola.primero(), cola.prioridad());//l
			cola.desacolar();//C
		}//n*(c+l+l+c)=p
		while(!cola2.colaVacia()) {//c
			cola.acolarPrioridad(cola2.primero(), cola2.prioridad());//l
			cola2.desacolar();//c
		}//n*(c+l+c)=p
		return c;
		//c+c+c+c+p+p=p
	}
	
}
