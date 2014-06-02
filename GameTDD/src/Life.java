
public class Life {

	/**
	 * @param a ��ǰ����״̬����
	 * @return wrappedArray �к��ж���2�İ�װ����
	 */
	public int[][] wrapArray(int[][] a){
		int row = a.length;
		int col = a[0].length;
		int[][] wrappedArray = new int[row+2][col+2];
		
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
