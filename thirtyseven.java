public class thirtyseven {
    public String[] getFormats(int number) {
        String binary = toBinary(number);
        String hexadecimal = toHex(number);
        String octal = toOctal(number);
        
        return new String[]{binary, hexadecimal, octal};
    }
   public String toBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }
  public String toHex(int number) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (number > 0) {
            hex.insert(0, hexChars[number % 16]);
            number /= 16;
        }
        return hex.toString();
    }
 public String toOctal(int number) {
        StringBuilder octal = new StringBuilder();
        while (number > 0) {
            octal.insert(0, number % 8);
            number /= 8;
        }
        return octal.toString();
    }

    public static void main(String[] args) {
     thirtyseven converter = new thirtyseven();
        int number = 123; 
        String[] formats = converter.getFormats(number);
        
        System.out.println("Binary: " + formats[0]);
        System.out.println("Hexadecimal: " + formats[1]);
        System.out.println("Octal: " + formats[2]);
    }
}
