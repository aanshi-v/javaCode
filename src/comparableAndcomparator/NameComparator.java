package comparableAndcomparator;

import java.util.Comparator;

public class NameComparator implements Comparator<EmpDtoComparator> {

	@Override
	public int compare(EmpDtoComparator o1, EmpDtoComparator o2) {
		return o1.getName().compareTo(o2.getName());
	} 
}
