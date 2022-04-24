package br.com.projetoGulliverTraveller.collections;

import br.com.projetoGulliverTraveller.beans.Destino;
import java.util.ArrayList;



public class ArrayListDestino {

	public static void main(String[] args) {

		ArrayList<Destino> listaDestino = new ArrayList<Destino>();
		for (int i = 1; i < 6; i++) {
		
		//add - construtor por id, nome e sobrenome
		listaDestino.add(new Destino(i++, "Maldivas"  ));
		listaDestino.add(new Destino(i++, "Osasco"  ));
		listaDestino.add(new Destino(i++, "China"  ));
		listaDestino.add(new Destino(i++, "Vinhedo" ));
		listaDestino.add(new Destino(i++, "França" ));
		listaDestino.add(new Destino(i++, "Carapicuiba" ));
		
		}
		
		//chamada toString
		for (Destino Destino:listaDestino) {
		System.out.println(Destino);
		}	
	}

}
