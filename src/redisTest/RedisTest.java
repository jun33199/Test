package redisTest;
import redis.clients.jedis.Jedis;
import junit.framework.TestCase;

public class RedisTest extends TestCase {
	public void getJedis(){
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "bar");
		String value = jedis.get("foo");	
		System.out.println(value);
	}
}
