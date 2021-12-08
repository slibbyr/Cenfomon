package com.cenfomon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import gestores.GestorMetodoFabrica;
import objects.cenfomon.Cenfomon;
import enums.ETipoCenfomon;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    private static GestorMetodoFabrica metodoFabrica = new GestorMetodoFabrica();

    public static void main(String[] args) throws IOException {
        iniciarJuego();


    }

    public static void iniciarJuego() {
        boolean salir = false;
        int opcion = 0;
        System.out.println("Bienvenido al juego Cenfomon, soy la profesora Fonseca");
        System.out.println("Por favor elija el tipo de Cenfomon que desearia elegir:" + "\n" + " Digite 1 para  tipo Agua" + "\n" + "2 para tipo fuego," + "\n" + "3 para tipo planta");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(metodoFabrica.nuevocenfomon(ETipoCenfomon.AGUA).get_Nombre());
                break;
            case 2:
                System.out.println(metodoFabrica.nuevocenfomon(ETipoCenfomon.FUEGO).get_Nombre());
                break;
            case 3:
                System.out.println(metodoFabrica.nuevocenfomon(ETipoCenfomon.PLANTA).get_Nombre());

                break;
            default:
                System.out.println("Por favor digite una opcion valida");
                break;
        }
    }

    public static void menuJuego() {
        boolean continuar = true;

        int opcionMenuJuego = 0;

        do {
            System.out.println("Estas son las opciones de juego que podes escoger :" + "\n" + "Selecciona 1 para capturar un Cenfomon salvaje" + "\n" + "2 para pelearte contra un miembro del escuadron magenta" + "\n" + "3 para ir a la tienda de items" + "\n" + "4 para salir");
            opcionMenuJuego = entrada.nextInt();
            switch (opcionMenuJuego){
                case 1:
                    
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    continuar=false;
                    break;
            }


        } while (continuar);

    }

}

