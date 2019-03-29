package mani.github;

public class Array {

	public static void main(String[] args) {
		
	int xy[][]= {{3,4,5},{7,8,9},{4,4,0}};
	int min=xy[0][0];
	int minimumcolum=0;
	for (int i = 0; i < xy.length; i++) {
		for (int j = 0; j < xy.length; j++) {
		if (xy[i][j]<min) {
			min=xy[i][j];
			minimumcolum = j;			
		}
		}
		
	}
	
	int k=0;
	int max=xy[0][minimumcolum];
	
	while (k<2) {
		if(xy[k][minimumcolum]>max) {
			max=xy[k][minimumcolum];
		}
		k++;			
	}
	System.out.println(max);
	
	}

}
