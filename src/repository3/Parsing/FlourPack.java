package repository3.Parsing;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = bigCount + smallCount;
        if((bigCount < 0 || smallCount < 0 ) || (sum >= goal)) {
            return false;
        }
        while (sum <= goal) {
            bigCount = bigCount * 5;
            smallCount = smallCount * 1;
            sum /= goal;
            
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(5,5,40));
    }
}
