package Observador;

import gestores.GestorPelea;

public interface Sujeto {
	void addObserver(Observador o);
	void removeObserver(Observador o);
	void notifyObservers(GestorPelea gestorPelea);
}