package org.feng.pattern.sort;

import java.util.Arrays;

/**
 * 测试
 *
 * @author Feng
 * @date 2020/5/5 10:20
 */
public class Client {
    public static void main(String[] args) {
        DataOperation operation = new OperationAdapter();
        int[] array = {1,3,2,8,5,7,6};

        System.out.println(operation.search(array, 2));
        operation.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
