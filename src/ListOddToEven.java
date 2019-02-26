import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = -1;
		int even = -1;
		int i = 0;
		while (i < ray.size()) {
			if (ray.get(i) % 2 == 1 && odd < 0) {  // only remember the 1st odd
				odd = i;
			}
			if (ray.get(i) % 2 == 0) {	// remember the last even
				even = i;
			}
			i++;
		}
		if (odd > 0 && even> odd) {
			return even - odd;
		}
		return -1;
	}
}