package com.cn.sz.groovy.string
/**
 * 		<title>groovy字符串注意事项<title>
 <p>
 与Java一样，Groovy中的字符串也是不可变的（即只读的）。欲改变字符串值需使用StringBuffer或StringBuilder。<br>
 　　Groovy中，如果字符串如果由单引号括起来，或者由双引号或三重引号括起来但没有非转义的美元符号（$），那么该字符串是java.lang.String的一个实例。您可使用JDK中任意字符串方法。另外，GDK动态注入额外的实用方法到String类。<br>
 　　由于Groovy会自动转型为String类，您可以在任何时候使用GStrings。<br>
 　　字符串可被单引号，双引号或者三重引号括起来。其中，三重引号可直接跨越数行并且输出中仍包含回车符、制表符和空格符。<br>
 　　Groovy使用size方法来查询一个字符串，StringBuffer或StringBuilder的长度，与查询一个集合的长度相统一。<br>
 　　某些字符串方法接受闭包，它明确说明需要满足的条件，例如，find，findAll，findIndexOf，every和any。这些方法都是由GDK动态注入到java.lang.Object中的。<br>
 　　您可以使用collect，each或者eachWithIndex方法遍历字符串，而且这些方法也属于java.lang.Object的一部分。<br>
 　　您可对字符串使用操作符。操作符“+”完成字符串联接；“-”则最多去掉一个右操作数的实例；“*”按照给定的数字复制字符串；next实现字符串最后一个字节自增；previous实现字符串最后一个字节自减。<br>
 　　您可对Strings，StringBuffers和StringBuilders使用下标操作符，也可以在下标操作符中使用range和负索引(即索引可以是负数，计数从右边开始)。<br>
 </p>
 * @Description 
 * @author henry
 * @date 2016年5月30日 下午6:03:06
 */
