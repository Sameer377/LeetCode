import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCandies {


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        }
        List<Boolean> res = new ArrayList<Boolean>();
        for (int i : candies) {
            if (i + extraCandies >= max)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}
