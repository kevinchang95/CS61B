import java.util.Comparator;
public class Maximizer {
	/*public static Object max(Object[] items) {
		int maxDex = 0;
		for (int i = 0; i < items.length; i += 1) {
			if (items[i] > items[maxDex]) {
				maxDex = i;
			}
		}
		return items[maxDex];

	}*/



	/*public static OurComparable max(OurComparable[] items){

		OurComparable maxObject = items[0];

		for(OurComparable item: items){

			if(item.compareTo(maxObject) > 0){

				maxObject = item;


			}

		}

		return maxObject;



	}*/

	public static Comparable max(Comparable[] items){

		Comparable maxObject = items[0];

		for(Comparable item: items){

			if(item.compareTo(maxObject) > 0){

				maxObject = item;


			}

		}

		return maxObject;



	}

	public static Comparable max(Comparable[] items,Comparator com){

		Comparable maxObject = items[0];

		for(Comparable item: items){

			if(com.compare(maxObject,item) < 0){

				maxObject = item;


			}

		}

		return maxObject;



	}


} 