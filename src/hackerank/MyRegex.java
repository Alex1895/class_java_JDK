package hackerank;
public class MyRegex  {
		String regex = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])";//[0-9] is the regex acepted number to 0-9
		String pattern = regex+"[.]"+regex+"[.]"+regex+"[.]"+regex;
}
