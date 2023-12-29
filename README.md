# ATM_Interface ( TASK 3 ) 

## Description:
The ATM Interface project, developed during my internship at Codsoft, simulates an ATM machine's functionalities. It provides options for withdrawing, depositing, and checking the account balance.

## Features:
- User Interface: Design that includes options for withdrawing, depositing, and checking the balance.
- Function Implementation: Methods like `withdraw(amount)`, `deposit(amount)`, and `checkBalance()` are implemented.
- Bank Account Representation: A class representing the user's bank account, storing the account balance.
- Integration: Connects the ATM class with the user's bank account class to access and modify the balance.
- **nput Validation: Validates user input to ensure it meets acceptable limits (e.g., sufficient balance for withdrawals).
- **User Feedback:** Displays appropriate messages based on user-selected options and the success or failure of transactions.

## How to Run:
To run the ATM Interface, follow these steps:
1. **Compile:** Compile the Java file(s) using a Java compiler.
   ```bash
   javac ATMInterface.java BankAccount.java
