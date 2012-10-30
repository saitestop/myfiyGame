import com.badlogic.gdx.backends.lwjgl.LwjglApplication;


public class DesktopGame {
	public static void main(String [] args){
		new LwjglApplication(new Game(),"游戏",800,480,false);
	}
}
