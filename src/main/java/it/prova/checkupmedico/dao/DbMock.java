package it.prova.checkupmedico.dao;

import java.util.ArrayList;
import java.util.List;

import it.prova.checkupmedico.model.Paziente;
import it.prova.checkupmedico.model.StatoPaziente;


public class DbMock {
	
	public static final List<Paziente> pazienti = new ArrayList<Paziente>();
	
	static {
		Paziente paziente1 = new Paziente(1L,"piermauro", "nesi", "prmrns4545", 46, StatoPaziente.IN_ATTESA);
		Paziente paziente2 = new Paziente(2L,"rocco", "sblocco", "rccsbl1234", 36, StatoPaziente.IN_ATTESA);
		Paziente paziente3 = new Paziente(3L,"albina", "rosita", "lbrst1545", 57, StatoPaziente.IN_ATTESA);
		Paziente paziente4 = new Paziente(4L,"rosa", "reiss", "prmrns41545", 22, StatoPaziente.IN_ATTESA);
		
		pazienti.add(paziente1);
		pazienti.add(paziente2);
		pazienti.add(paziente3);
		pazienti.add(paziente4);
	}

}
