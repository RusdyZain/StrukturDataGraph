package data.component;

import java.util.Objects;



/**
 * class data.component.Node merupakan sebuah class yang menjadi entitas dari Double Linked List. class ini memiliki
 * beberapa value dengan variabel generic child, node prev dan next yang menjadi penunjuk dair node.
 *
 * @param <T>
 */
class Node<T> {
    final T child;
    Node<T> prev = null;
    Node<T> next = null;

    /**
     * konstruktor ini merupakan konstruktor yang berfungsi untuk inisialisasi value dari yang sudah ada
     */
    Node(T child) {
        this.child = child;
    }
}
/**
 * class double linked list merupakan linked list yang memiliki dua buah pointer, yaitu next dan prev. selain itu,
 * class ini menyimpan head dan tail sehingga memudahkan dalam memanggil ujung dari linked list.
 *
 * @param <T> tipe data generik
 */
public class DoubleLinkedList<T> {
    public interface Consumer<T> {
        void call(T item);
    }
    Node<T> tail;
    Node<T> current;
    Node<T> head;
    boolean doBreak = false;
    /**
     * method peek() adalah method yang berfungsi untuk mengembalikan value dari node current yang dimiliki oleh
     * linked list.
     *
     * @return variabel current
     */
    public T peek() {return peekNode().child;}

    /**
     * method peek() adalah method yang berfungsi untuk mengembalikan value dari method peekNode()
     * yang ada pada argument yang dimasukkan. dimulai dengan melakukan reset node linked list.
     *
     * @return variabel current
     */
    public T peek(T item) {
        if(peekNode(item)!= null)
            return peekNode(item).child;
        return null;
    }
    /**
     * method peekNode() adalah method yang berfungsi untuk mengembalikan node current yang dimiliki oleh
     * linked list.
     *
     * @return variabel current
     */
    public Node<T> peekNode() {
        return current;
    }

    /**
     * method peekNode() adalah method overload yang berfungsi untuk mengembalikan node yang memiliki value yang sama dengan
     * yang ada pada argument yang dimasukkan. dimulai dengan melakukan reset node.
     * linked list.
     *
     * @return variabel current
     */
    public Node<T> peekNode(T item) {
        resetPosToHead();
        if (isEmpty()) return tail;
        while (isInList()) {
            if (Objects.equals(item.toString().toLowerCase(), peek().toString().toLowerCase())) return current;
            advanceNext();
        }
        return null;
    }
    /**
     * method isEmpty() merupakan method dengan nilai kembalian berupa boolean. method ini berfungsi untuk mengembalikan
     * boolean dari kondisi jika head adalah null
     *
     * @return node setelah current next
     */
    public String toString() {
        StringBuilder text = new StringBuilder();
        resetPosToHead();
        while (isInList()) {
            text.append(current.child.toString()).append(" | ");
            advanceNext();
        }
        return text.toString();
    }
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * method isLast() merupakan method dengan nilai kembalian berupa boolean. method ini berfungsi untuk mengembalikan
     * boolean dari kondisi jika current.next adalah null
     *
     * @return boolean
     */
    public boolean isLast() {
        return current == tail;
    }

    /**
     * method isInList() merupakan method dengan nilai kembalian berupa boolean. method ini berfungsi untuk mengembalikan
     * boolean true dari kondisi jika current tidak null
     *
     * @return boolean
     */
    public boolean isInList() {
        return current != null;
    }

    /**
     * method resetPosToHead() merupakan method dengan nilai kembalian void. method ini berfungsi untuk
     * mereset posisi dari current kembali ke head, sehingga dapat digunakan untuk iterasi selanjutnya.
     */
    public void resetPosToHead() {
        current = head;
    }

    /**
     * method advanceNext() berfungsi untuk memindahkan posisi variabel current ke posisi selanjutnya atau current.next.
     * methid ini dibuat untuk mempermudah cara baca perintah dari kode, serta dapat dipanggil berulang - ulang.
     */
    public void advanceNext() {
        current = current.next;
    }

