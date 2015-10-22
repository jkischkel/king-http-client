// Copyright (C) king.com Ltd 2015
// https://github.com/king/king-http-client
// Author: Magnus Gustafsson
// License: Apache 2.0, https://raw.github.com/king/king-http-client/LICENSE-APACHE

package com.king.platform.net.http.netty;

import io.netty.util.TimerTask;

public interface TimeoutTimerTask extends TimerTask {
	void completed();

	void cancel();

}
