// 基本構文(変数の宣言)
// 型 変数名;  (宣言しただけでは代入されないので、要注意)

public class Variable01 {

  public static void main(String[] args) {
    int num1;
    String str1;
    num1 = 10;
    str1 = "Hello World!";
    System.out.println(num1);
    System.out.println(str1);

    num1 = 20;
    System.out.println(num1);

    int num2 = 30;
    System.out.println(num2);
  }
}