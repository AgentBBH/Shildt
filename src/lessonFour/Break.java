package lessonFour;

import com.sun.javafx.geom.BaseBounds;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                trhird: {
                    System.out.println("Предшевствует оператору break.");
                    if (t) break second;
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}
