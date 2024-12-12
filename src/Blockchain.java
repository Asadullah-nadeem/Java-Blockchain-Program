import java.util.ArrayList;

public class Blockchain {
    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<>();
        int difficulty = 4;

        System.out.println("Mining block 1...");
        Block block1 = new Block("Block 1 Data", "0");
        block1.mineBlock(difficulty);
        blockchain.add(block1);

        System.out.println("Mining block 2...");
        Block block2 = new Block("Block 2 Data", block1.getHash());
        block2.mineBlock(difficulty);
        blockchain.add(block2);

        System.out.println("Mining block 3...");
        Block block3 = new Block("Block 3 Data", block2.getHash());
        block3.mineBlock(difficulty);
        blockchain.add(block3);

        // Display the blockchain
        for (Block block : blockchain) {
            System.out.println("Block Hash: " + block.getHash());
        }
    }
}

