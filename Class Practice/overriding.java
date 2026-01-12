class animal {
    void eat() {
        System.out.println("PIzZA");
    }
}

class dog extends animal {
    void eat() {
        System.out.println("biryani");
    }

    void data() {
        System.out.println("hello");
    }
}

class overriding{
public static void main(String[] args) {
    animal s1=new dog();
    s1.eat();

    s1.eat() ;
  //  dog s2=(dog)s1;
}
}