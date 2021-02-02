public class WarmUpTest {
    public static void main(String[] args) {
        for (int i = 100; i >= 0 ; i-=5) {
            System.out.println(i);
        }

        for (int i = 0; i <= 100 ; i+= 10) {
            System.out.println(i%20==0?i + " Java":i); //the ? makes it an inline if statement, the colon after "Java" dictates what to do if false
        }

        }
    }
}
