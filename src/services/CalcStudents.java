package services;

import java.util.HashSet;
import java.util.Set;

public class CalcStudents<Type> {

	Set<Type> setA = new HashSet<>();
	Set<Type> setB = new HashSet<>();
	Set<Type> setC = new HashSet<>();

	public CalcStudents() {

	}

	public Set<Type> getSetA() {
		return setA;
	}

	public Set<Type> getSetB() {
		return setB;
	}

	public Set<Type> getSetC() {
		return setC;
	}

	public void preenche(Type name, char turma) {
		if (turma == 'A' || turma == 'a') {
			setA.add(name);
		} else {
			if (turma == 'B' || turma == 'b') {
				setB.add(name);
			} else {
				if (turma == 'C' || turma == 'c') {
					setC.add(name);
				}
			}
		}
	}

	public void print() {
		System.out.println();
		for (Type T : setA) {
			System.out.println("Name " + T);
		}
		System.out.println();
		for (Type T : setB) {
			System.out.println("Name " + T);
		}
		System.out.println();
		for (Type T : setC) {
			System.out.println("Name " + T);
		}
	}

	public int cont() {
		Set<Type> total = new HashSet<>(setA);
		total.addAll(setB);
		total.addAll(setC);

		return total.size();
	}

}
