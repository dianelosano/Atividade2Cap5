package br.com.projetoGulliverTraveller.collections;

import br.com.projetoGulliverTraveller.beans.Cliente;
import java.util.ArrayList;


public class ArrayListCliente {

	public static void main(String[] args) {

		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		for (int i = 1; i < 5; i++) {
		
		//add - construtor por id, nome e sobrenome
		listaCliente.add(new Cliente(i++, "João",    "Souza", "10120230304"  ));
		listaCliente.add(new Cliente(i++, "Janete",  "Loures", "10120230305"  ));
		listaCliente.add(new Cliente(i++, "Juana",   "Mendes", "10120230306"  ));
		listaCliente.add(new Cliente(i++, "Claudio", "dos Santos", "10120230307" ));
		listaCliente.add(new Cliente(i++, "Cesar", "Coelho", "10120230308" ));
		
		}
		
		//chamada toString
		for (Cliente Cliente:listaCliente) {
		System.out.println(Cliente);
		}	

	}

	}
