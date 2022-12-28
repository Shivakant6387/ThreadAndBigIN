package org.example;

import java.util.ArrayList;
import java.util.List;

public class SynchroProblem implements Runnable{
    private List<Integer>numList;
    public SynchroProblem(List<Integer>numList){
        this.numList=numList;
    }
    public void run(){
        System.out.println("in  run method");
        for (int i=0;i<10;i++){
            numList.add(50);
            numList.add(40);
            numList.add(30);
            numList.add(20);
            numList.add(10);
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer>numList=new ArrayList<>();
        Thread th1=new Thread(new SynchroProblem(numList));
        Thread th2=new Thread(new SynchroProblem(numList));
        Thread th3 =new Thread(new SynchroProblem(numList));
        th1.start();
        th2.start();
        th3.start();
        try
        {
            th1.join();
            th2.join();
            th3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of list is "+numList.size());
        for (Integer i:numList){
            System.out.println("num-"+i);
        }
    }
}
