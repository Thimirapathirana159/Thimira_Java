public class Language {
    String languages;
    Language(String a){
        languages=a;
        System.out.println("Language is "+ languages);

    }

    public static void main(String[] args) {
        Language l=new Language("sinhala");
        Language l1=new Language("English");
        Language l2=new Language("Tamil");
    }
}
