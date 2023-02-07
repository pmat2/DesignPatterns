package behavioral.templateMethod;

public class WorldOfWarcraftLoader extends BaseGameLoader {

    @Override
    public void load() {
        loadLocalData();
        createObjects(new byte[]{1,2,3});
    }

    @Override
    byte[] loadLocalData() {
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {

    }

    @Override
    void downloadAdditionalFiles() {

    }

    @Override
    void initializeProfiles() {

    }
}
