package lesson_131;

public class Main_2 {
    public static void main(String[] args) {
        String data = "C:\\Program Files\\Java\\jdk1.8.0_181\\bin\\java.exe\" \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2018.3.1\\lib\\idea_rt.jar=60005:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2018.3.1\\bin\" -Dfile.encoding=UTF-8 -classpath \"C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\charsets.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\deploy.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\access-bridge-64.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\cldrdata.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\dnsns.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\jaccess.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\jfxrt.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\localedata.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\nashorn.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\sunec.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\sunjce_provider.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\sunmscapi.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\sunpkcs11.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\ext\\zipfs.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\javaws.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\jce.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\jfr.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\jfxswt.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\jsse.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\management-agent.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\plugin.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\resources.jar;C:\\Program Files\\Java\\jdk1.8.0_181\\jre\\lib\\rt.jar;Z:\\classworks\\Project_2\\out\\production\\Project_2\" lesson_131.Main\n" +
                "abcdef";
        System.out.println(data.length());
        System.out.println ("bobabi" + data.charAt(4));
        String s1 = "bobabi";
        String s2 = "abcdef";
        String s3 = "bobabi";
        System.out.println(s1 == s2);
        System.out.println(s1== s3);
        String s4 = new String("bobabi");
        String s5 = new String("bobabi");
        System.out.println(s4 == s5);

        System.out.println(s4.equals(s5));
    }
}
