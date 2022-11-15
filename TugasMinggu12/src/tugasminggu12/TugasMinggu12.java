package tugasminggu12;
import java.util.*;

public class TugasMinggu12 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, String> map = new HashMap<Integer, String>();
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        
        list.remove(3);
        list.add(3,17);
        
        System.out.println("Isi List : ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Index ke - " + i + " : " + list.get(i));
        }
        
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        
        int x = 5;
        
        System.out.println("\nApakah set kosong?");
        if(set.isEmpty()) System.out.println("Ya");
        else System.out.println("Tidak");

        System.out.println("Apakah " + x + " ada di set?");
        if(set.contains(x)) System.out.println("Ya");
        else System.out.println("Tidak");
        
        map.put(1, "Robot");
        map.put(2, "Boneka");
        map.put(3, "Bola");
        map.put(4, "Mobil-mobilan");
        
        x = 1;
        
        System.out.println("\nAnggota map yang memiliki key " + x + " adalah " + map.get(x));

        int y = 6;
        
        System.out.println("\nApakah map menggunakan key " + y + "?");
        if(map.containsKey(y)) System.out.println("Ya\n");
        else System.out.println("Tidak\n");
        
        System.out.println("Isi Map : ");
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            System.out.println(String.format("Pada key %d, Terdapat %s", pair.getKey(), pair.getValue()));   
        }
        
        for (int i = 0; i < 5; i++)
            queue.add(i);
        
        for (int i = 0; i < 5; i++)
            stack.push(i);
        
        // keduanya sebelum di remove berisi 0,1,2,3,4
        queue.remove();
        System.out.println("\nHead dari queue : " + queue.peek());
        
        stack.pop();
        System.out.println("Tail dari stack : " + stack.lastElement());
        
        
        
        String str1 = "Heloo";
        String str2 = "Hello";
        
        System.out.println("\nstring 1 = " + str1);
        System.out.println("string 2 = " + str2);
        
        System.out.println("Apakah kedua String sama?");
        if(str1.compareTo(str2) == 0) System.out.println("Ya");
        else System.out.println("Tidak");
       
    }
    
}
