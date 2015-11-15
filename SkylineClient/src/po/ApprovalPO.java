package po;

import java.util.List;

//����δͨ������
public class ApprovalPO extends Message{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<String> code;

	public ApprovalPO(List<String> code) {
		super();
		this.code = code;
	}

	public List<String> getCode() {
		return code;
	}

	public void setCode(List<String> code) {
		this.code = code;
	}
	
}
