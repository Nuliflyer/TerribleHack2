import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class theCreator {
	public static void main(String args[]) throws AWTException, InterruptedException{

		System.out.println("HELLO WORLD");
		Robot R = new Robot();
		Random rand = new Random();
		int randNum;
		R.mouseMove(20, 30);
		Thread.sleep(500);
		R.mousePress(InputEvent.BUTTON1_MASK);
		R.mouseRelease(InputEvent.BUTTON1_MASK);
		R.mouseMove(20, 50);
		Thread.sleep(500);
		R.mousePress(InputEvent.BUTTON1_MASK);
		R.mouseRelease(InputEvent.BUTTON1_MASK);
		R.mouseMove(400, 130);
		Thread.sleep(500);
		R.mousePress(InputEvent.BUTTON1_MASK);
		R.mouseRelease(InputEvent.BUTTON1_MASK);
		
		R.keyPress(88);
		R.keyRelease(88);
		for(int index = 0; index < 25; index++){
			randNum = rand.nextInt(25)+65;
			R.keyPress(randNum);
			R.keyRelease(randNum);
		}
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress('V');
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease('V');

		R.mouseMove(200, 60);
		Thread.sleep(500);

		Thread.sleep(10000);

		R.mousePress(InputEvent.BUTTON1_MASK);
		R.mouseRelease(InputEvent.BUTTON1_MASK);
		R.mousePress(InputEvent.BUTTON1_MASK);
		R.mouseRelease(InputEvent.BUTTON1_MASK);
		
		System.out.println("HELLO WORLD");
	}
}
