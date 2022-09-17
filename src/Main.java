public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        numbers [0]= 1;
        int festNunber = numbers[0];
        System.out.println(festNunber);
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        int fest=0;
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
    }
}