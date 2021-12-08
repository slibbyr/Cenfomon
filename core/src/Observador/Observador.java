package Observador;

import gestores.GestorPelea;

import java.io.Serializable;

public interface Observador {
	void update(GestorPelea gestorPelea);
}