package com.cenfomon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import gestores.GestorMetodoFabrica;
import objects.cenfomon.Cenfomon;
import utilities.ETipoCenfomon;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	public static void main(String[] args) {
		GestorMetodoFabrica metodoFabrica =new GestorMetodoFabrica();
		Cenfomon cenfomon =  metodoFabrica.nuevocenfomon(ETipoCenfomon.VOLADOR);
		System.out.println(cenfomon.get_Nombre());
	}
}
