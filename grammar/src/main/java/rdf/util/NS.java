package rdf.util;
/**
 * Copyright 2016 William Van Woensel

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 * 
 * 
 * @author wvw
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NS {

	public static Map<String, String> map;

	static {
		map = new HashMap<String, String>();

		map.put("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
		map.put("rdfs", "http://www.w3.org/2000/01/rdf-schema#");
		map.put("owl", "http://www.w3.org/2002/07/owl#");
		map.put("rf", "http://niche.cs.dal.ca/reflex-ontology.owl#");
		map.put("rdft", "http://www.w3.org/ns/rdftest#");
		map.put("mf", "http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#");
	}

	public static String qName(String uri) {
		Iterator<String> nsIt = map.keySet().iterator();

		while (nsIt.hasNext()) {
			String prefix = nsIt.next();
			String ns = map.get(prefix);

			if (uri.contains(ns))
				return uri.replace(ns, prefix + ":");
		}

		return uri;
	}

	public static String uri(String qname) {
		String prefix = qname.substring(0, qname.indexOf(":"));

		String uri = qname;
		if (map.containsKey(prefix)) {
			String ns = map.get(prefix);

			uri = qname.replace(prefix + ":", ns);
		}

		return uri;
	}

	public static String uri(String prefix, String fragm) {
		String uri = fragm;

		if (map.containsKey(prefix)) {
			String ns = map.get(prefix);

			uri = ns + uri;
		}

		return uri;
	}

	public static String localName(String uri) {
		int idx = uri.lastIndexOf("/");
		int idx2 = uri.lastIndexOf("#");

		if (idx2 > idx)
			return uri.substring(idx2 + 1);
		else
			return uri.substring(idx + 1);
	}
}
