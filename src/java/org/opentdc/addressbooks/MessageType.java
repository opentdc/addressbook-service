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

public enum MessageType {
	TWITTER,
	FACEBOOK,
	SKYPE,
	FLICKR,
	LINKEDIN,
	MYSPACE,
	YELP,
	THREEMA,
	OTHER;
	
	public static MessageType getDefaultMessageType() {
		return TWITTER;
	}
	
	public static MessageType fromString(String type) {
		if (type.equalsIgnoreCase("twitter")) {
			return TWITTER;
		}
		else if (type.equalsIgnoreCase("facebook")) {
			return FACEBOOK;
		}
		else if (type.equalsIgnoreCase("skype")) {
			return SKYPE;
		}
		else if (type.equalsIgnoreCase("flickr")) {
			return FLICKR;
		}
		else if (type.equalsIgnoreCase("linkedin")) {
			return LINKEDIN;
		}
		else if (type.equalsIgnoreCase("myspace")) {
			return MYSPACE;
		}
		else if (type.equalsIgnoreCase("yelp")) {
			return YELP;
		}
		else if (type.equalsIgnoreCase("threema")) {
			return THREEMA;
		}
		else {
			return OTHER;
		}
	}
}
