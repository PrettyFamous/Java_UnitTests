package lruCache;

import java.util.HashMap;
import java.util.LinkedList;

public class LruCacheImpl<K, V> implements LruCache<K, V> {

    final int MAX_SIZE = 3;

    int size;

    HashMap<K, V> map;
    LinkedList<K> list;

    public LruCacheImpl() {

        map = new HashMap<K, V>();
        list = new LinkedList<K>();

        size = 0;
    }

    public V get(K key){

        list.remove(key);
        list.addFirst(key);

        return map.get(key);
    }

    public void set(K key, V value) {

        if(size < MAX_SIZE) {
            map.put(key, value);
            list.addFirst(key);
            size++;
        }
        else {
            // Удаление последнего элемента
            K tmp = list.pollLast();
            map.remove(tmp);

            // Вставка нового на первую позицию
            map.put(key, value);
            list.addFirst(key);
        }
    }

    public int getSize() {

        return size;
    }

    public int getLimit() {

        return MAX_SIZE;
    }

}

