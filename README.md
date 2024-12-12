# README for Java Blockchain Program

## Overview
This program demonstrates a simple blockchain implementation in Java. It includes two main components:
1. **Block**: Represents an individual block in the blockchain.
2. **Blockchain**: Manages a list of blocks and simulates mining operations.

## How It Works
- A blockchain is a series of blocks linked together.
- Each block contains:
    - Data (e.g., transactions or messages).
    - A timestamp.
    - A reference to the previous block's hash.
    - A nonce (used for mining).
    - A calculated hash value.
- Blocks are "mined" by solving a cryptographic puzzle: finding a hash with a specified number of leading zeroes (difficulty).

## Code Structure

### Block Class
Located in the `Block` file:
- **Purpose**: Represents a single block in the blockchain.
- **Key Methods**:
    - `calculateHash()`: Generates the block's hash using SHA-256.
    - `mineBlock(int difficulty)`: Mines the block by adjusting the nonce until the hash meets the difficulty criteria.

### Blockchain Class
Located in the `Blockchain` file:
- **Purpose**: Simulates the blockchain.
- **Key Functions**:
    - Creates and mines blocks.
    - Displays the blockchain's contents.

## How to Run

### Prerequisites
1. Java Development Kit (JDK) installed on your system.
2. A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or a terminal.

### Steps
1. Create a Java project and include the `Block` and `Blockchain` files in the same package (e.g., `Day8`).
2. Compile and run the `Blockchain` file.
3. Observe the mining process and the resulting blockchain in the console.

### Example Output
```
Mining block 1...
Block mined! Hash: 0000a1b2c3d...
Mining block 2...
Block mined! Hash: 0000456def7...
Mining block 3...
Block mined! Hash: 00001234abc...
Block Hash: 0000a1b2c3d...
Block Hash: 0000456def7...
Block Hash: 00001234abc...
```

## Customization

### Adjust Difficulty
- Change the `difficulty` variable in the `Blockchain` class to control the number of leading zeroes required in the hash. Higher difficulty makes mining slower.

### Add More Blocks
- Modify the `Blockchain` class to add more blocks by appending additional `Block` objects.

### Change Block Data
- Replace the `data` field with your desired content (e.g., transaction details, messages).


