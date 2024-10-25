package lab24;

import java.util.Random;

class SquareThread extends Thread{

	int randomno;

	SquareThread(int randomno){

		this.randomno=randomno;

	}

	public void run() {

		System.out.println("Square of "+randomno+" ="+(randomno*randomno));

	}

}

class CubeThread extends Thread{

	int randomno;

	CubeThread(int randomno){

		this.randomno=randomno;

	}

	public void run() {

		System.out.println("Cube of "+randomno+" ="+(randomno*randomno*randomno));

	}

}

class RandomnumThread extends Thread{

	public void run() {

		Random robj=new Random();

		int i;

		for(i=1;i<=10;i++) {

		int randomno=robj.nextInt(100);

		if(randomno%2==0) {

			SquareThread s=new SquareThread(randomno);

			s.start();

		}

		else {

			CubeThread c=new CubeThread(randomno);

			c.start();

		}

		}

	}

}

public class MultiThreadingDemo {

	public static void main(String[] args) {

		RandomnumThread r1=new RandomnumThread();

		r1.start();

	}

}