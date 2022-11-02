public class Interativ {

    public static void main(String[] args) {

        System.out.println(interSum(6));

    }
    public static int interSum(int n){

        int sum = 0;

        for (int i = 0; i <= n; i++){
            sum += i;
        }
            return sum;

    }


}
