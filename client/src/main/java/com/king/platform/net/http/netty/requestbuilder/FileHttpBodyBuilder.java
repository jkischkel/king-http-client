// Copyright (C) king.com Ltd 2015
// https://github.com/king/king-http-client
// Author: Magnus Gustafsson
// License: Apache 2.0, https://raw.github.com/king/king-http-client/LICENSE-APACHE

package com.king.platform.net.http.netty.requestbuilder;

import com.king.platform.net.http.netty.request.ChunkedFileHttpBody;
import com.king.platform.net.http.netty.request.FileRegionHttpBody;
import com.king.platform.net.http.netty.request.HttpBody;

import java.io.File;
import java.nio.charset.Charset;

class FileHttpBodyBuilder implements RequestBodyBuilder {
	private final File file;

	public FileHttpBodyBuilder(File file) {
		this.file = file;
	}

	@Override
	public String getName() {
		return "File " + file + " body";
	}

	@Override
	public HttpBody createHttpBody(String contentType, Charset charset, boolean isSecure) {
		if (isSecure) {
			return new ChunkedFileHttpBody(file, contentType);
		} else {
			return new FileRegionHttpBody(file, contentType);
		}
	}
}
