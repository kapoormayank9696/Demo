// Floyd's Triangle is a right-angled triangularAlgorithm Implementation In Java
public class Floyds_Triangle {
    public static void main(String[] args) {
        int n = 5;
        int p,q;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                p = 0;
                q = 1;
            }else {
                p = 1;
                q = 0;
            }
            for (int j = 1; j <= i; j++) {
                if(j % 2 == 0) {
                    System.out.print(p);
                }else {
                    System.out.print(q);
                }
            }
            System.out.println();
        }
    }
}
