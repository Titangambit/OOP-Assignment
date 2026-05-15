public class Logical {
    public static void main(String[] args) {
        System.out.println((100 > 130) && (460 > 500));
        System.out.println((180 > 130) && (460 < 500));

        System.out.println((240 < 200) || (90 > 70));
        System.out.println((240 > 200) || (90 < 70));
        System.out.println((240 < 200) || (90 < 70));

        System.out.println(!(120 == 80));
        System.out.println(! (120 > 800));
    }
}
