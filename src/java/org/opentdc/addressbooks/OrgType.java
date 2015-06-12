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

public enum OrgType {
	COMP, 		// joint-stock company, AG
	LTD, 		// limited liability company, GmbH
	COOP, 		// cooperative, Genossenschaft
	SOLE, 		// sole proprietorship, Einzelfirma
	CLUB, 		// Club, Verein
	TEAM,		// Team, Mannschaft
	ASSOC,		// Association, Federation, Verband
	ORGUNIT, 	// organizational part 
	OTHER;
		
	// TODO: make this language specific and lang an enum
	@Override
	public String toString() {
		String _label = null;
		switch(this) {
		case COMP:
			_label = "joint-stock company";
			// _label = "AG";
			break;
		case LTD:
			_label = "limited liability company";
			// _label = "GmbH";
			break;
		case COOP:
			_label = "cooperative";
			// _label = "Genossenschaft";
			break;
		case SOLE:
			_label = "sole proprietorship";
			// _label = "Einzelfirma";
			break;
		case CLUB:
			_label = "club";
			// _label = "Verein";
			break;
		case TEAM:
			_label = "team";
			// _label = "Mannschaft";
		case ASSOC:
			_label = "association";
			// _label = "Verband";
			break;
		case ORGUNIT:
			_label = "organizational unit";
			// _label = "Organisationseinheit";
			break;
		case OTHER:
			_label = "other organization type";
			// _label = "Andere Organisationsform";
			break;
		}
		return _label;
	}
	
	public static OrgType getDefaultOrgType() {
		return OTHER;
	}
}
