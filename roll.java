import java.*;
import java.util.Random;
import java.lang.Math;

public class roll {
	public static void main(String[] args) {
		int num[] = new int[10];
		for(int i = 2; i < 8; i ++)
		{
			num[i] = randInt(2, 267);
		}
		
		System.out.println("生成的觉醒初始楼层是: " + num[0]);
		System.out.println("生成的双色同人物初始楼层是: " + num[1]);
		System.out.println("生成的双色初始楼层是: " + num[2]);
		System.out.println("生成的同色初始楼层是: " + num[3]);
		System.out.println("生成的10单UR初始楼层是: " + num[4]);
		System.out.println("生成的50个30心+1招募初始楼层是: " + num[5]);
	}
	
	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
}