package businesslogic.infobl;

import vo.InstitutionVO;
import po.InstitutionPO;

public class Institution {
	private String Category; //����
	private String name;	//����
	private String position;//λ��
	private String code;	//���
	private InstitutionPO po;
	
	public Institution(InstitutionVO vo){
		this.setCategory(vo.getCategory());
		this.setName(vo.getName());
		this.setPosition(vo.getPosition());
		this.setCode(vo.getCode());
	}

	public boolean saveInfo(){
		return true;
	}
	
	public Institution(String code){
		if(inquireInfo(code)){
			this.Category=po.getKinds();
			this.name=po.getName();
			this.position=po.getSituation();
			this.code=po.getID();
		}else{
			System.err.println("��ѯ����");
		}
	}
	
	public boolean modify(){
		return true;
	}
	public static boolean delete(String institutionCode){
		return true;
	}
	private boolean inquireInfo(String code){
		return true;
	}
	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
