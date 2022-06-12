public class JumpingClouds {
    public static void main(String[] args) {
        int [] clouds = {0, 0, 1, 0, 0, 1, 0};
        int count = 0;
        for (int i = 0; i < clouds.length - 1; i++) {
            if (clouds[i] == 0) i++;
            count++;
        }
        System.out.println(count);

    }
}
