/**
 * @program: 算法和数据结构
 * @author: YangAiMin
 * @create: 2019-08-08 20:11
 */
public class Text1 {
    //计算：1+2+3+...+n
    public static void main(String[] args) {
        System.out.println(getSum(10));
        System.out.println(getSum1(10));

    }


    //总共累加n次  复杂度为n
    public static int getSum(int n){
        int y = 0;
        for (int i = 1; i <= n; i++) {
            y = y +  i;
        }
        return y;
    }


    //利用求和公式：n(n+1)/2  复杂度为1
    public static int getSum1(int n){
        return n*(n+1)/2;
    }


}
