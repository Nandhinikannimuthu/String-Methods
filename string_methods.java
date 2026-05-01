class string_methods {
    public static void main(String[] args) {

        String s = "Hello World";
        String k = " ";
        String s2 = "hello world";
        String p = "  Priyanka  ";

        
        System.out.println(s.length());
        System.out.println(k.isEmpty());
        System.out.println(k.isBlank());

        
        System.out.println(s.equals("Hello"));
        System.out.println(s.equalsIgnoreCase("hello wOrLd"));
        System.out.println(s.compareTo(s2));
        System.out.println(s.contains("World"));

        
        System.out.println(s.charAt(1));
        System.out.println(s.substring(0, 5));
        System.out.println(s.indexOf('o'));           // first match (char)
        System.out.println(s.indexOf("World"));       // first match (String)
        System.out.println(s.lastIndexOf('o'));       // last match

        
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("World"));

        
        System.out.println(p.trim());
        System.out.println(p.strip());
        System.out.println(s.replace("World", "Java"));
        System.out.println("Hi ".repeat(3));
        System.out.println(s.repeat(3));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}