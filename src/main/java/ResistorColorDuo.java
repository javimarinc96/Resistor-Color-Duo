import java.util.Arrays;

class ResistorColorDuo {

    private static final String[] colors =  {"black","brown","red","orange","yellow","green","blue",
            "violet","grey","white"};
    int value(String[] colors) {
        String chain = "";
        for(int i=0; i<2; i++){
            if (colors[i] != null && !colors[i].isEmpty() && !colors[i].isBlank()) {
                chain += Arrays.asList(this.colors).indexOf(colors[i]);
            }
        }
        return Integer.valueOf(chain);
    }
}
