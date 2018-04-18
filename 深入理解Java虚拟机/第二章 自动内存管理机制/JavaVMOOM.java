public class JavaVMOOM{
    
    private void dontStop(){
	while(true){}
   }

    public void staticLeakByThread(){
	while(true){
	 Thread t = new Thread(() -> {dontStop();});
         t.start();
}  
}
    public static void main(String...args){
	JavaVMOOM oom = new JavaVMOOM();
	oom.staticLeakByThread();
 }
}
