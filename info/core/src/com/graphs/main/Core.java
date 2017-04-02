package com.graphs.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Core extends ApplicationAdapter {

	private SpriteBatch batch;
	private ShapeRenderer render;
	
	private OrthographicCamera cam;
	private BitmapFont font;
	private GlyphLayout done;
	public static String info = "Type here";
	
	
	Mapper map;
	@Override
	public void create () {
		
		cam = new OrthographicCamera();
		cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	
		batch = new SpriteBatch();
		batch.setProjectionMatrix(cam.combined);
		
		render = new ShapeRenderer();
		render.setProjectionMatrix(cam.combined);
		render.setAutoShapeType(true);
		
		font = new BitmapFont();
		done = new GlyphLayout(font, info);
		
		
		map = new Mapper(Gdx.graphics.getWidth() * 3.f/5.f, Gdx.graphics.getHeight() * 1.f / 8.5f,
				Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() / 1.25f);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(Gdx.input.isKeyJustPressed(Keys.A))info+="a";if(Gdx.input.isKeyJustPressed(Keys.B))info+="b";if(Gdx.input.isKeyJustPressed(Keys.C))info+="c";
		if(Gdx.input.isKeyJustPressed(Keys.D))info+="d";if(Gdx.input.isKeyJustPressed(Keys.E))info+="e";if(Gdx.input.isKeyJustPressed(Keys.F))info+="f";
		if(Gdx.input.isKeyJustPressed(Keys.G))info+="g";if(Gdx.input.isKeyJustPressed(Keys.H))info+="h";if(Gdx.input.isKeyJustPressed(Keys.I))info+="i";
		if(Gdx.input.isKeyJustPressed(Keys.J))info+="j";if(Gdx.input.isKeyJustPressed(Keys.K))info+="k";if(Gdx.input.isKeyJustPressed(Keys.L))info+="l";
		if(Gdx.input.isKeyJustPressed(Keys.M))info+="m";if(Gdx.input.isKeyJustPressed(Keys.N))info+="n";if(Gdx.input.isKeyJustPressed(Keys.O))info+="o";
		if(Gdx.input.isKeyJustPressed(Keys.P))info+="p";if(Gdx.input.isKeyJustPressed(Keys.Q))info+="q";if(Gdx.input.isKeyJustPressed(Keys.R))info+="r";
		if(Gdx.input.isKeyJustPressed(Keys.S))info+="s";if(Gdx.input.isKeyJustPressed(Keys.T))info+="t";if(Gdx.input.isKeyJustPressed(Keys.U))info+="u";
		if(Gdx.input.isKeyJustPressed(Keys.V))info+="v";if(Gdx.input.isKeyJustPressed(Keys.W))info+="w";if(Gdx.input.isKeyJustPressed(Keys.X))info+="x";
		if(Gdx.input.isKeyJustPressed(Keys.Y))info+="y";if(Gdx.input.isKeyJustPressed(Keys.Z))info+="z";if(Gdx.input.isKeyPressed(Keys.BACKSPACE) && info.length() > 0)
			info = info.substring(0, info.length() - 1);
		
		
		render.begin();
		float width = Gdx.graphics.getWidth();
		float height = Gdx.graphics.getHeight();
		render.end();
		
		
		batch.begin();
		map.render(batch, cam);
		font.draw(batch, info, width / 2, height - 10);
		batch.end();
	
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
