package CodingBat.String1;

public class extraEndPractice {
    public String extraEnd(String str) {

        if(str.length()>2) {
            String substring = str.substring(str.length() - 2);
            return substring+substring+substring;
        }
        return str+str+str;
    }

    public static void main(String[] args) {
        extraEndPractice ee = new extraEndPractice();
        System.out.println(ee.extraEnd("code"));
    }
}
