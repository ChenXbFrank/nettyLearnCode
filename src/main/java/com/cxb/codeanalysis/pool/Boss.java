package com.cxb.codeanalysis.pool;

import java.nio.channels.ServerSocketChannel;
/**
 * boss接口
 */
public interface Boss {
	
	/**
	 * 加入一个新的ServerSocket
	 * @param serverChannel
	 */
	void registerAcceptChannelTask(ServerSocketChannel serverChannel);
}
