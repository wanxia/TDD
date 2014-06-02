
public class Life {

	/**
	 * @author 
	 * @param a ��ǰ����״̬����
	 * @return a ��һ����״̬����
	 */
	public int[][] lifeEvolution(int[][] a) {
		Life life = new Life();
		int[][] wrappedArray = life.wrapArray(a);
		
		int row = a.length;
		int col = a[0].length;
		int neighborCount = 0;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				
				neighborCount = wrappedArray[i-1][j-1] + wrappedArray[i-1][j] + wrappedArray[i-1][j+1]
							   + wrappedArray[i][j-1] + wrappedArray[i][j+1] 
							   + wrappedArray[i+1][j-1] + wrappedArray[i+1][j] + wrappedArray[i+1][j+1];
				a[i-1][j-1] = life.nextState(wrappedArray[i][j], neighborCount)? 1 : 0;
			}
		}
		
		return a;
	}
	
	/**
	 * @author 
	 * @param a ��ǰ����״̬����
	 * @return wrappedArray �к��ж���2�İ�װ����
	 */
	public int[][] wrapArray(int[][] a){
		int row = a.length;
		int col = a[0].length;
		int[][] wrappedArray = new int[row+2][col+2];
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				wrappedArray[i][j] = a[i-1][j-1];
			}
		}
		
		return wrappedArray;
	}
	
	/**
	 * @param a ����
	 * @return ����ת�����ַ���
	 */
	public String convertArray2Str(int[][] a) {
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				sb.append(a[i][j]);
			}
		}
		
		return sb.toString();
	}
	
	/**
	 * @param currentState ��ǰ״̬0-dead/1-alive
	 * @param neighborCount �ھ���
	 * @return lifeState ��һ������״̬ true/false
	 */
	public boolean nextState(int currentState, int neighborCount) {
		if(currentState==0) {
			if(neighborCount==3) {
				return true;
			}else {
				return false;
			}
		}else {
			if(neighborCount==2 || neighborCount==3) {
				return true;
			}else {
				return false;
			}
		}
	}
}
