// Copyright (C) king.com Ltd 2015
// https://github.com/king/king-http-client
// Author: Magnus Gustafsson
// License: Apache 2.0, https://raw.github.com/king/king-http-client/LICENSE-APACHE

package com.king.platform.net.http;


public interface HttpClient {
	void start();

	void shutdown();

	<T> void setConf(ConfKeys<T> key, T value);

	HttpClientRequest createGet(String uri);

	HttpClientRequestWithBody createPost(String uri);

	HttpClientRequestWithBody createPut(String uri);

	HttpClientRequest createDelete(String uri);


}
