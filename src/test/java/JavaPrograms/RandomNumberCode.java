package JavaPrograms;

import java.util.Random;

public class RandomNumberCode {

	public static void main(String[] args) {
		Random ranNum=new Random();
		int nums=ranNum.nextInt(1000);
		System.out.println(nums);

	}

}
