package implementaciones;

import imple.Conjunto;
import tda.ConjuntoTDA;
import tdas.DiccionarioSimpleModTDA;

public class DiccionarioSimpleModEstatica implements DiccionarioSimpleModTDA {
	private class Elemento{
		int clave;
		int valor;
		int mod;
	}
	
	private Elemento[] elementos;
	private int cant;
	
	@Override
	public void inicializar() {//-> c
		elementos= new Elemento[100];//c
		cant=0;//c
		//c+c=c
	}
	
	@Override
	public void agregar(int clave, int valor) {//->l
		int pos=clave2indice(clave);//l
		if(pos==-1) {//c
			Elemento e= new Elemento();//c
			e.clave=clave;//c
			e.valor=valor;//c
			e.mod=0;//c
			elementos[cant]=e;//c
			cant++;//c
		}//c+c+c+c+c+c+c=c
		else {
			elementos[pos].mod++;//c
			elementos[pos].valor=valor;//c
		}//c+c=c
		//l+c+c=l
	}
	
	private int clave2indice(int clave) {//-> l
		int pos=cant-1;//c
		while(pos >=0 && elementos[pos].clave!=clave) { //c
			pos--;//c
		}//c+c=c -> l
		return pos;
		//c+l=l
		
		/*
		 * private int getIndex(int clave) { //l
				int pos=-1; //c
				for(int i=0;i<cont;i++){  //l
					if(elementos[i].clave==clave) { //c
						pos=i; //c
					}
				}
				return pos; //c
			}
		 */
	}
	
	@Override
	public void eliminar(int clave) {//-> l
		int pos= clave2indice(clave);//l
		if(pos!=-1) {//c
			elementos[pos]=elementos[cant-1];//c
			cant--;//c
		}//c+c+c=c
		//l+c=l
	}
	@Override
	public int recuperar(int clave) {//-> l
		int pos= clave2indice(clave);//l
		return elementos[pos].valor;//c
		//l+c=l
	}
	@Override
	public int recuperarMod(int clave) {//-> l
		int pos= clave2indice(clave);//l
		return elementos[pos].mod;//c
		//l+c=l
	}
	@Override
	public ConjuntoTDA claves() {//-> p
		ConjuntoTDA c= new Conjunto();//c
		c.inicializarConjunto();//c
		for(int i=0;i<cant;i++) {//c
			c.agregar(elementos[i].clave);//l
		}//n*(c+l)= p
		return c;
		//c+c+p= p
	}
}
