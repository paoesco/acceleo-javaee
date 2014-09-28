package com.jeetemplates.acceleo.utils;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Stereotype;

public class UMLServices {

	@SuppressWarnings("rawtypes")
	public static Stereotype getStereotype(org.eclipse.uml2.uml.Class clazz,
			String stereotypeName) {
		EList stereotypes = clazz.getAppliedStereotypes();
		for (Iterator i = stereotypes.iterator(); i.hasNext();) {
			Stereotype stereotype = (Stereotype) i.next();
			if (stereotype.getName().equals(stereotypeName)) {
				return stereotype;
			}
		}
		return null;
	}

	public static boolean hasStereotype(org.eclipse.uml2.uml.Class clazz, String stereotypeName) {
		Stereotype stereotype = getStereotype(clazz, stereotypeName);
		return (stereotype != null);
	}

}
