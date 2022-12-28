package org.example;

import java.util.ArrayList;
class MyThread extends  Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        while(true){

        }
    }
}
public class Szal {
    static ArrayList<MyThread>myThreads;
    static String[]names;
    public Szal(){
    myThreads=new ArrayList<MyThread>();
    names = new String[]{"EZ","AZ"};
    for (int i=0;i<names.length;i++){
        MyThread t=new MyThread(names[i]);
        myThreads.add(t);
        t.start();
    }
    }

    public static void main(String[] args) {
        new Szal();
        Thread [] thread=new Thread[Thread.activeCount()];
        int m=Thread.enumerate(thread);
        for (int i=0 ; i<m;i++){
            System.out.println(thread[i].getName());
        }
        for (Thread threads:myThreads){
            if (threads.getName().equalsIgnoreCase("EZ")){
                threads=Thread.currentThread();
                threads.interrupt();
                myThreads.remove(threads);
            }
        }
        Thread[]threads=new Thread[Thread.activeCount()];
        int c=Thread.enumerate(threads);
        for (int i=0;i<c;i++){
            System.out.println(threads[i].getName());
        }
    }
}
