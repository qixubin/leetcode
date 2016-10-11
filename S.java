class S{
    public static void main(String[] argv) {
        String s = "class  S{public static void main(String[] argv){String s=";
        System.out.println(s+(char)34+s+(char)34+(char)59);

        s = "System.out.println(s+(char)34+s+(char)34+(char)59);s=";
        System.out.println(s+(char)34+s+(char)34+(char)59+s);
        s = "System.out.println(s";
    }
}
//String c = "\"class  S{public static void main(String[] argv){String s=\"";