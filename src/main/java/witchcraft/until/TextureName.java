package witchcraft.until;

public class TextureName {
    public static String setTextureName(String pathToTexture){
        String texture = pathToTexture;
        for(int i = 0;i <= 1;i++){
           texture += i + ".png";
        }
        return texture;
    }
}
