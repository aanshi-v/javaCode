package comparableAndcomparator;

import java.util.Comparator;

public class IdComparator implements Comparator<EmpDtoComparator> {

	@Override
	public int compare(EmpDtoComparator o1, EmpDtoComparator o2) {
		
		return o1.getEmpid() - o2.getEmpid();
	}

}
