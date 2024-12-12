# Banking-Application (core java)

This is a simple static Banking Application developed using Core Java. The project aims to simulate basic banking operations such as Loan approval, deposit, withdrawal, checking loand & current balance. It includes object-oriented principles in java.
<br>
<b>Features</b>
<br>
<b>Loan Approval</b>: Allows users to take a loan by providing basic credentials like name, monthly salary, Proffession type and loan amount.

<b>Deposit</b>: Users can deposit money into their  individual accounts.
<b>Withdrawal</b>: Allows users to withdraw funds from their account, with balance checks.
<b>Balance Inquiry</b>: Check the current balance and Loan pending balance of an account.
<b>User Authentication</b>: Simulates a login system where users authenticate with their credentials.
Technologies Used
<b>Core Java</b>: The application is developed using core Java concepts, including classes, encapsulation, switch statements,methods and multiple classes.
<b>JDK 8 or higher</b>: The project requires Java Development Kit (JDK) version 8 or higher for compiling and running the code.
Prerequisites
Before running the application, ensure you have the following installed:

<b>Java Development Kit (JDK)</b>: Version 8 or higher. You can download it from here.
How to Run the Project
Step 1: Clone the Repository
Clone this repository to your local machine using the following command:

bash
Copy code
git clone https://github.com/your-username/banking-application.git
Step 2: Compile the Code
Navigate to the project folder and compile the Java files:

bash
Copy code
cd banking-application
javac *.java
Step 3: Run the Application
After compiling the code, you can run the application using:

bash
Copy code
java BankingApp
The application will run in the terminal/command line.

<b>project Structure</b>
bash
Copy code
/banking-application
│
├── BankingApp.java          # Main entry point of the application
├── Account.java             # Class for representing user accounts
├── Credentials              # Method for verifying user accNo and Password
├── User_requirements        # Method for users choice like withdraw,deposit,loan and chech balance.
├── Date and Time            # Method for displaying present time of service

<b>Example Usage</b>
Bank credentials
it includes present four accounts and related passwords
i.e.,   accNo : 101  & password : 1111
        accNo : 102  & password : 2222
        accNo : 103  & password : 3333
        accNo : 104  & password : 4444
        
The application will prompt you to enter into your specidied account.
Example:
enter accNo and password
it displays different options for check balance, withdraw, deposit and loan.
choose the related option
You can deposit money by entering an amount when prompted.
Example:
Enter deposit amount: 500
Making a Withdrawal:

You can withdraw funds, as long as your balance is sufficient.
Example 
Enter withdrawal amount: 200
Transfer Funds:
you can take loan,as long as you are eligible.
eligible crireria-salary should greater than 30k ,previous loan should zero and you must and should working profession.
example
enter your name,salary and working profession.
enter loan amount: 300000/-
<b>how to access the repository</b>
Fork the repository
Create a new branch (git checkout -b feature-branch).
Make your changes.
Commit your changes (git commit -am 'Add new feature').
Push to the branch (git push origin feature-branch).
Open a pull request.

<b>Contact</b>
If you have any questions, feel free to contact me:

<b>Email</b>: prudhvibandipandu@gmail.com
<b>GitHub</b>: PRUDHVI-14
Feel free to modify and expand this README as needed based on the specific features and structure of your banking application.



