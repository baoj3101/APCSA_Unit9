import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		int found = 0;
		for (int i = 1; i < ray.size(); i++) {
			if (ray.get(i) > ray.get(0)) {
				found = 1;
				sum += ray.get(i);
			}
		}
		return found == 0 ? -1 : sum;
	}
}