class String001 {
	static void main(def args){

		String test1= 'hello'

		println "$test1 world"//$���Զ�̬���ñ����ַ���

		println "world ${test1.toUpperCase()}"//${...}����д���ʽ

		String test2="Hello \"World\""

		String test3='Hello "World"'//�����ŵ��ַ�������ֱ�Ӱ���˫���ţ�����Ҫ��ת��

		println  test2==test3


		String test4="Hello 'world'"

		String test5='Hello \'world\''

		println test4==test5//true


		println new String('hello world')=="hello world"

		def s = ['h', 'e', 'l', 'l', 'o'] as char[]
		println new String(s) == 'hello'
		println new String(s,0,4) == 'hell'
		s.eachWithIndex{ch,index -> assert ch == s[index]}
		println 'hello'.toCharArray() == ['h', 'e', 'l', 'l', 'o']
		//���õ�ת�����
		println '\t' == '\011'    //Tab��Tab��
		println '\n' == '\012'    //New line�����з�
		println '\r' == '\015'    //Carriage return���س�
		println '\n' == """
 
""" //Spanning multiple lines����Խ����
		//������ַ�����ʾ��
		def object = new Object()
		println String.valueOf(object) == object.toString() //Objects
		println String.valueOf(true) == true.toString() //Booleans
		println String.valueOf('a') == 'a'.toString() //Characters
		println String.valueOf(1) == 1.toString() //Numbers
		println String.valueOf([a:1,b:2]) == [a:1,b:2].toString() //Collections
		//�ַ������ȣ�
		s = "Hello World"
		println s.size() == 11
		println s.size() == s.length()
		//��䣨pad���ַ�����
		println 'Hello'.padRight(7,'*') == 'Hello**'
		println 'Hello'.padLeft(7,'*') == '**Hello'
		println 'Hello'.center(9,'*') == '**Hello**'
		//�ֽ��ַ�����


		s = "The quick brown fox jumps over the lazy dog"
		println s.tokenize() == ['The', 'quick', 'brown', 'fox', 'jumps', 'over', 'the', 'lazy', 'dog']

		println s.tokenize() == new StringTokenizer(s).collect{it}

		def s1 = "The,quick*brown*fox,*jumps*over*the*lazy*dog"

		println s1.tokenize(',*') == s.tokenize()
		//��ѯ�ַ�����



		def alphabets = new String('a' .. 'z' as char[])

		println alphabets.find{it > 'f'} == 'g' //First one found

		println alphabets.findAll{it > 'f'} == 'g' .. 'z'//ALl found

		println alphabets.findIndexOf{ it > 'f'} == alphabets.indexOf('g')

		println alphabets.every {it > 'A'}

		println alphabets.any{it < 'c'}

		println alphabets.startsWith('abc')

		println alphabets.endsWith('xyz')

		println alphabets.contains('def')

		println alphabets.indexOf('c') == 2

		println alphabets.indexOf('d') == alphabets.lastIndexOf('d')

		println alphabets.count('a') == 1
		//�滻�ַ�����



		s = "Hello"

		println s.replace('H','Y') == 'Yello'

		println s.replace('l','p') == 'Heppo'
		//�ַ�����ת��



		s = 'mirror'

		println s.reverse() == 'rorrim'
		//�ַ�����������



		println 'hello' + ' world' - 'l' == 'helo world' //Subtracts at most one l

		//		println ('Today is Sunday' - 'Sunday').trim() == 'Today is'

		println 'hello ' * 2 == 'hello hello '

		def empty = []

		println 'abc'.each{empty << it} == 'abc'

		println 'abc'.next() == 'abd'

		println 'abc'.previous() == 'abb'
		//�±��������



		println 'hello'[1] == 'e'

		println 'hello'[2..'hello'.size() - 1] == 'llo'

		println 'hello'[0, 2, 4] == 'hlo'

		println 'hello'[-4, -2] == 'el'
		//�ַ����Ƚϣ�



		println 'a' < 'b'

		println 'a' > 'A'

		println 'a'.compareTo('b') == -1

		println 'a'.compareToIgnoreCase('A') == 0
		//Ѱ�����ֵ����Сֵ��



		Collections.max('abcdeF'.toList()) == 'e'

		println Collections.max('abcdeF'.toList(), String.CASE_INSENSITIVE_ORDER) == 'F'

		println Collections.min(['abc', 'abd', 'abe']) == 'abc'

		println Collections.min(['Abc', 'aBd', 'abE'], String.CASE_INSENSITIVE_ORDER) == 'Abc'
		//StringBuffers��StringBuilders�ǿɱ�ģ������ַ����ı䡣StringBuilder�����̰߳�ȫ�ģ���˴����ٶ�Ҫ��StringBuffers�졣



		def sb = new StringBuffer('Hello World')

		println sb.toString() == 'Hello World'

		sb.length = 5

		println sb.toString() == 'Hello'

		println sb.substring(0,2) == 'He'

		//Use <<, append(String) or leftShift(String) to append to a StringBuffer.

		//Using + to append to a StringBuffer will return a String

		sb = new StringBuffer("Hello")

		println sb + ' World' in java.lang.String

		println sb << ' World' in java.lang.StringBuffer

		println sb.toString() == ("Hello World")

		println sb.append(", Groovy rocks").toString() == "Hello World, Groovy rocks"

		println sb.leftShift(". Doesn't?").toString() == "Hello World, Groovy rocks. Doesn't?"
		//��Ҳ���Զ�StringBuffer��StringBuilderʹ���±꣬�磺



		sb = new StringBuffer("abcdefg")

		println sb[0] == 'a'

		println sb[2..4] == 'cde'

		println sb[0].class == String

		println sb[-6..-4] == "bcd"

		sb[0..2] = "xyz"

		println sb.toString() == "xyzdefg"
		//����StringBuffers��



		sb = new StringBuffer("StringBuffers are mutable")

		sb.delete(sb.indexOf(" are mutable"),sb.size())

		println sb.toString() == "StringBuffers"

		sb.insert(sb.size(), " are mutable")

		println sb.toString() == "StringBuffers are mutable"

		sb.replace(sb.indexOf("StringBuffers"), "StringBuffers".size(), "StringBuilders")

		println sb.toString() == "StringBuilders are mutable"

		def string = new String(sb)

		def string2 = string.replaceAll("StringBuilders", "StringBuffers")

		println string2 == "StringBuffers are mutable"



	}
}
