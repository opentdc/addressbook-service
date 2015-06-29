/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Arbalo AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.opentdc.addressbooks;

import java.util.HashMap;
import java.util.Map;

public enum OrgType {
	COMP("joint-stock company"),		// AG, Aktiengesellschaft
	LTD("limited liability company"),	// GmbH
	COOP("cooperative"),				// Genossenschaft
	SOLE("sole proprietorship"),		// Einzelfirma
	CLUB("club"),						// Verein
	TEAM("team"),						// Mannschaft
	ASSOC("association"),				// Verband
	ORGUNIT("organizational unit"), 	// OE, Organisationseinheit 
	OTHER("other organization type");	// anderer Organisationstyp
		
	private String label;
	private static Map<String, OrgType> stringToEnumMapping;

	/**
	 * Constructor.
	 * @param label the label of the orgType.
	 */
	private OrgType(String label) {
		this.label = label;
	}
	
	/**
	 * Returns the orgType based on its label.
	 * @param label the label of the orgType.
	 * @return the orgType
	 */
	public static OrgType getOrgType(String label) {
		if (stringToEnumMapping == null) {
			initMapping();
		}
		return stringToEnumMapping.get(label);
	}

	/**
	 * Initializes the mappings between label and orgType.
	 */
	private static void initMapping() {
		stringToEnumMapping = new HashMap<String, OrgType>();
		for (OrgType _o : values()) {
			stringToEnumMapping.put(_o.label, _o);
		}
	}

	/**
	 * Get the label. The label is the usual name of the currency in english.
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	
	public static OrgType getDefaultOrgType() {
		return OTHER;
	}
}
