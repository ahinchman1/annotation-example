package bank.transaction.example;

import java.lang.reflect.*;

public class TestAnalyzer {
    /**
     *  Counts the number of methods in the class given by `clazz` that have been annotated
     *  with the @TestAnnotation annotation.
     */
     static int getNumAnnotatedMethods(Class<?> clazz) {
        int annotatedMethods = 0;

       for (Method method: clazz.getDeclaredMethods()) {
            String methodName = method.getName();
            System.out.printf("Analyzing %s:\t", methodName);
            System.out.println("Method annotation present: " + method.isAnnotationPresent(TestAnnotation.class));
            if (method.isAnnotationPresent(TestAnnotation.class)) {
                annotatedMethods++;
            }
        }

        return annotatedMethods;
    }

    public static void main(String[] args) {
        int annotatedMethodCount = getNumAnnotatedMethods(GroceryStore.class);
        System.out.println(annotatedMethodCount);
    }
}