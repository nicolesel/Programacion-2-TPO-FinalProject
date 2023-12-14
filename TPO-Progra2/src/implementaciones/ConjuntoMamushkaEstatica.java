package implementaciones;

import tdas.ConjuntoMamushkaTDA;

public class ConjuntoMamushkaEstatica implements ConjuntoMamushkaTDA {
	//se puede hacer asi ocon diccionario simple
	private int[] array;
	private int cant;
	
	@Override
	public void inicializar() {//-> c
		array = new int[100];//c
		cant = 0;//c
		//c+c=c
	}

	@Override
	public void guardar(int dato) {//-> c
		array[cant]=dato;//c
		cant++;//c
		//c+c=c
	}

	@Override
	public void sacar(int dato) {//->l
		int i = 0; //c
		while(i < cant && array[i] != dato) //c
			i++; //c
		//c+c=c -> l
		if(i < cant) { //c
			array[i] = array[cant-1]; //c
			cant --; //c
		}//c+c+c=c
		//c+l+c=l
	}

	@Override
	public int elegir() {//-> c
		return array[0]; //c
	}

	@Override
	public int perteceCant(int dato) {//-> l 
		int cont=0; //c
		for(int i=0;i<cant;i++) {//c
			if(array[i]==dato) {//c
				cont++;//c
			}
		}//c+c+c=c -> l
		return cont;
	}

	@Override
	public boolean estaVacio() {//->c
		return cant==0;//c
	}

}
