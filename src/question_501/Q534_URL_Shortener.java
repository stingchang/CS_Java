package question_501;

public class Q534_URL_Shortener {

/*
Knowledge:
base64:
    A-Z,a-z,0-9,+,/  total 63 characters
    6 bits(2^6) can cover 64 characters
    Each 3 characters(3 bytes) will be converted to 4 base64 characters
    https://zh.wikipedia.org/wiki/Base64
MD5:
    输入不定长度信息，输出一般128位的MD5散列被表示为32位十六进制数字。128-bits Hashing
    ex: MD5("The quick brown fox jumps over the lazy dog")
    = 9e107d9d 372bb682 6bd81d35 42a419d6
SHA:
    不可逆加密算法
    SHA-1，SHA-224和SHA-256适用于长度不超过2^64二进制位的消息。
    SHA-384和SHA-512适用于长度不超过2^128二进制位的消息。


md5_Str = md5(original_url + random_salt);
hashedURL =  convertToBase64(md5_Str);

--- Read ---
1. http://blog.gainlo.co/index.php/2016/03/08/system-design-interview-question-create-tinyurl-system/
2. https://www.youtube.com/watch?v=fMZMm_0ZhK4
    2 questions: a. how to make sure short url is unique b. where and how to store the url
    1. API
        createShort(long_url) -> tiny_url
        getLong(short_url) -> long_url
    2. Application Layer

    3. Persistence Layer

    a. generate a random string, put_if_not_exist_db(short, long)
    b. md5 approach
        i. md5(long_url + salt_or_time_stamp) => 128 bits base 16 string
        ii. convert_base_64(43 bits of md5_str)
    c. counter

zookeeper instance
restful api
load balancer
NoSQL
CDN
MD5
MemCached
*/
}
