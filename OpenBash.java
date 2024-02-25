public class OpenBash {
    public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("bash");
            processBuilder.inheritIO(); // This will allow you to interact with the bash shell
            Process process = processBuilder.start();
            process.waitFor(); // Wait for the process to finish
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

