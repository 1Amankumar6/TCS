public class nthNew {
    // F(N) = (1) + (2*3) + (4*5*6) + ... N.
    public static void main(String[] args) {
        int n = 4;
        System.out.println(term(1, 1, n));
    }

    static int term(int answer, int current, int N) {
        if (current > N) {
            return 0;
        }
        int cur = 1;
        for (int i = answer; i < answer + current; i++) {
            cur *= i;
        }
        return cur + term(answer + current, current + 1, N);
    }
}
