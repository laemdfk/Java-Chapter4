// ・自分の名前を「String」型の変数に代入して出力
// ・好きな言葉を同じ変数に再代入して出力
// ・ラッキーナンバーとして「int」型で宣言した定数を出力

// 基本構文　　　型 変数名 = 代入するデータ;
public class Chapter4 {

 
  public static void main(String[] args) {
      final int LUCKY_NUMBER = 6;
        String str = "Kaapa";  // String型の変数strを宣言
        System.out.println(str);
        str = "我成す事は我のみぞ知る";
        System.out.println(str);
      System.out.println(LUCKY_NUMBER);
  }
}