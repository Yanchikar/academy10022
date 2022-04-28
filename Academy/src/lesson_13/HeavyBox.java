package lesson_13;

import java.util.ArrayList;
import java.util.Arrays;

public class HeavyBox {

	int weight;
	int width;
	int height;
	int depth;

	public HeavyBox(int w, int h, int d, int m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeavyBox [weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}
	 public static void main (String[] args ) {

	        ArrayList <HeavyBox> heavyBox = new ArrayList<>();

	        HeavyBox heavyBox1 = new HeavyBox(9,8,8,6);
	        HeavyBox heavyBox2 = new HeavyBox(15,12,05,20);
	        HeavyBox heavyBox3 = new HeavyBox(500,156,456,654);
	        HeavyBox heavyBox4 = new HeavyBox(123,369,4,12);
	        HeavyBox heavyBox5 = new HeavyBox(20,20,12,155);

	        heavyBox.add(heavyBox1);
	        heavyBox.add(heavyBox2);
	        heavyBox.add(heavyBox3);
	        heavyBox.add(heavyBox4);
	        heavyBox.add(heavyBox5);

	        for (HeavyBox heavy : heavyBox) {
	            System.out.println(heavy);
	        }

	        heavyBox.get(0).weight = 3;

	        heavyBox.remove(heavyBox.size()-1);

	        Object[] heavyArray = heavyBox.toArray();
	        System.out.println(Arrays.toString(heavyArray));

	        HeavyBox[] heavyArray1 = new HeavyBox[heavyBox.size()];
	        heavyBox.toArray(heavyArray1);
	        System.out.println(Arrays.toString(heavyArray1));

	        heavyBox.clear();
	    }

	}	
