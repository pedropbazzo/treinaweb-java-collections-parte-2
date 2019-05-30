package br.com.treinaweb.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainHashtable {

	public static void main(String[] args) {
		Hashtable<String, Pessoa> tabelaPessoas = new Hashtable<String, Pessoa>(20, 0.6f);
		tabelaPessoas.put("legal", new Pessoa(1, "TreinaWeb 1"));
		System.out.println(tabelaPessoas);
		tabelaPessoas.put("chato", new Pessoa(2, "TreinaWeb 2"));
		System.out.println(tabelaPessoas);
		System.out.println(tabelaPessoas.get("legal"));
		System.out.println(tabelaPessoas.put("legal", new Pessoa(3, "TreinaWeb 3")));
		System.out.println(tabelaPessoas.get("legal"));
		System.out.println(tabelaPessoas.put("bla", new Pessoa(4, "TreinaWeb 4")));
		// Iteração
		// Fail-Fast Iterator
//		Iterator<String> iteratorChaves = tabelaPessoas.keySet().iterator();
//		tabelaPessoas.remove("legal");
//		while (iteratorChaves.hasNext()) {
//			String chave = iteratorChaves.next();
//			System.out.println(" - " + tabelaPessoas.get(chave).toString());
//		}
		// Non Fail-Fast Iterator
		Enumeration<String> chaves = tabelaPessoas.keys();
		tabelaPessoas.remove("legal");
		while (chaves.hasMoreElements()) {
			String chave = chaves.nextElement();
			System.out.println(" - " + tabelaPessoas.get(chave).toString());
		}
	}

}
