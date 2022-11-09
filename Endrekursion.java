public class Endrekursion {

    public static void main(String[] args) {
        System.out.println(faculty());
        }

        public static int faculty(){
            return multiplyFaculty(1, 3);
        }

        public static int multiplyFaculty(int f, int n){
            if(n == 1 || n == 0){
                return f;
            }
            return multiplyFaculty(f * n, n - 1);
        }
}
