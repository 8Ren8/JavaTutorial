import pack.subDirectory.packtest;

public class packtestB {
    public static void main(String args[]) {
        // packtest ptObj = new packtest(10, 20, 40);
        packtest ptObj = new packtest();
        ptObj.insert(10, 20, 301);
        ptObj.display();
    }
}
