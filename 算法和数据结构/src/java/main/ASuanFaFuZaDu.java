/**
 * @program: 算法和数据结构
 * @author: YangAiMin
 * @create: 2019-08-08 19:55
 */

//算法复杂度计算
public class ASuanFaFuZaDu {
    public static void main(String[] args) {
        /*
        * O(1):Constant Complexity:Constant常数复杂度
        * O(log n):Longarithmic Complexity:对数复杂度
        * O(n):Linear Complexity:线性时间复杂度
        * O(n^2) N square Complexity 平方
        * O(n^3) N square Complexity 立方
        * O(2^n):Exponential Growth 指数
        * O(n!):Factorial 阶乘
        * 只看最高复杂度的运算
        */
        //举例说明:O(1)
        int n = 1000;
        System.out.println(n);

        //举例说明:O(N)
        for (int i = 1; i <= n;i++){
            System.out.println(i);
        }

        //举例说明:O(N^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+""+j);
            }
        }
        //举例说明:O(log(n))
        for (int i = 0; i < n; i=i*2) {
            System.out.println(i);
        }
        //举例说明:O(K^N)
        for (int i = 0; i < Math.pow(2,n); i++) {
            System.out.println(i);
        }

    }
}
