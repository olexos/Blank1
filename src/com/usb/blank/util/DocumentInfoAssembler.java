package com.usb.blank.util;

import java.util.HashMap;
import java.util.Map;

import com.usb.blank.bean.DocumentInfoBean;
import com.usb.blank.dto.DepartmentDto;

public class DocumentInfoAssembler {

	public static void fillDocumentInfo(DocumentInfoBean docInfoDto) {
		docInfoDto.setSurname("Вейдер");
		docInfoDto.setName("Дарт");
		docInfoDto.setSecondname("Вікторович");
		docInfoDto.setTabNum(new Integer(40242).toString());
//		docInfoDto.setTabNum("40242");		
		docInfoDto.setIdentCode("0123421109");
		Map<Integer, DepartmentDto> departments = new HashMap<Integer, DepartmentDto>();
		departments.put(1, new DepartmentDto(1, "Блок управління ризиками", "Ключинський Костянтин Леонідович", "Керівник блоку управління ризиками")); 
		departments.put(2, new DepartmentDto(2, "Департамент операцій зі спеціальними кредитами клієнтів корпоративного бізнесу", "Меренков Олександр Олександрович", "Керівник департаменту операцій зі спеціальними кредитами клієнтів корпоративного бізнесу"));
		departments.put(3, new DepartmentDto(3, "Управління роботи з проблемною заборгованістю клієнтів корпоративного бізнесу", "Бабенко Наталія Володимирівна", "Керівник управління роботи з проблемною заборгованістю клієнтів корпоративного бізнесу"));
		departments.put(4, new DepartmentDto(4, "Відділ роботи з проблемною заборгованістю клієнтів корпоративного бізнес у Північного та Західного комерційного макрорегіону", null, null));
		departments.put(5, new DepartmentDto(5, "Відділ по роботі з великими корпоративними клієнтами роздрібної торгівлі , споживчих товарів та спеціальних рахунків", null, null));
		docInfoDto.setDepartments(departments);
	}
	
	
//	36000065	����������� ��������� ���������	Workout Administrator Expert	��������� ����� ��	���� ��������� ��������	����������� �������� � ������������ ��������� �볺��� �������������� � ������	��������� ������ � ���������� ������������� �볺��� �������������� � �����	³��� ������ � ���������� ������������� �볺��� �������������� ����� � ϳ������� �� ��������� ������������ �����������				29.04.2009	2777014232	��	665432	������������ �� �� ��� ������ � ������ ���	28.10.2004	
	

}