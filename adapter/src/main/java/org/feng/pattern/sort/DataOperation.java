package org.feng.pattern.sort;

import java.util.Arrays;

/**
 * 数据操作<br>
 *     使用默认实现，可选择的实现某个方法。
 *     适配器的扩展使用。
 *
 * @author Feng
 * @date 2020/5/5 10:06
 */
public interface DataOperation {
    /**
     * 排序
     * @param array 要排序的数组
     */
    default void sort(int[] array){
        Arrays.sort(array);
    }
    /**
     * 查找
     * @param array 目标所在的数组（也可能不在）
     * @param key 目标
     * @return 目标的下标
     */
    default int search(int[] array, int key){
       return Arrays.binarySearch(array, key);
    }
}
