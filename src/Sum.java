public class Sum {

    int i;

    int j;

    Sum() {
        i = 800;
        j = 250;
        System.out.println("Constructor calling 1st");
    }

    public static void main(String[] args) {
       Sum s = new Sum();
        System.out.println("Value of:"+(s.i+s.j));
    }



}
