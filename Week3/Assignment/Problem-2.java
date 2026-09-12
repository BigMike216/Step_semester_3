class Problem2 {
    static void simulateLogin(String correctCode, String[] attempts) {
        boolean granted = false;

        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                granted = true;
                break;
            }
        }

        if (!granted)
            System.out.println("Access denied — all attempts used");
    }

    public static void main(String[] args) {
        String[] attempts = {"0000", "1234", "9999"};
        simulateLogin("1234", attempts);
    }
}
