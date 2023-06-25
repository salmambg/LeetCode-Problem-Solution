import java.util.*;

public class destination {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));

        Map<String,String> map= new HashMap<>();

        for (List<String> list:paths) {
            String source= list.get(0);
            String destination = list.get(1);
            map.put(source,destination);
        }
        String DestinationCity= paths.get(0).get(1);
        while (map.containsKey(DestinationCity)) {
            DestinationCity=map.get(DestinationCity);
        }
        System.out.println(DestinationCity);
    }
}
