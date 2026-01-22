class truck {
    void truck1() {
        System.out.println("Nothing");
    }

    void truck1(int x) {
        System.out.println(x);
    }

    void truck1(int x, int y) {
        System.out.println(x);
        System.out.println(y);
    }
}

class Overloading1 {
    public static void main(String[] args) {
        truck t1 = new truck();
        t1.truck1();
        t1.truck1(3, 7);
    }
}