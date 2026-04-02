import java.util.*;
import java.util.concurrent.*;

public class PrimeFinder {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        int limit = 50;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<List<Integer>>> futures = new ArrayList<>();
        int chunk = limit / 3;
        for (int i = 0; i < 3; i++) {
            final int start = i * chunk + 2;
            final int end = (i == 2) ? limit : start + chunk;
            futures.add(executor.submit(() -> {
                List<Integer> primes = new ArrayList<>();
                for (int n = start; n < end; n++) if (isPrime(n)) primes.add(n);
                return primes;
            }));
        }
        for (Future<List<Integer>> f : futures) System.out.println(f.get());
        executor.shutdown();
    }
}