    /**
     * method add() merupakan method dengan nilai kembalikan berupa void. method ini berfungsi untuk menambahkan item
     * baru ke linked list yang telah tersedia / membuat linked list baru jika kosong dari kepala linked list.
     * method ini bekerja dengan menambahkan sebuah node ke pointer kepala pada linked list. jika linked list dalam
     * kondisi kosong, node baru dibuat dan kemudian dimasukkan ke head dan tail. jika liked list sudah memiliki node,
     * maka node baru pada next diatur untuk menunjuk head, kemudian node baru tersebut ditambahkan di head.prev,
     * serta memindahkan posisi head ke head.prev.
     *
     * @param item sebuah item ke method, dengan tipe data generic.
     */
    public void add(T item) {
        if (isEmpty()) {
            head = new Node<>(item);
            tail = head;
            return;
        }
        Node<T> temp = new Node<>(item);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }
    /**
     * method addback() merupakan method dengan nilai kembalikan berupa void. method ini berfungsi untuk menambahkan node
     * baru ke linked list yang telah tersedia / membuat linked list baru jika kosong dari kepala linked list.
     * method ini bekerja dengan menambahkan sebuah node ke pointer tail pada linked list. jika linked list dalam
     * kondisi kosong, node baru dibuat dan kemudian dimasukkan ke head dan tail. jika linked list sudah memiliki node,
     * maka node baru pada prev diatur untuk menunjuk tail, kemudian node baru tersebut ditambahkan di tail.next,
     * serta memindahkan posisi tail ke tail.next. ketika proses berhasil, program akan menambahkan len sebanyak 1.
     *
     * @param item sebuah item ke method, dengan tipe data generic.
     */
    public void addBack(T item) {
        if (isEmpty()) {
            add(item);
            return;
        }
        Node<T> temp = new Node<>(item);
        temp.prev = tail;
        tail.next = temp;
        tail = temp;
    }


    /**
     * method ini merupakan method yang berfungsi untuk mengeluarkan node dari head.
     * jika linked list kosong, method akan mengembalikan nilai null, jika linkedl ist memiliki sebuah node, maka
     * program akan menyimpan sementara head / tail, kemudian mereset baik head dan tail menjadi null, dan mengembalikan
     * nilai head yang telah disimpan sementara.
     * jika linked list memiliki node yang lebih dari satu, maka method akan membuat node sementara yang menyimpan node
     * dari head, kemudian memindahkan pointer head menuju head.next, dan mengubah head.prev menjadi null untuk melepas
     * sambungan dari head yang dikeluarkan.
     * variabel len akan dikurangi sebanyak 1 jika proses berhasil.
     *
     * @return data.data.data.component.Node yang telah dikeluarkan dari linked ist
     */
    public T remove() {
        resetPosToHead();
        if (isEmpty()) {
            System.out.println("null");
            return null;
        }
        if(head == tail) {
            Node<T> temp = head;
            head = tail = null;

            return temp.child;
        }
        if (isLast()) {
            return removeBack();
        }
        Node<T> temp = head;
        head = head.next;
        head.prev = null;
        return temp.child;
    }
    /**
     * method ini merupakan kebalikan dari method pop(), yang berfungsi untuk mengeluarkan node dari tail.
     * jika linked list kosong, method akan mengembalikan nilai null, jika linkedl ist memiliki sebuah node, maka
     * program akan menjalankan method pop()
     * jika linked list memiliki node yang lebih dari satu, maka method akan membuat node sementara yang menyimpan node
     * dari tail, kemudian memindahkan pointer tail menuju tail.prev, dan mengubah tail.next menjadi null untuk melepas
     * sambungan dari tail yang dikeluarkan.
     * variabel len akan dikurangi sebanyak 1 jika proses berhasil.
     *
     * @return data.data.data.component.Node yang telah dikeluarkan dari linked ist
     */
    public T removeBack() {
        resetPosToHead();
        if (isEmpty()) {
            System.out.println("null");
            return null;
        }
        if (isLast()&& head == tail) {
            return remove();
        }
        Node<T> temp = tail;
        tail = tail.prev;
        tail.next = null;
        return temp.child;
    }

    // merupaakn method untuk mealkukan perulangan, menggunakan fitur callback.
    // callback pada method ini diharuskan untuk mengembalikan nilai true jika ingin menghentikan
    // proses fungsi yang berjalan
    public void forEach(Consumer<T> consumer) {
        resetPosToHead();
        doBreak = false;
        while (isInList()) {
            consumer.call(peek());
            if(doBreak) break;
            advanceNext();
        }
    }
    public void forEachFixed(Consumer<T> consumer) {
        resetPosToHead();
        doBreak = false;
        while (isInList()) {
            consumer.call(peek());
            advanceNext();
        }
    }

    /**
     * gunakan ini untuk menghentikan proses forEach
     */
    void breakForEach() {this.doBreak = true;}

}
