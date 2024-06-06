//Comment the line below when compile
package N3Ejercicio1;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        try {
            String currentDirPath = System.getProperty("user.dir");
            String inputDirPath = currentDirPath + File.separator + "src" + File.separator + "S1_06/S1_05" + File.separator + "N3Ejercicio1";
            String encryptedDirPath = currentDirPath + File.separator + "src" + File.separator + "S1_06/S1_05" + File.separator + "S1_05_N3Ejercicio1_encrypted";
            String decryptedDirPath = currentDirPath + File.separator + "src" + File.separator + "S1_06/S1_05" + File.separator + "S1_05_N3Ejercicio1_decrypted";

            File inputDir = new File(inputDirPath);
            File encryptedDir = new File(encryptedDirPath);
            File decryptedDir = new File(decryptedDirPath);

            encryptedDir.mkdirs();
            decryptedDir.mkdirs();

            SecretKey secretKey = CryptoUtils.generateSecretKey();
            IvParameterSpec iv = CryptoUtils.generateIv();

            processDirectory(inputDir, encryptedDir, secretKey, iv, true);
            System.out.println("Files successfully encrypted.");

            processDirectory(encryptedDir, decryptedDir, secretKey, iv, false);
            System.out.println("Files successfully decrypted.");

            String encodedKey = CryptoUtils.secretKeyToString(secretKey);
            String encodedIv = CryptoUtils.ivToString(iv);
            System.out.println("Secret Key (Base64): " + encodedKey);
            System.out.println("IV (Base64): " + encodedIv);
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }

    private static void processDirectory(File inputDir, File outputDir, SecretKey secretKey, IvParameterSpec iv, boolean encrypt) throws Exception {
        File[] files = inputDir.listFiles();

        if (files != null) {
            for (File file : files) {
                File outputFile = new File(outputDir, file.getName());
                if (file.isDirectory()) {
                    outputFile.mkdirs();
                    processDirectory(file, outputFile, secretKey, iv, encrypt);
                } else {
                    if (encrypt) {
                        CryptoUtils.encrypt(file, outputFile, secretKey, iv);
                    } else {
                        CryptoUtils.decrypt(file, outputFile, secretKey, iv);
                    }
                }
            }
        }
    }
}
