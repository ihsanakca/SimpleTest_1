import org.testng.annotations.Test;

public class TestJenkins2 {

    @Test
    public void test2(){
        countDown(10);
    }
    public static void countDown(int n){
        if (n>0) {
            System.out.println(n);
            n--;
            countDown(n);
        }else{
            System.out.println("Finished!!!");
        }
    }
}
