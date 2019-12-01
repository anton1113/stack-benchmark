package com.arash.bench;

public class StackBenchmark {

    private static final int MILLION = 1_000_000;
    private static final int TEN_MILLION = 10 * MILLION;
    private static final int HUNDRED_MILLION = 100 * MILLION;
    private static final int BILLION = 1_000 * MILLION;

    public static void main(String[] args) {
        testStackPerformance(new LinkedStack<>());
        testStackPerformance(new ArrayStack<>());
    }

    private static void testStackPerformance(Stack<Integer> stack) {
//        performBenchmark(stack, MILLION);
//        performBenchmark(stack, TEN_MILLION);
//        performBenchmark(stack, HUNDRED_MILLION);
        performBenchmark(stack, BILLION);
    }

    private static void performBenchmark(Stack<Integer> stack, int pushCount) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < pushCount; i++) {
            stack.push(0);
        }
        long finishPush = System.currentTimeMillis();
        System.out.printf("Stack type=%s, push count=%d, push time millis=%d\n",
                stack.getClass().getSimpleName(), pushCount, finishPush - startTime);
        for (int i = 0; i < pushCount; i++) {
            stack.pop();
        }
        long finishPop = System.currentTimeMillis();
        System.out.printf("Stack type=%s, pop count=%d, pop time millis=%d\n\n",
                stack.getClass().getSimpleName(), pushCount, finishPop - finishPush);
    }
}
