abstract class Cipher {
    abstract String encrypt(String text);
    abstract String decrypt(String text);

    void process(String text) {
        String enc = encrypt(text);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + decrypt(enc));
    }
}

class CaesarCipher extends Cipher {
    int shift;

    CaesarCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String t) {
        StringBuilder sb = new StringBuilder();
        for (char c : t.toCharArray())
            sb.append(Character.isLetter(c)
                ? (char) ((c - (Character.isUpperCase(c) ? 'A' : 'a') + shift) % 26
                        + (Character.isUpperCase(c) ? 'A' : 'a')) : c);
        return sb.toString();
    }

    @Override
    public String decrypt(String t) {
        shift = 26 - shift;
        String r = encrypt(t);
        shift = 26 - shift;
        return r;
    }

    public static void main(String[] args) {
        new CaesarCipher(3).process("Hello World");
    }
}
