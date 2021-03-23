package service;

public interface PlayfairService {

    void setKey(String key);
    void KeyGenerator();
    void matrix();
    String format(String txt);
    int[] GetDiminsions(char letter);
    String encryptMessage(String Source);
    String[] Divid2Pairs(String new_string);
}
