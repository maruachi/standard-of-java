package _20220331;

public class Tv {
    private String name;
    private int num;

    public Tv(){
        System.out.println("디폴트 생성자 TV");
    }

    public Tv(String name, int num){
        System.out.println("매개변수가 있는 생성자");
        this.name = name;
        this.num = num;
    }

    public void printTv(){
        System.out.println("TV name = " + this.name + " channel # = " + this.num);
    }
}
