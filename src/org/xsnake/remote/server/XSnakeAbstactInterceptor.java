package org.xsnake.remote.server;

import java.lang.reflect.Method;

public class XSnakeAbstactInterceptor implements XSnakeInterceptor {

	@Override
	public void before(ServerInfo info, Object target, Method method, Object[] args) {}

	@Override
	public void after(ServerInfo info, Object target, Method method, Object[] args, Object result) {}
	
}