public class Increment_Decrement {
    public static void main(String[] args) {
        int k = 5;
        k = k ++ + --k + ++ k + k-- + --k; // 5 + 5 + 6 + 6 + 4 => k = 26
        k = ++ k + 2 - --k - 3 + k ++ + 4; // 27 + 2 - 26 - 3 + 26 + 4 => 30
        k = ++ k + ++ k + ++ k + k-- -6; //  31 + 32 + 33 + 33 - 6 = 123
        k = k ++ + k + k-- + k-- + -- k + k ++ - --k + k ++ - k-- + k - --k + k ++ + ++ k; // 123+124+124 + 123 + 121 + 121 +121 = 857
    }
}
