import java.*;
import java.util.Random;
import java.lang.Math;

public class roll {
	public static void main(String[] args) {
		int num[] = new int[10];
		for(int i = 0; i < 6; i ++)
		{
			num[i] = randInt(2, 267);
		}
		
		System.out.println("���ɵľ��ѳ�ʼ¥����: " + num[0]);
		System.out.println("���ɵ�˫ɫͬ�����ʼ¥����: " + num[1]);
		System.out.println("���ɵ�˫ɫ��ʼ¥����: " + num[2]);
		System.out.println("���ɵ�ͬɫ��ʼ¥����: " + num[3]);
		System.out.println("���ɵ�10��UR��ʼ¥����: " + num[4]);
		System.out.println("���ɵ�50��30��+1��ļ��ʼ¥����: " + num[5]);
	}
	
	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
}