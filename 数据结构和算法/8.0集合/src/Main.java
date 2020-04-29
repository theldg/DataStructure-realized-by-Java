import com.ldg.set.ListSet;
import com.ldg.set.Set;
import com.ldg.set.Set.Vistor;
import com.ldg.set.TreeSet;

public class Main {

	public static void main(String[] args) throws Exception {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(15);
		set.add(45);
		set.add(8);
		//set.remove(null);
		System.out.println(set.size());
		set.traversal(new Vistor<Integer>() {

			@Override
			public boolean visit(Integer element) {
				System.out.println(element);
				if(element==15)  return true;
				return false;
			}
		});

	}
}
