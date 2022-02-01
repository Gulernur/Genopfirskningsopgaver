package Square;

public class Square {

    public String squareMaker(int number, String thing){
        String line = "";
        String square = "";
        for (int i = 0; i < number; i++) {
            line = line + " " + thing + " ";
        }
        for (int i = 0; i < number; i++) {
            square = square + "\n" + line;

        }
        return square;
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.squareMaker(6, "*"));
    }
}
