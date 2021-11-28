public class a extends Thread{
public void run(){
for(int i=0;i<=5;i++){
System.out.println(i+"*5="+i*5);
}
}
}
public class b extends Thread{
public void run(){
for(int i=0;i<=6;i++){
System.out.println(i+"*6="+i*6);
}
}
}
public class multi extends Thread{
public static void main(String[]args){
a t1=new a();
b t2=new b();
t1.start();
t2.start();

 }
}