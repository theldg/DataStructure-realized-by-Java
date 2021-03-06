
import com.ldg.map.Map.Visitor;
import com.ldg.set.Set.Vistor;
import com.ldg.set.TreeSet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ldg.map.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
       
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("a");
		treeSet.add("d");
		treeSet.add("s");
		treeSet.add("j");
		treeSet.traversal(new Vistor<String>() {
			
			@Override
			public boolean visit(String element) {
				System.out.println(element);
				return false;
			}
		});
	}

	private static void test01() throws FileNotFoundException, IOException {
		Reader reader = new FileReader("E:\\javaEclipse\\数据结构和算法\\9.0映射\\src\\test.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		List<Character> charList = new ArrayList<Character>();
		int l;
		while ((l = bufferedReader.read()) != -1) {
			charList.add((char) l);
		}

		TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
		for (int i = 0; i < charList.size(); i++) {

			treeMap.put(charList.get(i), treeMap.get(charList.get(i)) == null ? 1 : treeMap.get(charList.get(i)) + 1);
		}
		treeMap.traversal(new Visitor<Character, Integer>() {

			@Override
			public boolean visit(Character key, Integer value) {
				System.out.println(key + ":" + value);
				return false;
			}
		});
	}

}
