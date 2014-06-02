
public class Life {

	/**
	 * @param a 数组
	 * @return 数组转换成字符串
	 */
	public String convertArray2Str(int[][] a) {
		return "";
	}
	
	/**
	 * @param currentState 当前状态0-dead/1-alive
	 * @param neighborCount 邻居数
	 * @return lifeState 下一次生命状态 true/false
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
