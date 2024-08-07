# GYM-Membership-System

## Description
This is a Java implementation of the GYM Membership System. MySQL database is used in this project. 

The GYM Membership system allows users to:
- Sign in to the GYM Membership System
- Login to view and change their informations.
- Secret admin access for accessing the members' informations, signing up new ones, and accessing the database tables. 

## Installation
- Firstly, database must be injected to MySQL. You must create a new schema and name it as 'gymmembership'.
- Then, you have to import the dump file named 'DATABASEE' that we provided in the files.
- After that, you have to open the project through your Java IDE. (Netbeans recommended.)
- Then you have to import the database connector into your project libraries. The database connector is also provided in the project files. ('mysql-connector-j-8.1.0.jar')
- To gain access to your database you must change your username and password as your MySQL root name and password in 'DatabaseConnector.java' file.
- Finally, you can run the project trough 'GYM_Project.java' file and enjoy the GYM Membership System.

## How To Use
After you run the 'GYM_Project.java' the login screen welcomes you. 

In this screen you can sign up, log into your account as a customer or you can log in as admin. 

  ### Admin Login
   To login as admin you should enter admin as both username and password. Admin panel let's user to:
      - View database tables (gym, personal trainer, member, membership)
      - Sign up a new person into the GYM.
      - Go to the person's page with only their IDs. (without password)
  ### Sign Up
   This button directs user to the sign up page where the user gives their information to sign up to the GYM.
   
   User must fill all the information to sign up. 
      PERSONAL INFORMATIONS: Name, Surname, ID, Phone Number
      MEMBERSHIP INFORMATIONS: Branch Name, Membership Type, Membership Duration, Personal Trainer selection
      PHYSICAL INFORMATIONS: Height, Weight

  !! NOTE: After the user completes their sign up their username will be set as their ID and their password will be set as their Phone Number.

  ### Login
   To access to their information, user must login to the GYM Membership System with their Username (ID) and their password (Phone Number).
   
   If the user logs in successfully, 'MembershipInformation.java' screen will welcome them.
      In this screen they can see their personal informations, informations about their membership, and their pyhsical informations.
      They can also change their personal trainer, and edit their Weight and Height if they are changed.
      And finally, they can delete their account if they wish.
        


## Contributing
Contributions are welcome! If you'd like to improve this Minesweeper game, feel free to fork this repository and submit a pull request with your changes.




## Credits
- [Ayberk Karagöz](https://github.com/AyberKrgz)
- Gül Yasemin
- İrem Beşiroğlu
- Oğuzhan Altın
