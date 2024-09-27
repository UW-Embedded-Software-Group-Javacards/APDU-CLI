package cli;

import javax.smartcardio.*;

public class CardApplication {

    public static void main(String[] args) throws CardException {
        CardSessionManager manager = new CardSessionManager();

        try {
            manager.communicate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
