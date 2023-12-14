package implementaciones;

import imple.Pila;
import tda.PilaTDA;
import tdas.MultiPilaTDA;

public class MultiPilaDinamica implements MultiPilaTDA {

	private class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo primero;
	

	@Override
	public void inicializar() {//-> c
		primero=null; //c
		
	}

	@Override
	public void apilar(PilaTDA pila) {//-> l
		PilaTDA aux= new Pila();//c
		aux.inicializarPila(); //c
		PilaTDA pilaCopia= copiar(pila); //l
		while(!pilaCopia.pilaVacia()) {//c
			aux.apilar(pilaCopia.tope());//c
			pilaCopia.desapilar();//c
		}//c+c+c=c -> l
		while(!aux.pilaVacia()) {//c
			Nodo nodo= new Nodo();//c
			nodo.info= aux.tope();//c
			nodo.sig= primero;//c
			primero= nodo;//c
			aux.desapilar();//c
		}//c+c+c+c+c+c=c -> l
		//c+c+l+l+l= l
	}

	private PilaTDA copiar(PilaTDA pila) {//-> l
		PilaTDA pilaC= new Pila(); //c
		pilaC.inicializarPila();//c
		PilaTDA aux= new Pila();//c
		aux.inicializarPila();//c
		while(!pila.pilaVacia()) {//c
			aux.apilar(pila.tope());//c
			pila.desapilar();//c
		}//c+c+c=c ->l
		while(!aux.pilaVacia()) { //c
			pilaC.apilar(aux.tope());//c
			pila.apilar(aux.tope());//c
			aux.desapilar();//c
		}//c+c+c+c=c -> l
		return pilaC;
		//c+c+c+c+l+l=l
	}


	@Override
	public void desapilar(PilaTDA pila) {//-> l
		PilaTDA pilaC= copiar(pila); //l
		if(comparar(pilaC)) { //l
			while(!pilaC.pilaVacia()) {//c
				pilaC.desapilar();//c
				primero=primero.sig;//c
			} //c+c+c=c -> l
		}//l+l=l
		//l+l=l
	}

	private boolean comparar(PilaTDA pila) {//-> l 
		PilaTDA pilaC1= copiar(pila);//l
		PilaTDA pilaC2= copiar(pila);//l
		int cont=0;//c
		while(!pilaC1.pilaVacia()) {//c
			cont++;//c
			pilaC1.desapilar();//c
		}//c+c+c= c -> l
		PilaTDA nuestro= tope(cont);//l
		while(!nuestro.pilaVacia() && pilaC2.tope()==nuestro.tope()) { //c //nuestro puede ser mas chico que pilaC2
			pilaC2.desapilar();//c
			nuestro.desapilar();//c
		}//c+c+c= c -> l
		return pilaC2.pilaVacia();//c //pilaC2 esta vacia si ambas pilas son iguales, sino quiere decir que no
		//l+l+c+l+l+l+c=l ->l
	}


	@Override
	public PilaTDA tope(int cant) {//-> l
		PilaTDA pila= new Pila(); //c
		pila.inicializarPila();//c
		PilaTDA aux= new Pila();//c
		aux.inicializarPila();//c
		int cont=0;//c
		while(!pilaVacia() && cont!=cant) {//c
			cont++;//c
			aux.apilar(primero.info);//c
			primero= primero.sig;//c
		}//c+c+c+c=c -> l
		while(!aux.pilaVacia()) {//c
			pila.apilar(aux.tope());//c
			aux.desapilar();//c
		}//c+c+c= c -> l
		apilar(pila);//l
		return pila;
		//c+c+c+c+c+l+l+l= l -> l
	}

	@Override
	public boolean pilaVacia() {//-> c
		return primero==null;//c
	}
	
	public void print() { //elimina la pila
		while(!pilaVacia()) {
			System.out.print(primero.info);
			primero=primero.sig; 
		}
		System.out.println();
	}

}