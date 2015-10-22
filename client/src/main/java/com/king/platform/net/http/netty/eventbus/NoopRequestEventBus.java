// Copyright (C) king.com Ltd 2015
// https://github.com/king/king-http-client
// Author: Magnus Gustafsson
// License: Apache 2.0, https://raw.github.com/king/king-http-client/LICENSE-APACHE

package com.king.platform.net.http.netty.eventbus;


public class NoopRequestEventBus implements RequestEventBus {
	@Override
	public <T> void subscribe(Event1<T> event, EventBusCallback1<T> callback) {

	}

	@Override
	public <T1, T2> void subscribe(Event2<T1, T2> event, EventBusCallback2<T1, T2> callback) {

	}

	@Override
	public <T> void subscribePermanently(Event1<T> event, EventBusCallback1<T> callback) {

	}

	@Override
	public <T1, T2> void subscribePermanently(Event2<T1, T2> event, EventBusCallback2<T1, T2> callback) {

	}

	@Override
	public <T> void triggerEvent(Event1<T> event, T payload) {

	}

	@Override
	public void triggerEvent(Event1<Void> event) {

	}

	@Override
	public <T1, T2> void triggerEvent(Event2<T1, T2> event, T1 payload1, T2 payload2) {

	}

	@Override
	public RequestEventBus createRequestEventBus() {
		return this;
	}
}
