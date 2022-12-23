class solid {

    int volume;

    // public solid(int length, int width, int height){
    // this.length = length;
    // this.width = width;
    // this.height = height;
    // }

    public static int calVolume(int l) {
        int v = l * l * l;
        System.out.println("Volume of cube is: " + v);
        return v;
    }

    public static int calVolume(int a, int h) {
        int v = a * a * h;
        System.out.println("Volume of square prism is: " + v);
        return v;
    }

    public static int calVolume(int w, int l, int h) {
        int v = w * l * h;
        System.out.println("Volume of rectangular prism is: " + v);
        return v;
    }
}

public class volumeOverload {
    public static void main(String args[]) {

        solid cube = new solid();
        cube.volume = solid.calVolume(5);

        solid squarePrism = new solid();
        squarePrism.volume = solid.calVolume(5, 6);

        solid rectangularPrism = new solid();
        rectangularPrism.volume = solid.calVolume(5, 6, 7);
    }

}
