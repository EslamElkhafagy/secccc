package service;

public interface TranspositionService {
    void doProcessOnKey();
    String doEncryption(String plainText);
    String doDecryption(String s);

}
