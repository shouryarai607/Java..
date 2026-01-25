class intege {
        void check(int x) {
                if (x < 0) {
                        System.out.println("its negative");
                } else if (x == 0) {
                        System.out.println("its zero");
                } else {
                        System.out.println("its positive");
                }
        }
}

class intecheck {
        public static void main(String[] args) {
                intege i1 = new intege();
                i1.check(-4);
        }
}