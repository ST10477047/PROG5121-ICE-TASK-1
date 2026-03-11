# Campus QuickServe Ordering System

## Problem Description
This Java program was created for Campus QuickServe. It captures customer details and order details using JOptionPane dialogs. The program calculates the subtotal, discount, VAT, and final total, then displays a formatted receipt.

## Program Structure
The program contains:
- `Order` class
- `QuickServeApp` main class

### Methods in Order class
- `getSubtotal()`
- `getDiscount()`
- `getVAT()`
- `getTotal()`
- `getItem()`
- `getQuantity()`
- `getPrice()`

## How I Approached the Problem
I first created the basic project setup. After that I added the Order class and input functionality. Then I added the calculation methods for subtotal, VAT, and total. After that I formatted the receipt output. Lastly i added a discount feature for quantities greater than 3.

## OOP Concepts Used
- **Class vs Object:** The `Order` class is used to create an order object.
- **Encapsulation:** Private variables and getter methods are used in the Order class.
- **Constants:** VAT rate and discount rate are stored as constants.
- **Methods:** Separate methods are used to calculate subtotal, discount, VAT, and total.

## Screenshot
<img width="675" height="733" alt="image" src="https://github.com/user-attachments/assets/eed1fc7b-85e1-4f0a-9f7a-dee455a9c022" />
