package _20220331;

public class Main {
    public static void main(String[] args){
//        Person p = new Person(); //컴파일러가 생성해준다.
//        p.printName();
//        Person.printAge(1);

        Tv tv = new Tv("dong",7);
        tv.printTv();
        Tv tv2 = new Tv(); //컴파일러가 생성하지 않는다. 직접 제어 필요
    }
}
