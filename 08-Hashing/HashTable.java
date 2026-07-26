/**
 * Hash Table using Linear Probing
 *
 * Hash Function:
 * index = key % SIZE
 *
 * Operations:
 * - Insert
 * - Search
 * - Display
 *
 * Time Complexity (Average):
 * Insert : O(1)
 * Search : O(1)
 *
 * Worst Case:
 * O(n)
 */

public class HashTable {

    static final int SIZE = 10;

    int[] table;

    public HashTable() {

        table = new int[SIZE];

        // -1 indicates an empty slot
        for (int i = 0; i < SIZE; i++) {
            table[i] = -1;
        }
    }

    // Hash Function
    public int hash(int key) {
        return key % SIZE;
    }

    // Insert using Linear Probing
    public void insert(int key) {

        int index = hash(key);

        while (table[index] != -1) {
            index = (index + 1) % SIZE;
        }

        table[index] = key;
    }

    // Search
    public boolean search(int key) {

        int index = hash(key);
        int start = index;

        while (table[index] != -1) {

            if (table[index] == key) {
                return true;
            }

            index = (index + 1) % SIZE;

            if (index == start) {
                break;
            }
        }

        return false;
    }

    // Display Hash Table
    public void display() {

        System.out.println("Hash Table:");

        for (int i = 0; i < SIZE; i++) {

            System.out.print(i + " : ");

            if (table[i] == -1)
                System.out.println("Empty");
            else
                System.out.println(table[i]);
        }
    }

    public static void main(String[] args) {

        HashTable ht = new HashTable();

        ht.insert(15);
        ht.insert(25);
        ht.insert(35);
        ht.insert(18);
        ht.insert(28);

        ht.display();

        int key = 35;

        if (ht.search(key))
            System.out.println("\n" + key + " found.");
        else
            System.out.println("\n" + key + " not found.");
    }
}