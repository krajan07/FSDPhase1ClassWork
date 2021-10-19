package cw_dataStructures_16Oct;

public class arrayRotate_Assignment {

	public static void main(String[] args) {
		
		int[] a1 = {90,43,32,21,88};
		
		System.out.println("-----Original Array-------");
		for(int i=0; i < a1.length; i++) {
			System.out.println("Index : " +i+ " & Value : " +a1[i]);
		}
		
		int rotation=3;
		for(int i = 0; i < rotation; i++){    
            int j, k;       
            k = a1[a1.length-1];    
            for(j = a1.length-1; j > 0; j--){     
                a1[j] = a1[j-1];    
            }     
            a1[0] = k;    
        }    
		
		System.out.println("-----3x rotated Array------");
		for(int i=0; i < a1.length; i++) {
			System.out.println("Index : " +i+ " & Value : " +a1[i]);
		}

	}

}
