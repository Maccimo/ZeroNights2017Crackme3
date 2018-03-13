import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class K2017Crackme3Keygen {

    public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam et maximus eros. Mauris laoreet molestie semper. Aliquam erat volutpat. Sed euismod neque ac ante viverra pellentesque. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras efficitur ac augue a mattis. Nunc facilisis elementum lobortis. Ut vehicula malesuada pharetra. Pellentesque a interdum eros, nec pulvinar sem. Morbi dapibus in quam ut ullamcorper. Vivamus volutpat vehicula condimentum.\n\nNullam commodo vestibulum cursus. Aliquam semper ligula ac tortor rutrum molestie. Vivamus nec orci auctor quam vehicula tempor et id neque. Suspendisse fermentum velit ut ipsum pellentesque hendrerit. Fusce convallis aliquam ante non elementum. Donec at scelerisque lacus, eu eleifend nulla. Pellentesque congue nisi in dolor dignissim, non lobortis neque luctus. Mauris ac cursus turpis. Phasellus finibus facilisis justo, convallis mattis lorem lobortis et. Nam ac interdum est. Etiam ac molestie ligula. Maecenas vel purus a odio accumsan venenatis. Nunc ligula dui, pharetra id arcu laoreet, mollis semper leo. Phasellus id magna molestie, semper risus nec, vehicula sem.\n\nDonec eget nisl purus. Phasellus non nisi felis. Aliquam ut odio sit amet neque euismod vulputate non vel mauris. Suspendisse sit amet ligula sed leo condimentum vulputate convallis eu dui. Vestibulum tortor lacus, maximus quis tincidunt a, pretium sed lacus. Maecenas porta dui nisi, vel molestie tortor luctus at. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam odio ante, sollicitudin sed diam quis, ultricies pretium ex. Proin nisi arcu, tristique id leo et, lacinia semper nisi. Fusce posuere lacus at ex pretium venenatis. Sed porta nibh mauris, ut vestibulum nulla aliquam non. Nunc id tortor non nisi blandit volutpat. Phasellus malesuada hendrerit orci a semper. Nam a risus ac arcu dictum imperdiet.\n\nCras ut risus eget leo ultricies dictum vitae et enim. Aliquam erat volutpat. Fusce ut porttitor nisi. Praesent vel pulvinar orci. Aenean ac libero sed tortor sagittis tristique commodo in velit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam eu enim orci. Nullam consectetur lobortis tellus, ac facilisis ex dapibus sed.\n\nAliquam mollis eget turpis id vestibulum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque vitae lectus non metus convallis aliquam. Donec rutrum tincidunt quam, iaculis gravida nisl dictum id. Donec malesuada dapibus magna tristique convallis. Curabitur at turpis sed tellus accumsan condimentum. Nam accumsan nisi a ex hendrerit, in sagittis turpis feugiat. Morbi congue et est eu venenatis. Phasellus erat dui, rutrum sit amet fringilla sit amet, imperdiet in nulla. Quisque laoreet neque ac augue sodales, at mollis magna mollis. Mauris nec consectetur purus, quis aliquam leo. Sed lobortis magna efficitur vehicula finibus.";
    public static final String ALPHABET = "ABCDEFGHIJKLONMPQRSTVUWXYZabcdefghijlkmnopqrstuvwxyz5193406782+/";
    public static final String HEX_DIGITS = "0123456789ABCDEF";
    public static final String TRUE_SALT = "N5Y9QjQ1QjZFMEFDOjUENlE0MVV3REI0OTZFNDBGRDA=";

    public static void main(String... args) {

        System.out.print("E-Mail: ");
        String email = System.console().readLine();

        String expectedSerial = calculateSha1Hex(method_1133(TRUE_SALT + email));

        System.out.printf("Serial: %s", expectedSerial);

    }

    private static String method_1131(String s1, String s2) {
        StringBuilder stringBuilder = new StringBuilder("");
        for(int i = 0; i < 256; i++) {
            stringBuilder.append(String.valueOf(s1.charAt(i) ^ s2.charAt(i % s2.length())));
        }

        return encodeCustomBase64(stringBuilder.toString().getBytes());
    }

    public static String method_1133(String s) {
        StringBuilder stringBuilder = new StringBuilder("");

        for(int i = 0; i < 256; i++) {
            int var2 = ((i << 4 | i) << 240 * i) % 2000000 % 2949;
            stringBuilder.append(LOREM_IPSUM.substring(var2, 1 + var2));
        }

        return method_1131(stringBuilder.toString(), s);
    }

    public static String calculateSha1Hex(String s) {
        try {
            byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            StringBuilder stringBuilder = new StringBuilder(messageDigest.digest(bytes).length);

            for(int i = 0; i < messageDigest.digest(bytes).length; i++) {
                stringBuilder
                    .append(HEX_DIGITS.charAt(messageDigest.digest(bytes)[i] >> 4 & 0xf))
                    .append(HEX_DIGITS.charAt(messageDigest.digest(bytes)[i] & 0xf));
            }

            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String encodeCustomBase64(byte[] bytes) {
        char[] alphabetChars = ALPHABET.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int var1 = 0;

        int var2;
        for(int i = 0; i < bytes.length; i += 3) {
            var2 = (bytes[i] & 0xff) << 16 & 0xffffff;
            if (1 + i < bytes.length) {
                var2 |= (bytes[1 + i] & 0xff) << 8;
            } else {
                var1++;
            }

            if (2 + i < bytes.length) {
                var2 |= bytes[2 + i] & 0xff;
            } else {
                var1++;
            }

            int var4 = var2;

            for(var2 = 0; var2 < 4 - var1; var2++) {
                stringBuilder.append(alphabetChars[(0xfc0000 & var4) >> 18]);
                var4 <<= 6;
            }
        }

        for(var2 = 0; var2 < var1; var2++) {
            stringBuilder.append("=");
        }

        return stringBuilder.toString();
    }
}
