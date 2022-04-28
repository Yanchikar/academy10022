package lesson_12;

import java.util.ArrayList;
import java.util.List;

import lesson_13.HeavyBox;

public class Array {

	public static void main(String[] args) {
		
		List<HeavyBox> arrayList = new ArrayList<>();
//		ArrayList(ArrayList extends HeavyBox);
		
		HeavyBox Box1 = new HeavyBox(2, 2, 5, 8);
		HeavyBox Box2 = new HeavyBox(1, 4, 7, 4);
		HeavyBox Box3 = new HeavyBox(5, 6, 8, 3);
		
		arrayList.add(Box1);
		arrayList.add(Box2);
		arrayList.add(Box3);
		
		for (HeavyBox box : arrayList) {
			System.out.println(box);
		}
		
		arrayList.get(0);
		arrayList.setWeight(1);
		arrayList.remove(arrayList.size() - 1);
		
//		ArrayList(ArrayList extends HeavyBox);	
		
//		ArrayList.addAll(0, arrayList, HeavyBox);
//	}
//
//	bollean[] add(HeavyBox);
//		
	}
}
