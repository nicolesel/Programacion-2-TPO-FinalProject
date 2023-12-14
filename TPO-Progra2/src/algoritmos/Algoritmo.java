package algoritmos;

import imple.Cola;
import imple.Conjunto;
import imple.DiccionarioSimple;
import imple.Pila;
import tda.ABBTDA;
import tda.ColaTDA;
import tda.ConjuntoTDA;
import tda.DiccionarioMultipleTDA;
import tda.DiccionarioSimpleTDA;
import tda.GrafoTDA;
import tda.GrafoTDA;
import tda.PilaTDA;

public class Algoritmo {
	
	//6

	public float porcentajeParesPila(PilaTDA pila) {//-> l
		PilaTDA pilaC= copiarPila(pila);//l
		float cant=0;//c
		float cantPares=0;//c
		while(!pilaC.pilaVacia()) {//c
			cant++;//c
			if(pilaC.tope()%2==0) {//c
				cantPares++;//c
			}//c+c=c
			pilaC.desapilar();//c
		}//c+c+c+c=c -> l
		return (cantPares*100/cant);//c
		//l+c+c+l+c=l
	}
	
	
	//7
	
	public ConjuntoTDA repetidosPilaEnConjunto(PilaTDA pila) {//-> p
		ConjuntoTDA c= new Conjunto();//c
		c.inicializarConjunto();//c
		PilaTDA pilaC= copiarPila(pila);//l
		DiccionarioSimpleTDA d= new DiccionarioSimple();//c
		d.inicializarDiccionario();//c
		while(!pilaC.pilaVacia()) {//c
			if(d.claves().pertenece(pilaC.tope())) {//p+l+c=p
				d.agregar(pilaC.tope(), (d.recuperar(pilaC.tope()))+1);//l
			}//p+l=p
			else {
				d.agregar(pilaC.tope(), 1);//l
			}//l
			pilaC.desapilar();//c
		}//n*(c+p+l+c)=p
		ConjuntoTDA claves= d.claves();//p
		while(!claves.conjuntoVacio()) {//c
			int elegido= claves.elegir();//c
			if(d.recuperar(elegido)>1) {//l
				c.agregar(elegido);//l
			}//l+l=l
			claves.sacar(elegido);//l
		}//n*(c+c+l+l)=p
		return c;
		//c+c+l+c+c+p+p+p=p
	}
	
	private PilaTDA copiarPila(PilaTDA pila){//-> l
		PilaTDA pilaC= new Pila(); //c
		pilaC.inicializarPila();//c
		PilaTDA aux= new Pila();//c
		aux.inicializarPila();//c
		while(!pila.pilaVacia()) {//c
			aux.apilar(pila.tope());//c
			pila.desapilar();//c
		}//c+c+c=c -> l
		while(!aux.pilaVacia()) {//c
			pilaC.apilar(aux.tope());//c
			pila.apilar(aux.tope());//c
			aux.desapilar();//c
		}//c+c+c+c=c -> l
		return pilaC;
		//c+c+c+c+l+l=l
	}
	
	//8
	
	public ColaTDA colaSinRepetidos(ColaTDA cola) {//-> p
		ColaTDA nueva= new Cola();//c
		nueva.inicializarCola();//c
		ColaTDA colaC= copiarCola(cola);//p
		ColaTDA colaC2= copiarCola(cola);//p
		ConjuntoTDA c= new Conjunto();//c
		c.inicializarConjunto();//c
		while(!colaC.colaVacia()) {//c
			c.agregar(colaC.primero());//l
			colaC.desacolar();//c
		}//n*(c+l+c)=p
		while(!colaC2.colaVacia()){//c
			if(c.pertenece(colaC2.primero())) {//l
				nueva.acolar(colaC2.primero());//l
				c.sacar(colaC2.primero());//l
			}//l+l+l=l
			colaC2.desacolar();//c
		}//n*(c+l+l)=p
		return nueva;
		//c+c+p+p+c+c+p+p=p
	}


	private ColaTDA copiarCola(ColaTDA cola) {//-> p
		ColaTDA colaC= new Cola();//c
		colaC.inicializarCola();//c
		ColaTDA aux= new Cola();//c
		aux.inicializarCola();//c
		while(!cola.colaVacia()) {//c
			colaC.acolar(cola.primero());//l
			aux.acolar(cola.primero());//l
			cola.desacolar();//c
		}//c+l+l+l=l -> p
		while(!aux.colaVacia()) {//c
			cola.acolar(aux.primero());//l
			aux.desacolar();//c
		}//c+l+c=l -> p
		return colaC;
		//c+c+c+c+p+p=p
	}
	
	//9
	
	public ConjuntoTDA unirPilaCola(PilaTDA pila, ColaTDA cola) {//-> p
		PilaTDA pilaC= copiarPila(pila);//l
		ColaTDA colaC= copiarCola(cola);//p
		ConjuntoTDA cFinal= new Conjunto();//c
		ConjuntoTDA cc= new Conjunto();//c
		ConjuntoTDA cp= new Conjunto();//c
		cFinal.inicializarConjunto();//c
		cc.inicializarConjunto();//c
		cp.inicializarConjunto();//c
		while(!pilaC.pilaVacia()){//c
			cp.agregar(pilaC.tope());//l
			pilaC.desapilar();//c
		}//n*(c+l+c)=p
		while(!colaC.colaVacia()) {//c
			cc.agregar(colaC.primero());//l
			colaC.desacolar();//c
		}//n*(c+l+c)=p
		while(!cp.conjuntoVacio()) {//c
			int elegido= cp.elegir();//c
			if(cc.pertenece(elegido)) {//l
				cFinal.agregar(elegido);//l
			}//l+l=l
			cp.sacar(elegido);//l
		}//n*(c+c+l+l)=p
		return cFinal;
		//l+p+c+c+c+c+c+c+p+p+p=p
	}
	
