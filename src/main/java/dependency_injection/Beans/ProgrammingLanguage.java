package dependency_injection.Beans;

import java.util.Arrays;
import java.util.Map;

public class ProgrammingLanguage {
    private String[] types;

    public Map<String, Integer> getRating() {
        return rating;
    }

    private Map<String,Integer> rating;

    public void setTypes(String[] types) {
        this.types = types;
    }

    public void setRating(Map<String, Integer> rating) {
        this.rating = rating;
    }



    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "types=" + Arrays.toString(types) +
                ", rating=" + rating +
                '}';
    }
}
