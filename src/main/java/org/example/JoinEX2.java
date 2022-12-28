package org.example;

public class JoinEX2  extends  Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinEX2 t1=new JoinEX2();
        JoinEX2 t2=new JoinEX2();
        JoinEX2 t3=new JoinEX2();
        t1.start();
        try{
            t1.join(700);
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
