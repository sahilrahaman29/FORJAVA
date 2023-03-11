class HelloWorld {
    public static void main(String []args) 
    {
        /*int a = 5;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);*/
        int a =10;
        //++a;
        //System.out.println(a);
        //int b = a++;
        //int b = a++ + ++a + a--;
        int b;
        b = a++ + ++a + a++ + --a + a--;
        System.out.println(a);
        System.out.println(b);
    }
}