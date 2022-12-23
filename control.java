class food {
    String name;
    int price;

    public void insert(String str, int num) {
        name = str;
        price = num;
    }

    public void print() {
        if (price >= 10) {
            System.out.println(name + " is expensive. It is RM" + price + ".");
        }

        else {
            System.out.println(name + " is cheap. It is RM" + price + ".");
        }
    }
}

public class control {
    public static void main(String args[]) {
        food food1 = new food();
        food1.insert("Nasi Lemak", 8);
        food1.print();

        food food2 = new food();
        food2.insert("Nasi Lemak Ayam", 15);
        food2.print();
    }
}
