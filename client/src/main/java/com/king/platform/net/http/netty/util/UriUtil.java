// Copyright (C) king.com Ltd 2015
// https://github.com/king/king-http-client
// Author: Magnus Gustafsson
// License: Apache 2.0, https://raw.github.com/king/king-http-client/LICENSE-APACHE

package com.king.platform.net.http.netty.util;


import com.king.platform.net.http.netty.requestbuilder.Param;
import com.king.platform.net.http.netty.requestbuilder.UriQueryBuilder;

import java.util.List;

public class UriUtil {
	public static String getUriWithParameters(String uri, List<Param> parameters) {
		UriQueryBuilder uriQueryBuilder = new UriQueryBuilder(uri);
		for (Param parameter : parameters) {
			uriQueryBuilder.addParameter(parameter.getName(), parameter.getValue());
		}
		return uriQueryBuilder.build();
	}


	public static String getRelativeUri(String completeUri) {
		int offset = 0;
		if (completeUri.startsWith("http://")) {
			offset = 7;
		}

		if (completeUri.startsWith("https://")) {
			offset = 8;
		}

		int slashIndex = completeUri.indexOf("/", offset);
		int paramIndex = completeUri.indexOf("?", offset);

		if (paramIndex != -1 && paramIndex < slashIndex) {
			return "/" + completeUri.substring(paramIndex);
		}

		if (slashIndex != -1) {
			return completeUri.substring(slashIndex);
		}

		if (paramIndex != -1) {
			return "/" + completeUri.substring(paramIndex);
		}

		return "/";
	}
}
