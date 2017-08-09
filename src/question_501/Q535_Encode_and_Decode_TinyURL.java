package question_501;

import java.util.HashMap;
import java.util.Map;

public class Q535_Encode_and_Decode_TinyURL {
	private Map<String, String> map;
	private char[] urlCharsArr;
	private int urlCharsArrLen;
	private String baseUrl = "http://tinyurl.com/";

	public Q535_Encode_and_Decode_TinyURL() {
		map = new HashMap<String, String>();
		urlCharsArr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		urlCharsArrLen = urlCharsArr.length;
	}

	private String urlTokenGenerator() {
		StringBuilder sb = new StringBuilder();
		String token = "";
		do {
			for (int i = 0; i < 6; i++) {
				int rand = (int) (Math.random() * urlCharsArrLen);
				sb.append(urlCharsArr[rand]);
			}
			token = sb.toString();

		} while (map.containsKey(token));

		return token;
	}

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		String token = urlTokenGenerator();
		map.put(token, longUrl);

		String shortUrl = baseUrl + token;

		return shortUrl;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		String token = shortUrl.substring(baseUrl.length());
		String longUrl = map.get(token);

		return longUrl;
	}
}


/**
 * For encode:
 * - create a hashTable table
 * - id = table.size
 * - save (id, url)
 * - conver id to randNum
 * - return baseUrl+/+randNum
 * 
 * For decode
 * - get randNum from url(baseUrl+/+randNum)
 * - convert randNum to id
 * retrun table.get(id)
 * 
 * - Another way is to create a random number without id,
 * - and check if the id is used as key in the table, if used, create another one
 */