package day09.mythread;

public class CountThread extends Thread {
	@Override
	public void run() { // 메인 메소드와 비슷함
		for (int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("CountThread 종료!");
	}
}
