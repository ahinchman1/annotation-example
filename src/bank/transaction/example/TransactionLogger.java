package bank.transaction.example;

import java.lang.annotation.*;

// responsible for logging bank transactions

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_PARAMETER})
public @interface TransactionLogger {
    String transaction() default "Withdrawal";
    String user() default "John Smith";
    String time() default "01-01-2018 00:00:00";
    double accountBalance() default 0.00;
    double amount() default 0.00;
}