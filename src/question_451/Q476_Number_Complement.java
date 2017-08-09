package question_451;

public class Q476_Number_Complement {
	 public int findComplement(int num) {
	        if(num == 0)
	            return ~num;
	            
	        // create mask
	        int mask = ~Integer.MAX_VALUE;
	        while((mask & num) == 0 ) {
	            mask >>= 1;
	        }
	        mask = (~mask)<<1-1;
	        
	        return ~num & mask;
	    }
}

/**
 * - find 1st non 0 bit 
 * - create mask m
 * - flip number = n2
 * - n2 & m
 * 
 * num  =  0...0001101
 * m    =  0...0001111
 * n2   =  1...1110010
 * n2&m =  0...0000010
 */