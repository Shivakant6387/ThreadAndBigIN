package org.example;

public class InterruptionEX extends Thread {
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("child thread executed");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("InterruptedException occur"+e);
        }
    }
}
class Test{
    public static void main(String[] args) throws InterruptedException{
    InterruptionEX thread=new InterruptionEX();
    thread.start();
    thread.interrupt();
        System.out.println("Main thread  execution completes");
    }
}