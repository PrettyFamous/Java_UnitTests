import lruCache.LruCacheImpl;
import menu.MainMenu;

public class Main {

    public static void main(String[] args) {

        MainMenu menu = new MainMenu();
        LruCacheImpl<Integer, String> lru = new LruCacheImpl<Integer, String>();
        int item = -1;

        while(item != 0) {
            item =  menu.showMenu();

            switch (item) {
                case 1 -> {
                    int key = menu.inputKey();
                    String value = menu.inputValue();
                    lru.set(key, value);
                }
                case 2 -> {
                    int key = menu.inputKey();
                    System.out.println(lru.get(key));
                }
                case 3 -> System.out.println(lru.getSize());
                case 4 ->  System.out.println(lru.getLimit());
            }
        }

    }
}
