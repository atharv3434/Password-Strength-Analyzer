# Password-Strength-Analyzer


A console-based password strength analyzer that evaluates passwords, detects security weaknesses, and suggests improvements using AI-powered pattern recognition.

📌 Key Features
✔ Analyzes Password Strength (Weak, Medium, Strong) 🔍
✔ Checks for Common Weaknesses (Length, Symbols, Numbers, Repetition) ⚠️
✔ Detects Dictionary-Based Passwords & Common Leaks 📜
✔ Generates Secure Password Suggestions 🔑
✔ Offline & Works Without Internet 🚀

📂 Project Structure

PasswordStrengthAnalyzer/
│── PasswordAnalyzer.java    (Main Logic)
│── PasswordEvaluator.java   (Checks Password Strength)
│── PasswordGenerator.java   (Suggests Strong Passwords)
│── common_passwords.txt     (List of Common Passwords)

🎯 How It Works?
Analyze Password Strength 🔍

Detects length, character types, and common weaknesses

Checks for Leaked Passwords 🛑

Uses common_passwords.txt to detect compromised passwords

Generate Secure Passwords 🔑

Suggests randomized strong passwords

🚀 How to Run?
Download common_passwords.txt with common passwords

Compile: javac *.java

Run: java PasswordAnalyzer

Analyze Passwords & Generate Secure Ones! 🔐

🎯 Future Enhancements
✔ 🌍 Dark Web Breach Check (API Integration)
✔ 📧 Email Alerts for Weak Passwords
✔ 🎨 GUI Version (Java Swing for Better UX)
