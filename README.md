# Design_A_Splitwise
Machine Coding / Low level design (LLD) interview question, design Splitwise (an expense sharing app)

**Create an Expense Sharing Application**

**Requirements:**

1. Users can register and update their profiles

2. A user's profile should contain at least their name, phone number and password

3. Users can participate in expenses with other users

4. Users can participate in groups.

5. To add an expense, a user must specify either the group, or the other users involved in the expense, along with who paid what and who owes what. They must also specify a description for the expense.

6. A user can see their total owed amount

7. A user can see a history of the expenses they're involved in

8. A user can see a history of the expenses made in a group that they're participating in

9. Users shouldn't be able to query about groups they are not a member of

10. Only the user who has created a group can add/remove members to the group

11. Users can request a settle-up. The application should show a list of transactions, which when executed will ensure that the user no longer owes or recieves money from any other user. Note that this need not settle-up any other users.

12. Users can request a settle-up for any group they're participating in. The application should show a list of transactions, which if executed, will ensure that everyone participating in the group is settled up (owes a net of 0 Rs). 
Note that will only deal with the expenses made inside that group. Expenses outside the group need not be settled. Good to Have Requirements

13. When settling a group, we should try to minimize the number of transactions that the group members should make to settle up.

**Note:** All tests will be performed in one go. The application doesn't need to persist data between runs.

