import java.util.List;
import java.util.ArrayList;
public class RuntimeConstantPoolOOM{

     public static void main(String...args){
	List<String> list = new ArrayList<>();
	int i = 0;
	while(true){
	list.add(String.valueOf(i++).intern());
   }
 }
}
