package br.com.projetoGulliverTraveller.collections;

import br.com.projetoGulliverTraveller.beans.Cliente;
import java.util.HashSet;
import java.util.Set;

public class HashsetCliente {

	public static void main(String[] args) {
		
		Set<Cliente> setCliente = new HashSet<Cliente>();
		
		//add
		
		setCliente.add(new Cliente(1, "Maria", "Mendes", "50550550509") );
		setCliente.add(new Cliente(1, "Maria", "Mendes", "50550550509") );

		System.out.println(setCliente);
	}

}
