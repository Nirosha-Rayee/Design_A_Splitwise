package com.example.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class ExpenseUser extends BaseModel{
    @ManyToOne
    private User user;

    @ManyToOne
    private Expense expense;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseUserType expenseUserType;

    private int amount;

}
