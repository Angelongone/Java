package API;

public class str {
	 public static void main(String[] args){
	        //创建一个空的字符串
	        String str1 = new String();
	        //创建一个内容为abcd的字符串
	        String str2 = new String("abcd");
	        //创建一个内容为字符数组的字符串
	        char[] charArray = new char[] {'D','E','F'};
	        String str3 = new String(charArray);
	        System.out.println("a"+ str1+"b");
	        System.out.println(str2);
	        System.out.println(str3);

	        //字符串的基本操作
	        System.out.println("\n\n" + "字符串的基本操作：" );
	        String s = "abcdedcba";
	        System.out.println("字符串长度为：" + s.length());
	        System.out.println("字符串中第一个字符：" + s.charAt(0));
	        System.out.println("字符c第一次出现的位置：" + s.indexOf('c'));
	        System.out.println("字符c最后一次出现的位置：" + s.lastIndexOf('c'));



	        //字符串的转换操作
	        System.out.println("\n\n" + "字符串的转换操作：");
	        String str = "abcd";
	        System.out.println("将字符串转换为字符数组后的结果：");
	        char[] chaRarray = str.toCharArray();
	        for(int i = 0 ; i < chaRarray.length ; i++){
	            if(i != chaRarray.length - 1){
	                System.out.println(chaRarray[i] + ",");
	            }else{
	                System.out.println(chaRarray[i]);
	            }
	        }
	        System.out.println("将int 值转换为String类型之后的结果：" + String.valueOf(12));
	        System.out.println("将字符串转换成大写之后的结果：" + str.toUpperCase());


	        //字符串的替换和去除空格操作
	        System.out.println("\n\n" + "字符串的替换和去除空格操作:");
	        String a = "itcast";
	        System.out.println("将int替换成cn.it的结果：" + a.replace("it","cn.it"));
	        String a1 = "i t c a s t ";
	        System.out.println("去除字符串两端空格后的结果：" + a1.trim());
	        System.out.println("去除字符串中所有空格后的结果：" + a1.replace(" ",""));


	        //字符串的判断操作
	        System.out.println("\n\n" + "字符串的判断操作");
	        String s2 = "String";
	        String s3 = "Str";
	        System.out.println("判断是否以字符串Str开头：" + s2.startsWith("Str"));
	        System.out.println("判断是否以字符串ng结尾：" + s2.endsWith("ng"));
	        System.out.println("判断是否包含字符串tri：" + s2.contains("tri"));
	        System.out.println("判断字符串是否为空：" + s2.isEmpty());
	        System.out.println("判断两个字符串是否相等" + s2.equals(s3));

	        //字符串的截取和分割
	        System.out.println("\n\n" + "字符串的截取和分割：");
	        String str4 = "羽毛球-篮球-乒乓球";
	        System.out.println("从第五个字符截取到末尾的结果：" + str4.substring(4));
	        System.out.println("从第五个字符截取到第六个字符的结果：" + str4.substring(4,6));
	        System.out.println("分割后的字符串数组中的元素依次为：");
	        String[] strarray = str.split("-");    //将字符串转换为字符串数组
	        for(int j = 0; j < strarray.length ; j++){
	            if(j != strarray.length - 1){
	                System.out.println(strarray[j] + ",");
	            }else {
	                System.out.println(strarray[j]);
	            }
	        }

	    }
}
