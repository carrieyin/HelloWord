package reflect.ydd.demo;

import java.util.Properties;
import java.util.Scanner;

public class MediaMaster {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Properties pros = new Properties();
		pros.setProperty("reflect.ydd.demo.palyerIml", "����.ydd.demo.ConsolePlayer");
		System.setProperties(pros);
		
		String playerIml = System.getProperty("����.ydd.demo.palyerIml");
		System.out.println("��������Ҫ��ӰƬ");
        Player player = (Player)Class.forName(playerIml).newInstance();
        player.play(new Scanner(System.in).nextLine());
	}

}
