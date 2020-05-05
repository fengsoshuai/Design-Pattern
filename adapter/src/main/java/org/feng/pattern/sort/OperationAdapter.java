package org.feng.pattern.sort;

/**
 * 适配器：
 * 这里的接口的实现可以不实现，当不实现时就使用默认的实现方式。
 *
 * @author Feng
 * @date 2020/5/5 10:17
 */
public class OperationAdapter implements DataOperation {

    @Override
    public void sort(int[] array) {
        new QuickSort().quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return new BinarySearch().binarySearch(array, key);
    }
}
