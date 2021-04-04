/**
 * Author: Ziwei Wu
 * This was an attempt to make the Aha code into OOP
 */
public class AhaJava {
    /**
     * For registers:
     * Right now, we are assuming that the userFunc only has one argument
     * Index 0 = input, everything else is used by the instructions(?)
    */
    public static final int[] registers = new int[33];
    public static void main(String[] args) {
        //TODO: how to get every single possible 
    }
    /**
     * This is the function that the user wants to optimize
     * @param x Any 32-bit integer
     * @return Whatever the user wants
     */
    public static int userFunc(int x) {
        return x+1;
    }
}

/**
 * The interface for the instructions
 */
interface Instruction{
    /**
     * Run the instruction of this class, put the result into output register, and return the result
     * @param operands An integer array representing the operands. Index 0 = the output register and the rest are used to calculate the output.
     * @return A 32-bit integer
     */
    public int simulate_inst(int[] operands);

    /**
     * Get the number of possible ways to swap the inputs or all possible inputs known by this class (mostly just immediates).
     * All possible ways to use the registers as inputs will have to be determined elsewhere.
     * @return Number of possible ways to perform this operation that is known by the class.
     */
    public int get_number_of_possibilities(); //Ideally, this should be static so that we do not have to create a new instance just to get this
                                            //Maybe make a table instead?

    /**
     * Get the number of operands that this instruction takes (including the output register)
     * @return Number of operands that this instruction takes
     */
    public int get_number_of_operands();

}

/**
 * The class implementation for the "and" instruction
 */
class And implements Instruction{

    public And(int possibility_num){/*do nothing because it only has one possibility*/}

    @Override
    public int simulate_inst(int[] operands) {
        int answer = AhaJava.registers[operands[1]] & AhaJava.registers[operands[2]];
        AhaJava.registers[operands[0]] = answer;
        return answer;
    }

    @Override
    public int get_number_of_possibilities() {return 1;}

    @Override
    public int get_number_of_operands() {return 3;}

}