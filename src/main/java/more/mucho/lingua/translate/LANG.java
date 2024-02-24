package more.mucho.lingua.translate;

public enum LANG {

    ARABIC("اللغة_العربية","AR"),
    BULGARIAN("Български","BG"),
    CZECH("Česky","CS"),
    DANISH("Dansk","DA"),
    GERMAN("Deutsch","DE"),
    GREEK("Ελληνική","EL"),
    ENGLISH_GB("English_British","EN-GB"),
    ENGLISH_US("English_American","EN-US"),
    SPANISH("Español","ES"),
    ESTONIAN("Eesti","ET"),
    FINNISH("Suomalainen","FI"),
    FRENCH("Français","FR"),
    HUNGARIAN("Magyar","HU"),
    INDONESIAN("Bahasa_Indonesia ","ID"),
    ITALIAN("Italiano","IT"),
    JAPANESE("日本語","JA"),
    KOREAN("","KO"),
    LITHUANIAN("","LT"),
    LATVIAN("","LV"),
    NORWEGIAN("","NB"),
    DUTCH("","NL"),
    POLISH("Polski","PL"),
    PORTUGUESE("Português","PT"),
    BRAZILIAN("Português_do_Brasil","PT-BR"),
    ROMANIAN("","RO"),
    RUSSIAN("","RU"),
    SLOVAK("","SK"),
    SLOVENIAN("","SL"),
    SWEDISH("","SV"),
    TURKISH("","TR"),
    UKRAINIAN("","UK"),
    CHINESE_SIMPLIFIED("","ZH");

    public final String langName;
    public final String langCode;
    LANG(String langName,String langCode) {
        this.langName = langName;
        this.langCode = langCode;
    }
}
