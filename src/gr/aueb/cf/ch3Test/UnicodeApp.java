package gr.aueb.cf.ch3Test;

public class UnicodeApp {
    public static void main(String[] args) {
        //int codePoint = 0x1F600;
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji < emojiEnd) {
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) {
                System.out.println();
            }
        }

        //System.out.print("Smiley: ");
        //System.out.println(Character.toChars(codePoint));
    }
}
