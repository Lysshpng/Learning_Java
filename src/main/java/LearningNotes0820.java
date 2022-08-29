import java.util.*;

/** 0820
 * 写一个方法
 * 入参数有两个 一个是数字最大值 ，一个是操作类型
 * 比如(5，*), 返回值要是5*4*3*2*1，
 * 操作类型这个参数可以为 "+ - * /"
 */

public class LearningNotes0820 {
    static int sumOpt(int max_num){
        // 递归求解
        if (max_num == 1) {
            return max_num;
        } else{
            return max_num + sumOpt(--max_num);
        }
    }

    static int timesOpt(int max_num) {
        // for求解
        int result = 1;
        for(int i = max_num; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    static int divOpt(int max_num) {
        // while求解
        int result = max_num, idx = max_num - 1;
        while(idx > 0) {
            result /= idx;
            idx -= 1;
        }
        return result;
    }

    public static int operation(int max_num, char opt) {

        if (max_num < 0) {
            System.out.println("max_num must greater than 0.");
            return -1;
        } else if (max_num == 0) {
            return 0;
        }

        switch (opt) {
            case '+':
                return sumOpt(max_num);
            case '-':
                return max_num - sumOpt(max_num-1);
            case '*':
                return timesOpt(max_num);
            case '/':
                return divOpt(max_num);
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("result of max_num: 5 and opt: + : " + operation(5, '+'));
        System.out.println("result of max_num: 0 and opt: - : " + operation(0, '-'));
        System.out.println("result of max_num: 5 and opt: * : " + operation(5, '*'));
        System.out.println("result of max_num: 0 and opt: / : " + operation(0, '/'));

    }

}
