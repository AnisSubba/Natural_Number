
public class problem1 {
    public static void main(String[] args){
        int sum = 0, t = 1000;
        for (int i = 0; i < t; i++){
            if ((i % 3 == 0 || i % 5 == 0))
                sum += i;
        }
        System.out.println(sum);
    }
}

