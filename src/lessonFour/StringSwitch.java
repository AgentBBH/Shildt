// page 131 - 132

package lessonFour;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("Один");
                break;
            case "два":
                System.out.println("Два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("Не совпало");
                break;
        }
    }
}