	//10
	
	public DiccionarioSimpleTDA repetidosPilaEnDiccionario(PilaTDA pila) {//-> p
		PilaTDA pilaC= copiarPila(pila);//l
		DiccionarioSimpleTDA d= new DiccionarioSimple();//c
		d.inicializarDiccionario();//c
		while(!pilaC.pilaVacia()) {//c
			if(d.claves().pertenece(pilaC.tope())) {//p+l+c=p
				d.agregar(pilaC.tope(), (d.recuperar(pilaC.tope()))+1);//l+c+l=l
			}//p+l=p
			else {
				d.agregar(pilaC.tope(), 1);//l
			}//l
			pilaC.desapilar();//c
		}//n*(c+p+l+c)=p
		return d;
		//l+c+c+p=p
	}
	
	//11
	
	public ColaTDA valoresDicACola(DiccionarioMultipleTDA dic) {//-> p
		ColaTDA cola= new Cola();//c
		cola.inicializarCola();//c
		ConjuntoTDA con= new Conjunto();//c
		con.inicializarConjunto();//c
		ConjuntoTDA claves= dic.claves();//p
		while(!claves.conjuntoVacio()) {//c
			int elegido= claves.elegir();//c
			ConjuntoTDA valores= dic.recuperar(elegido);//l
			while(!valores.conjuntoVacio()) {//c
				int elegidoValor= valores.elegir();//c
				con.agregar(elegidoValor);//l
				valores.sacar(elegidoValor);//l
			}//n*(c+c+l+l)=p
			claves.sacar(elegido);//l
		}//n*(c+c+l+p+l)=p
		while(!con.conjuntoVacio()) {//c
			int elegido= con.elegir();//c
			cola.acolar(elegido);//l
			con.sacar(elegido);//l
		}//n*(c+c+l+l)=p
		return cola;
		//c+c+c+c+p+p+p=p
	}
	
	//12
	
	public int sumarImparesABB (ABBTDA arbol) {
		if(arbol.arbolVacio()) {//c
			return 0;//c
		}//c
		else {
			int raiz=0;//c
			if(arbol.raiz()%2!=0) {//c
				raiz= arbol.raiz();//c
			}//c+c=c
			return raiz + sumarImparesABB(arbol.hijoDer()) + sumarImparesABB(arbol.hijoIzq()); //l
		}
	}
	
	//13
	
	public int cantHojasParABB (ABBTDA arbol) {
		if(arbol.arbolVacio()) {
			return 0;
		}
		else {
			int va=0;
			if(arbol.raiz()%2==0 && arbol.hijoDer().arbolVacio() && arbol.hijoIzq().arbolVacio()) {
				va=1;
			}
			return va + cantHojasParABB(arbol.hijoDer()) + cantHojasParABB(arbol.hijoIzq()); 
		}
	}
	
	//14
	
	public ConjuntoTDA conjuntoPuenteGrafo (GrafoTDA g, int v1,int v2) {//-> p
		ConjuntoTDA con= new Conjunto();//c
		con.inicializarConjunto();//c
		ConjuntoTDA vertices = g.vertices();//p
		ConjuntoTDA vertices2 = g.vertices();//p
		if((vertices.pertenece(v1)== false) || (vertices.pertenece(v2)== false)) {//l+l=l
			return con;//c
		}//l+c=l
		while(!vertices.conjuntoVacio()) {//c
			int v = vertices.elegir();//c
			if(v == v1) {//c
				while(!vertices2.conjuntoVacio()) {//c
					int p= vertices2.elegir();//c
					if(g.existeArista(v1, p) && g.existeArista(p, v2)) {//l+l=l
						con.agregar(p);//l
					}//l+l=l
					vertices2.sacar(p);//l
				}//n*(c+c+l+l)=p
			}//c+p=p
			vertices.sacar(v);//l
		}//n*(c+c+p+l)=p
		return con;
		//c+c+p+p+l+p=p
	}
	
	//15
	
	public int gradoVerticeGrafo (GrafoTDA g, int v) {//-> p
		ConjuntoTDA vertices = g.vertices();//p
		ConjuntoTDA vertices2 = g.vertices();//p
		int suma=0;//c
		/*if((vertices.pertenece(v) == false)) {   no hace falta pq va a devolver 0 igual
			return 0;
		}*/
		while(!vertices.conjuntoVacio()) {//c
			int vertice = vertices.elegir();//c
			if(vertice == v) {//c
				while(!vertices2.conjuntoVacio()) {//c
					int pegado= vertices2.elegir();//c
					if(g.existeArista(vertice, pegado)) {//l
						suma++;//c
					}//l+c=l
					else if(g.existeArista(pegado, vertice)) {//l
						suma--;//c
					}//l+c=l
					vertices2.sacar(pegado);//l
				}//n*(c+c+l+l+l)=p
			}//c+p=p
			vertices.sacar(vertice);//l
		}//n*(c+c+p+l)=p
		return suma;
		//p+p+p=p
	}
	
}
