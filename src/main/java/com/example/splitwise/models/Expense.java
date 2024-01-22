package com.example.splitwise.models;

import com.example.splitwise.dtos.UserDTO;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter

public class Expense extends BaseModel{
    private String description;
    private int amount;

    @ManyToOne
    private User createdBy;

    @OneToMany(mappedBy = "expense")
    private List<ExpenseUser> expenseUsers;

    @ManyToOne
    private Group group;

    @ElementCollection
    private Map<User, Integer> paidBy;

    @ElementCollection
    private Map<User, Integer> hadToPay;


    public Expense(UserDTO dto, UserDTO dto1, int abs) {

        super();
    }

    public Expense() {
        super();
    }
}
