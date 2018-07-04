
public class TestThread2 {

    public static void main(String[] args){
        Runner1 r1 = new Runner1();
        Thread t=new Thread(r1);
        t.start();//线程必须由 start()方法开启
        // r.run(); 不能使用，因为这是方法调用

        for( int i=0; i<100;i++){
            System.out.println("Main Thread:----"+i);
        }
        //=========================================================
        Runner2 r2 = new Runner2();
        r2.start();// Runner2已经继承了Thread
        for( int i=0; i<100;i++){
            System.out.println("Main Thread:----"+i);
        }
    }
}

class Runner1 implements Runnable{// Runnable
    //尽量使用 实现接口， 不要使用extends Thread，因为继承父类，只能实现一次，而接口可以实现多个
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Runner1 :"+i);
        }
    }
}

class Runner2 extends Thread{// Thread
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Runner1 :"+i);
        }
    }
}


