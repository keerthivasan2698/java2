package javatestv1;

public class BITWISE {
	public static void main(String arg[]){
		// TODO Auto-generated method stub
	        int a = 40; 
	        int b = 50;  

	        // Bitwise AND
	        int bitwiseAnd = a & b; 
	        System.out.println("Bitwise AND: " + bitwiseAnd);

	        // Bitwise OR
	        int bitwiseOr = a | b; 
	        System.out.println("Bitwise OR: " + bitwiseOr);

	        // Bitwise XOR
	        int bitwiseXor = a ^ b; // 
	        System.out.println("Bitwise XOR: " + bitwiseXor);

	        // Bitwise NOT
	        int bitwiseNotA = ~a; //  (two's complement of )
	        System.out.println("Bitwise NOT of A: " + bitwiseNotA);

	        // Left shift
	        int leftShift = a << 1; // 
	        System.out.println("Left shift of A: " + leftShift);

	        // Right shift
	        int rightShift = a >> 1; 
	        System.out.println("Right shift of A: " + rightShift);
	}

}
