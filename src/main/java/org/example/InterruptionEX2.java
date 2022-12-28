package org.example;

public class InterruptionEX2 extends  Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("GeeksForGeeks");
        }catch (InterruptedException e){
            throw new RuntimeException("Thread"+"interrupted");
        }
    }

    public static void main(String[] args) throws  RuntimeException{
        InterruptionEX2 thread=new InterruptionEX2();
        thread.start();
        try{
            thread.interrupt();
            thread.join(3000);
        }catch (Exception e){
            System.out.println("Exception handled");
        }
    }
}
