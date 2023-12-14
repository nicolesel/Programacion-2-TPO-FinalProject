package test;

import algoritmos.Algoritmo;
import imple.Grafo;
import tda.ConjuntoTDA;
import tda.GrafoTDA;

public class Test {
	public static void main(String[] args) {
		
		/*15
		 * 
		 * Algoritmo a = new Algoritmo();
		GrafoTDA grafo = new Grafo();
		grafo.inicializarGrafo();
		grafo.agregarVertice(6);
		grafo.agregarVertice(7);
		grafo.agregarVertice(8);
		grafo.agregarVertice(9);
		grafo.agregarVertice(5);
		grafo.agregarArista(6, 7, 2);
		grafo.agregarArista(7, 8, 1);
		//grafo.agregarArista(8, 6, 3);
		grafo.agregarArista(8, 9, 9);
		grafo.agregarArista(9, 6, 7);
		grafo.agregarArista(6, 5, 45);
		grafo.agregarArista(5, 8, 98);
		int suma= a.gradoVerticeGrafo(grafo, 8);
		System.out.println(suma);*/
		
		/*14
		 * 
		 * Algoritmo a = new Algoritmo();
		GrafoTDA grafo = new Grafo();
		grafo.inicializarGrafo();
		grafo.agregarVertice(6);
		grafo.agregarVertice(7);
		grafo.agregarVertice(8);
		grafo.agregarVertice(9);
		grafo.agregarVertice(5);
		grafo.agregarArista(6, 7, 2);
		grafo.agregarArista(7, 8, 1);
		grafo.agregarArista(8, 6, 3);
		grafo.agregarArista(8, 9, 9);
		grafo.agregarArista(9, 6, 7);
		grafo.agregarArista(6, 5, 45);
		grafo.agregarArista(5, 8, 98);
		ConjuntoTDA puentes = a.conjuntoPuenteGrafo(grafo, 6, 8);
		while(!puentes.conjuntoVacio()) {
			int num = puentes.elegir();
			System.out.println(num);
			puentes.sacar(num);
		}*/
		
		/*13
		 * 
		 * Algoritmo a = new Algoritmo();
		ABBTDA arbol= new ABB();
		arbol.inicializarArbol();
		arbol.agregarElem(6);
		arbol.agregarElem(11);
		arbol.agregarElem(9);
		arbol.agregarElem(4);
		arbol.agregarElem(8);
		int cantPares= a.cantHojasParABB(arbol);
		System.out.println(cantPares);*/
			
			/*
			 * 
			 *   6 
			 * 4   11
			 *    9
			 *   8  
			 *   
			 * 
			 */
		
		
		/*12
		 * 
		 * Algoritmo a = new Algoritmo();
		ABBTDA arbol= new ABB();
		arbol.inicializarArbol();
		arbol.agregarElem(6);
		arbol.agregarElem(11);
		arbol.agregarElem(9);
		arbol.agregarElem(4);
		int suma= a.sumarImparesABB(arbol);
		System.out.println(suma);*/
		
		
		/*11
		 * 
		 * Algoritmo a = new Algoritmo();
		DiccionarioMultipleTDA dic= new DiccionarioMultiple();
		dic.inicializarDiccionario();
		dic.agregar(1, 1);
		dic.agregar(1, 10);
		dic.agregar(1, 100);
		dic.agregar(2, 2);
		dic.agregar(2, 20);
		dic.agregar(3, 3);
		dic.agregar(3, 1);
		ColaTDA cola= a.valoresDicACola(dic);
		while(!cola.colaVacia()) {
			System.out.println(cola.primero());
			cola.desacolar();
		}*/
		
		
		/*10
		 * 
		 * Algoritmo a = new Algoritmo();
		PilaTDA p= new Pila();
		p.inicializarPila();
		p.apilar(3);
		p.apilar(1);
		p.apilar(1);
		p.apilar(1);
		p.apilar(4);
		p.apilar(3);
		DiccionarioSimpleTDA d= a.repetidosPilaEnDiccionario(p);
		ConjuntoTDA con= d.claves();
		while(!con.conjuntoVacio()) {
			int elegido= con.elegir();
			System.out.println(elegido+" - "+ d.recuperar(elegido)+" veces");
			con.sacar(elegido);
		}*/
			
		
		/*9
		 * 
		 * Algoritmo a = new Algoritmo();
		ColaTDA c= new Cola();
		c.inicializarCola();
		c.acolar(1);
		c.acolar(0);
		PilaTDA p= new Pila();
		p.inicializarPila();
		p.apilar(3);
		p.apilar(1);
		p.apilar(4);
		ConjuntoTDA con= a.unirPilaCola(p, c);
		while(!con.conjuntoVacio()) {
			int elegido= con.elegir();
			System.out.println(elegido);
			con.sacar(elegido);
		}*/
		
		/*8
		 * 
		 * Algoritmo a = new Algoritmo();
		ColaTDA c= new Cola();
		c.inicializarCola();
		c.acolar(3);
		c.acolar(2);
		c.acolar(1);
		c.acolar(2);
		c.acolar(1);
		c.acolar(0);
		c.acolar(0);
		ColaTDA c2= a.colaSinRepetidos(c);
		while(!c2.colaVacia()) {
			System.out.println(c2.primero());
			c2.desacolar();
		}*/
		
		/*7
		 * 
		 * Algoritmo a = new Algoritmo();
		PilaTDA p= new Pila();
		p.inicializarPila();
		p.apilar(1);
		p.apilar(2);
		p.apilar(1);
		p.apilar(4);
		p.apilar(4);
		ConjuntoTDA c= a.repetidosPilaEnConjunto(p);
		while(!c.conjuntoVacio()) {
			int elegido= c.elegir();
			System.out.println(elegido);
			c.sacar(elegido);
		}*/
		
		/*6
		 * 
		 * Algoritmo a = new Algoritmo();
		PilaTDA p= new Pila();
		p.inicializarPila();
		p.apilar(1);
		p.apilar(2);
		p.apilar(1);
		p.apilar(4);
		p.apilar(6);
		System.out.println("El porcentaje de numero pares en la pila es de %"+a.porcentajeParesPila(p));*/
		
		/*5
		 * 
		 * DiccionarioSimpleTDA d= new DiccionarioSimpleEstatica();
		d.inicializar();
		d.agregar(1, 1);
		d.agregar(2, 2);
		d.agregar(3, 30);
		d.agregar(4, 4);
		System.out.println(d.recuperar(3));
		ConjuntoTDA c= d.claves();
		while(!c.conjuntoVacio()) {
			int num= c.elegir();
			System.out.println(num);
			c.sacar(num);
		}*/
		

		/*4
		 * 
		 * DiccionarioSimpleModTDA d= new DiccionarioSimpleModEstatica();
		d.inicializar();
		d.agregar(1, 1);
		d.agregar(2, 2);
		d.agregar(3, 3);
		System.out.println(d.recuperarMod(1));
		d.agregar(1, 11);
		System.out.println(d.recuperarMod(1));
		d.eliminar(0);
		System.out.println(d.recuperar(1));*/
		
		
		/*3
		 * 
		 * MultiPilaTDA mp= new MultiPilaDinamica();
		mp.inicializar();
		PilaTDA p= new Pila();
		p.inicializarPila();
		p.apilar(0);
		p.apilar(1);
		p.apilar(2);
		p.apilar(3);
		mp.apilar(p);
		PilaTDA p1= new Pila();
		p1.inicializarPila();
		p1.apilar(2);
		p1.apilar(3);
		p1.apilar(2);
		p1.apilar(3);
		p1.apilar(2);
		p1.apilar(3);
		mp.desapilar(p1);
		PilaTDA pi=mp.tope(5);
		while(!pi.pilaVacia()) {
			System.out.print(pi.tope());
			pi.desapilar();
		}
		System.out.println();
		mp.print();*/
		
		
		/*2
		 * 
		 * ConjuntoMamushkaTDA c= new ConjuntoMamushkaEstatica();
		c.inicializar();
		c.guardar(0);
		c.guardar(1);
		c.guardar(1);
		System.out.println(c.estaVacio());
		System.out.println(c.elegir());
		System.out.println(c.perteceCant(1));
		System.out.println(c.perteceCant(0));*/
		
		/*1
		 * 
		 * ConjuntoEspecialTDA c= new ConjuntoEspecialEstatica();
		c.inicializarConjunto();
		System.out.println(c.conjuntoVacio());
		Respuesta r1=c.agregar(1);
		System.out.println(r1.error+""+r1.rta);
		Respuesta r2=c.agregar(2);
		System.out.println(r2.error+""+r2.rta);
		Respuesta r3=c.agregar(3);
		System.out.println(r3.error+""+r3.rta);
		
		Respuesta r4=c.sacar(3);
		System.out.println(r4.error+""+r4.rta);
		Respuesta r5=c.sacar(4);
		System.out.println(r5.error+""+r5.rta);
		
		Respuesta r6=c.elegir();
		System.out.println(r6.error+""+r6.rta);
		
		c.sacar(2);
		
		Respuesta r7=c.elegir();
		System.out.println(r7.error+""+r7.rta);
		
		c.sacar(1);
		
		Respuesta r8=c.elegir();
		System.out.println(r8.error+""+r8.rta);
		
		
		System.out.println(c.conjuntoVacio());*/
	}

}
