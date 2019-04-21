package reflect.ydd.demo;

import java.util.Properties;
import java.util.Scanner;

public class MediaMaster {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Properties pros = new Properties();
		pros.setProperty("reflect.ydd.demo.palyerIml", "反射.ydd.demo.ConsolePlayer");
		System.setProperties(pros);
		
		String playerIml = System.getProperty("反射.ydd.demo.palyerIml");
		System.out.println("输入您想要的影片");
        Player player = (Player)Class.forName(playerIml).newInstance();
        player.play(new Scanner(System.in).nextLine());
	}

}
