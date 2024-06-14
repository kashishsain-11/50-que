public class twentyseven {

    public static String findTriangle(int side1, int side2, int side3) {
        if (side1 == 0 || side2 == 0 || side3 == 0) {
            return "-1";
        }
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            return "-2";
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "-3";
        }
        if (side1 == side2 && side2 == side3) {
            return "EQUILATERAL";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "ISOSCELES";
        } else {
            return "SCALENE";
        }
    }
    public static void main(String[] args) {
        System.out.println(findTriangle(3, 4, 5));  
    }
}
