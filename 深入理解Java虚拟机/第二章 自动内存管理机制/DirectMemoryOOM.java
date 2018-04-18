import java.lang.reflect.Field;
import sun.misc.Unsafe;
public class DirectMemoryOOM{
  private static final int _1MB = 1024*1024;
  
	public static void main(String...args){
	 Field unsafeField = Unsafe.class.getDeclaredFields()[0];
	 unsafeField.setAccessible(true);
         try{
	 Unsafe unsafe = (Unsafe)unsafeField.get(null);
	  while(true){
		unsafe.allocateMemory(_1MB);
	}}catch(IllegalAccessException e){
          e.printStackTrace();
  }
  }

}
