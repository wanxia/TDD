
public class Life {

	/**
	 * @param a ����
	 * @return ����ת�����ַ���
	 */
	public String convertArray2Str(int[][] a) {
		return "";
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
