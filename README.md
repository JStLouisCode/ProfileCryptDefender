# ProfileCryptDefender
Java application that offers secure user profile management with password hashing using the SHA-256 algorithm. This project showcases user registration, login authentication, and profile display functionalities. The application ensures that user passwords are stored securely through hashing, making it a robust solution for managing user data.

## Introduction
ProfileCryptDefender focuses on providing a secure and user-friendly profile management experience. With an emphasis on password security, the application ensures that user passwords are never stored in plaintext, mitigating potential security breaches.

## Features
..* User Registration: Create a profile with your first name, last name, date of birth, and password.
..* Secure Password Storage: Utilizes the SHA-256 hashing algorithm to store passwords as irreversible hashes.
..* User Login: Log in with your username and password to access your profile.
..* Profile Display: View your profile information, including your name, date of birth, and last logged-in time.

## Getting Started
### Prerequisites 
..* Java Development Kit (JDK) installation.
### Installation
1. Clone or download the ProfileCryptDefender repository.
2. Open the project in your preferred Java IDE.
3. Build and run the 'Main' class to start the application.

## Usage
1. Upon starting, follow the prompts to create a user profile by providing your first name, last name, date of birth, and password.
2. After registering, use your chosen username and password to log into your profile.
3. Once logged in, you can view your profile details, including your name, date of birth, and the last time you logged in.

## Password Hashing 
ProfileCryptDefender ensures the security of user passwords through the SHA-256 hashing algorithm. Here's how it works:

1. When a user registers or updates their password, the system generates a cryptographic hash of the password using SHA-256.
2. The hash is a fixed-length string of characters that is unique to the input data (password).
3. The hash is stored in the database instead of the actual password, making it impossible to retrieve the original password from the hash.
4. During login, the entered password is hashed using the same SHA-256 algorithm and compared against the stored hash. If they match, access is granted.

## Technologies Used
..* Java
..* MessageDigest class for password hashing
..* LocalDateTime class for date and time management

## Contributing
Contributions to the ProfileCryptDefender are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request on the project's repository.

## License

The ProfileCryptDefender is open source and distributed under the MIT License. You are free to modify and distribute the code as per the terms of the license.
