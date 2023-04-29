public class ComputerExample {
    public static void main(String[] args){
        Computer myCom = new Computer();

        int result1 =myCom.sum(1,2,3);
        System.out.println("result1 "+result1);

        int result2 =myCom.sum(1,2,3,4);
        System.out.println("result2 "+result1);

        int result3 =myCom.sum(1,3,3,4,5);
        System.out.println("result1 "+result1);

        int result4 = myCom.sum(new int[] {1,2,3,4,5});
        System.out.println("result4 "+result4);

    }
}
