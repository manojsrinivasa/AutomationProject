package language.basics;

public class StringsPractice {

	public static void main(String[] args) {

		
		String value = "Username:admin | pws:admin1000";
		
		System.out.println(value.length());
		System.out.println(value.charAt(7));	
		
		for (int i=value.length()-1; i>=0; i--) {
			System.out.print(value.charAt(i));
		}
	    System.out.println();
		System.out.println(value.trim());
		System.out.println(value.replaceAll("[0-9]", ""));
		System.out.println(value.toUpperCase());
		System.out.println(value.substring(10, 22));
		System.out.println(value.substring(12).trim());
		String[] splittedval =value.split("");
		System.out.println(splittedval[6]);
		System.out.println(splittedval[10]);
		
	    String value1="Bharath";
        String value2="bharath";
        String value3="Bharath";
        String value4="hara";
        String value5="Hara";
        
        System.out.println(value1.equals(value3));
        System.out.println(value1.equalsIgnoreCase(value2));
        System.out.println(value1.contains(value4));
        
        StringBuffer sbc = new StringBuffer("kiran");
        sbc.append("ddd");
        System.out.println(sbc);
        
        int stdCode = 144;
        int phone = 345456;
        String code = String.valueOf(stdCode);
        System.out.println(code+phone);
        
        
        String balance = " Account Balance : 1000";
        int bal = Integer.valueOf(balance.replaceAll("[^0-9]", ""));
        System.out.println(bal>=100);
        
        
        
	}

}
