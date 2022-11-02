public class Rekursion {

    public static void main(String[] args) {

        System.out.println(rekSum(6));

    }


    public static int rekSum(int n) {

        if(n == 0){
            return 0;
        }

        return rekSum(n-1) + n;

    }
}




