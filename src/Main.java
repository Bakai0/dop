import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            int [] sum = {8, -2, 2, 6, 7, -4};

            boolean cllas = false;
            int buf;
            while(!cllas) {
                cllas = true;
                for (int i = 1; i < sum.length; i++) {
                    if(sum[i] < sum [i-1]){
                       cllas = false;
                        buf = sum [i];
                        sum [i] = sum [i-1];
                         sum [i-1] = buf;
                    }
                }
            }
        System.out.println(Arrays.toString(sum));

    }
    }

