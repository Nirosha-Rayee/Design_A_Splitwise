package com.example.splitwise.strategies;

import com.example.splitwise.models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expenses);
}
