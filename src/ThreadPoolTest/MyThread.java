package ThreadPoolTest;

public class MyThread extends Thread{
	public MyThread(String name){
		super(name);
		//Thread.currentThread().setName(name);
	}
	@Override
	public void run() {
        System.out.println(Thread.currentThread().getName() + "����ִ�С�����"+this.getName());
		//System.out.println(this.getName() + "����ִ�С�����");
    }

}
