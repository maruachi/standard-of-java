class PrintfEx1 {
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL; // 16진수
        //0,1,2,3,4,5,6,7,8,9,a(10),b,c,d,e,f(15)

        int octNum = 010;  // 8진수
        int hexNum = 0x10; // 16진수 
        int binNum = 0b10; // 2진수 

        System.out.printf("b=%d%n",b);
        System.out.printf("b=%d\n",b);
        System.out.printf("b=%d",b);
        System.out.printf("b=%d",b);
        System.out.printf("%n",b);
        System.out.printf("s=%d%n",s);
        System.out.printf("c=%c, %d %n", s, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=[%d]%n", big);
        System.out.printf("hex=%#x%n", hex);
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}
