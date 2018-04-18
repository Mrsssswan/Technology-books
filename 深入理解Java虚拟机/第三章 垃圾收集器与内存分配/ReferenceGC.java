public class ReferenceGC{
  public Object instance = null;
  private static final int _1MB = 1024*1024;
  private byte[] bidSize = new byte[2*_1MB];

  public static void testGC(){
    ReferenceGC gc1 = new ReferenceGC();
    ReferenceGC gc2 = new ReferenceGC();
     gc1.instance = gc2;
     gc2.instance = gc1;
     gc1 = null;
     gc2 = null;
     System.gc();
 }
   public static void main(String...args){
	testGC();
 }
}
