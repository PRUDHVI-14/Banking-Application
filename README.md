# Banking-Application (core java)

This is a simple static Banking Application developed using Core Java. The project aims to simulate basic banking operations such as Loan approval, deposit, withdrawal, checking loand & current balance. It includes object-oriented principles in java.
<br>
<b>Features</b>
<br>
<b>Loan Approval</b>: Allows users to take a loan by providing basic credentials like name, monthly salary, Proffession type and loan amount.
<br>
<b>Deposit</b>: Users can deposit money into their  individual accounts.<br>
<b>Withdrawal</b>: Allows users to withdraw funds from their account, with balance checks.<br>
<b>Balance Inquiry</b>: Check the current balance and Loan pending balance of an account.<br>
<b>User Authentication</b>: Simulates a login system where users authenticate with their credentials.<br>
Technologies Used<br>
<b>Core Java</b>: The application is developed using core Java concepts, including classes, encapsulation, switch statements,methods and multiple classes.<br>
<b>JDK 8 or higher</b>: The project requires Java Development Kit (JDK) version 8 or higher for compiling and running the code.<br>
Prerequisites<br>
Before running the application, ensure you have the following installed:<br>

<b>Java Development Kit (JDK)</b>: Version 8 or higher. You can download it from here.<br>
How to Run the Project<br>
Step 1: Clone the Repository<br>
Clone this repository to your local machine using the following command:<br>

git clone https://github.com/your-username/banking-application.git<br>
Step 2: Compile the Code<br>
Navigate to the project folder and compile the Java files:<br>

cd banking-application<br>
javac *.java
Step 3: Run the Application<br>
After compiling the code, you can run the application using:

java BankingApp<br>
The application will run in the terminal/command line.<br>

<b>project Structure</b><br>

/banking-application<br>
│
├── BankingApp.java          # Main entry point of the application<br>
├── Account.java             # Class for representing user accounts<br>
├── Credentials              # Method for verifying user accNo and Password<br>
├── User_requirements        # Method for users choice like withdraw,deposit,loan and chech balance.<br>
├── Date and Time            # Method for displaying present time of service<br>

<b>Example Usage</b><br>
Bank credentials<br>
it includes present four accounts and related passwords<br>
i.e.,   accNo : 101  & password : 1111<br>
        accNo : 102  & password : 2222<br>
        accNo : 103  & password : 3333<br>
        accNo : 104  & password : 4444<br>
        
The application will prompt you to enter into your specidied account.<br>
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




