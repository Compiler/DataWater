package com.graphs.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class Mapper {
	
	
	private Sprite combine[];
	private Sprite map;
	private Vector2 position, dimensions;
	public Mapper(float x, float y, float width, float height){
		position = new Vector2(x, y); dimensions = new Vector2(width, height);
		map = new Sprite(new Texture(Gdx.files.internal("pic/emptyNJ.png")));
		map.setSize(dimensions.x, dimensions.y);
		map.setPosition(position.x, position.y);
		combine = new Sprite[20];
		init();

		for(int i = 0; i < combine.length; i++){
			combine[i].setPosition(position.x, position.y);
			combine[i].setSize(dimensions.x, dimensions.y);
		}
		
	}

	
	public void render(SpriteBatch batch, OrthographicCamera cam){
		map.draw(batch);
		/*Vector3 mousePos = new Vector3(Gdx.input.getX(), Gdx.input.getY(), -1);
		mouse.setPosition(cam.unproject(mousePos).x, cam.unproject(mousePos).y);
		for(int i = 0 ; i< combine.length; i++){
			if(mouse.overlaps(combine[i].getBoundingRectangle())){
				combine[i].draw(batch);
			}
		}
		System.out.println("("+mouse.getX() + ", " + mouse.getY() + ")");
		*/
		float something = Gdx.graphics.getHeight() ;
		if(Core.info.equals("atlantic")){
			combine[0].draw(batch);
			float width = Gdx.graphics.getWidth();
			float height = Gdx.graphics.getHeight();
			batch.draw(new Texture(Gdx.files.internal("cm/AtlanticBurglaryMVT.png")),
					width / 16, height - (height / 3)*(1), width / 3, Gdx.graphics.getHeight() / 4);
			batch.draw(new Texture(Gdx.files.internal("cm/AtlanticMurderRape.png")),
					width / 16, height - (height / 3)*(2), width / 3, Gdx.graphics.getHeight() / 4);
			batch.draw(new Texture(Gdx.files.internal("cm/AtlanticViolentNonViolent.png")),
					width / 16, height - (height / 3)*(3), width / 3, Gdx.graphics.getHeight() / 4);
			
		}
		if(Core.info.equals("bergen")){
			combine[1].draw(batch);
			float width = Gdx.graphics.getWidth();
			float height = Gdx.graphics.getHeight();
			batch.draw(new Texture(Gdx.files.internal("cm/BergenBurglaryMVT.png")),
					width / 16, height - (height / 3.1f)*(1), width / 3, Gdx.graphics.getHeight() / 4);
			batch.draw(new Texture(Gdx.files.internal("cm/BergenMurderRape.png")),
					width / 16, height - (height / 3.1f)*(2), width / 3, Gdx.graphics.getHeight() / 4);
			batch.draw(new Texture(Gdx.files.internal("cm/BergenViolentNonViolent.png")),
					width / 16, height - (height / 3.1f)*(3), width / 3, Gdx.graphics.getHeight() / 4);
			
		}
		if(Core.info.equals("burlington")){
			combine[2].draw(batch);
			float width = Gdx.graphics.getWidth();
			float height = Gdx.graphics.getHeight();
			batch.draw(new Texture(Gdx.files.internal("cm/BurlingtonBurglaryMVT.png")),
					width / 16, height - (height / 3.1f)*(1), width / 3, Gdx.graphics.getHeight() / 4);
			batch.draw(new Texture(Gdx.files.internal("cm/BurlingtonMurderRape.png")),
					width / 16, height - (height / 3.1f)*(2), width / 3, Gdx.graphics.getHeight() / 4);
			batch.draw(new Texture(Gdx.files.internal("cm/BurlingtonViolentNonViolent.png")),
					width / 16, height - (height / 3.1f)*(3), width / 3, Gdx.graphics.getHeight() / 4);
			
		}
		if(Core.info.equals("camden")){
			combine[3].draw(batch);
			float width = Gdx.graphics.getWidth();
			float height = Gdx.graphics.getHeight();
			batch.draw(new Texture(Gdx.files.internal("cm/CamdenBurglaryMVT.png")),
					width / 16, height - (height / 3.1f)*(1), width / 3, Gdx.graphics.getHeight() / 4);
			batch.draw(new Texture(Gdx.files.internal("cm/CamdenMurderRape.png")),
					width / 16, height - (height / 3.1f)*(2), width / 3, Gdx.graphics.getHeight() / 4);
			batch.draw(new Texture(Gdx.files.internal("cm/CamdenViolentNonViolent.png")),
					width / 16, height - (height / 3.1f)*(3), width / 3, Gdx.graphics.getHeight() / 4);
			
		}
		
	}
	
	
	public void renderSubs(float xpos, float ypos, float wid, float hei){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void init(){
		combine[0] = new Sprite(new Texture(Gdx.files.internal("pic/atlantic.png")));combine[1] = new Sprite(new Texture(Gdx.files.internal("pic/bergen.png")));
		combine[2] = new Sprite(new Texture(Gdx.files.internal("pic/burlington.png")));combine[3] = new Sprite(new Texture(Gdx.files.internal("pic/camden.png")));
		combine[4] = new Sprite(new Texture(Gdx.files.internal("pic/cumberland.png")));combine[5] = new Sprite(new Texture(Gdx.files.internal("pic/essex.png")));
		combine[6] = new Sprite(new Texture(Gdx.files.internal("pic/gloucester.png")));combine[7] = new Sprite(new Texture(Gdx.files.internal("pic/hudson.png")));
		combine[8] = new Sprite(new Texture(Gdx.files.internal("pic/hunterdon.png")));combine[9] = new Sprite(new Texture(Gdx.files.internal("pic/mercer.png")));
		combine[10] = new Sprite(new Texture(Gdx.files.internal("pic/middlesex.png")));combine[11] = new Sprite(new Texture(Gdx.files.internal("pic/monmouth.png")));
		combine[12] = new Sprite(new Texture(Gdx.files.internal("pic/morris.png")));combine[13] = new Sprite(new Texture(Gdx.files.internal("pic/ocean.png")));
		combine[14] = new Sprite(new Texture(Gdx.files.internal("pic/passaic.png")));combine[15] = new Sprite(new Texture(Gdx.files.internal("pic/salem.png")));
		combine[16] = new Sprite(new Texture(Gdx.files.internal("pic/somerset.png")));combine[17] = new Sprite(new Texture(Gdx.files.internal("pic/sussex.png")));
		combine[18] = new Sprite(new Texture(Gdx.files.internal("pic/union.png")));combine[19] = new Sprite(new Texture(Gdx.files.internal("pic/warren.png")));
	
	
	}
	
	
	
}
