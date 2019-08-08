/**
 * @program: 算法和数据结构
 * @author: YangAiMin
 * @create: 2019-08-08 20:19
 */
public class Text2 {
    //斐波拉契数列 1,1,2,3,5,8,13,21,34,...
    public static void main(String[] args) {
        System.out.println(fibonacci(30));
    }

    //F(n) = F(n-1) + F(n-2)  复杂度为O(2^n)
    public static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
