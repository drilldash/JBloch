public class TestClass {
    public static void main(String[] args) {
        Test obj = new Test();
        Test obj1 = new Test();
        Test obj2 = new Test();
        System.out.println((obj.getValue()));
        System.out.println((obj1.getValue()));
        System.out.println((obj2.getValue()));
        System.out.println((Test.getStaticValue()));
        System.out.println((Test.getStaticValue()));
        System.out.println((Test.getStaticValue()));
    }
}
