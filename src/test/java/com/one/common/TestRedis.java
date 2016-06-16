package com.one.common;

import redis.clients.jedis.Jedis;

/**
 * @author jay
 * @since 2016年6月16日
 */
public class TestRedis {
	public static void main(String[] args) {
		Jedis jedis = null;
		try {
			// 连接本地的 Redis 服务
			jedis = new Jedis("localhost");
			System.out.println("Connection to server sucessfully");
			// 查看服务是否运行
			System.out.println(jedis.get("name"));
			jedis.set("name", "hack");
			System.out.println(jedis.get("name"));
			System.out.println("Server is running: " + jedis.ping());
		} finally {
			jedis.close();
		}
	}
}
