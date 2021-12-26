package wraith.harvest_scythes.util;

import com.google.gson.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.util.Identifier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;

import static wraith.harvest_scythes.HarvestScythes.LOGGER;

@SuppressWarnings({"unused", "SameParameterValue"})
public class Config {

    private static final String CONFIG_FILE = "config/harvest_scythes/config.json";
    private NbtCompound configData;
    private final HashSet<String> scytheBlacklist = new HashSet<>();
    private final HashSet<String> macheteBlacklist = new HashSet<>();
    private static Config INSTANCE = null;

    private Config() {
    }

    public static Config getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Config();
            INSTANCE.loadConfig();
        }
        return INSTANCE;
    }

    public boolean canScytheHarvest(Identifier block) {
        return !scytheBlacklist.contains(block.toString());
    }

    public boolean canMacheteHarvest(Identifier block) {
        return !macheteBlacklist.contains(block.toString());
    }

    private NbtCompound getDefaults() {
        NbtCompound defaultConfig = new NbtCompound();

        NbtList scytheBlacklisted = new NbtList();
        scytheBlacklisted.add(NbtString.of("minecraft:lily_pad"));
        defaultConfig.put("scythe_blacklisted_blocks", scytheBlacklisted);

        NbtList macheteBlacklisted = new NbtList();
        defaultConfig.put("machete_blacklisted_blocks", macheteBlacklisted);

        return defaultConfig;
    }

    private int difference = 0;

    public int getIntOrDefault(NbtCompound getFrom, String key, NbtCompound defaults) {
        if (getFrom.contains(key)) {
            return getFrom.getInt(key);
        } else {
            ++difference;
            return defaults.getInt(key);
        }
    }

    public boolean getBooleanOrDefault(NbtCompound getFrom, String key, NbtCompound defaults) {
        if (getFrom.contains(key)) {
            return getFrom.getBoolean(key);
        } else {
            ++difference;
            return defaults.getBoolean(key);
        }
    }

    private String getStringOrDefault(NbtCompound getFrom, String key, NbtCompound defaults) {
        if (getFrom.contains(key)) {
            return getFrom.getString(key);
        } else {
            ++difference;
            return defaults.getString(key);
        }
    }

    private NbtCompound getCompoundOrDefault(NbtCompound getFrom, String key, NbtCompound defaults) {
        if (getFrom.contains(key)) {
            return getFrom.getCompound(key);
        } else {
            ++difference;
            return defaults.getCompound(key);
        }
    }

    private NbtList getNbtListOrDefault(NbtCompound getFrom, String key, NbtCompound defaults, int type) {
        if (getFrom.contains(key)) {
            return getFrom.getList(key, type);
        } else {
            ++difference;
            return defaults.getList(key, type);
        }
    }

    private double getDoubleOrDefault(NbtCompound getFrom, String key, NbtCompound defaults) {
        if (getFrom.contains(key)) {
            return getFrom.getDouble(key);
        } else {
            ++difference;
            return defaults.getDouble(key);
        }
    }

    public int getIntOrDefault(JsonObject getFrom, String key, NbtCompound defaults) {
        if (getFrom.has(key)) {
            return getFrom.get(key).getAsInt();
        } else {
            ++difference;
            return defaults.getInt(key);
        }
    }

    public boolean getBooleanOrDefault(JsonObject getFrom, String key, NbtCompound defaults) {
        if (getFrom.has(key)) {
            return getFrom.get(key).getAsBoolean();
        } else {
            ++difference;
            return defaults.getBoolean(key);
        }
    }

    private String getStringOrDefault(JsonObject getFrom, String key, NbtCompound defaults) {
        if (getFrom.has(key)) {
            return getFrom.get(key).getAsString();
        } else {
            ++difference;
            return defaults.getString(key);
        }
    }

    private double getDoubleOrDefault(JsonObject getFrom, String key, NbtCompound defaults) {
        if (getFrom.has(key)) {
            return getFrom.get(key).getAsDouble();
        } else {
            ++difference;
            return defaults.getDouble(key);
        }
    }

    private JsonObject toJson(NbtCompound tag) {
        JsonObject json = new JsonObject();
        NbtCompound defaults = getDefaults();

        JsonArray scytheBlacklistedJson = new JsonArray();
        NbtList scytheBlacklisted = getNbtListOrDefault(tag, "scythe_blacklisted_blocks", defaults, NbtElement.STRING_TYPE);
        for (int i = 0; i < scytheBlacklisted.size(); i++) {
            scytheBlacklistedJson.add(scytheBlacklisted.getString(i));
        }
        json.add("scythe_blacklisted_blocks", scytheBlacklistedJson);

        JsonArray macheteBlacklistedJson = new JsonArray();
        NbtList macheteBlacklisted = getNbtListOrDefault(tag, "machete_blacklisted_blocks", defaults, NbtElement.STRING_TYPE);
        for (int i = 0; i < macheteBlacklisted.size(); i++) {
            macheteBlacklistedJson.add(macheteBlacklisted.getString(i));
        }
        json.add("machete_blacklisted_blocks", macheteBlacklistedJson);

        createFile(json, this.difference > 0);
        difference = 0;
        return json;
    }

    private NbtCompound toNbtCompound(JsonObject json) {
        NbtCompound tag = new NbtCompound();
        NbtCompound defaults = getDefaults();

        NbtList scytheBlacklisted = new NbtList();
        NbtList defaultScytheBlacklist = defaults.getList("scythe_blacklisted_blocks", NbtElement.STRING_TYPE);
        if (json.has("scythe_blacklisted_blocks")) {
            for (JsonElement element : json.get("scythe_blacklisted_blocks").getAsJsonArray()) {
                scytheBlacklisted.add(NbtString.of(element.getAsString()));
            }
        } else {
            ++difference;
            scytheBlacklisted = defaults.getList("scythe_blacklisted_blocks", NbtElement.STRING_TYPE);
        }
        tag.put("scythe_blacklisted_blocks", scytheBlacklisted);

        NbtList macheteBlacklisted = new NbtList();
        NbtList defaultMacheteBlacklist = defaults.getList("machete_blacklisted_blocks", NbtElement.STRING_TYPE);
        if (json.has("machete_blacklisted_blocks")) {
            for (JsonElement element : json.get("machete_blacklisted_blocks").getAsJsonArray()) {
                macheteBlacklisted.add(NbtString.of(element.getAsString()));
            }
        } else {
            ++difference;
            macheteBlacklisted = defaultMacheteBlacklist;
        }
        tag.put("machete_blacklisted_blocks", macheteBlacklisted);

        createFile(toJson(tag), this.difference > 0);
        difference = 0;
        return tag;
    }

    private void setConfigData(NbtCompound data) {
        this.configData = data;
        var scytheBlacklistedBlocks = this.configData.getList("scythe_blacklisted_blocks", NbtElement.STRING_TYPE);
        this.scytheBlacklist.clear();
        for (int i = 0; i < scytheBlacklistedBlocks.size(); i++) {
            this.scytheBlacklist.add(scytheBlacklistedBlocks.getString(i));
        }
        var macheteBlacklistedBlocks = this.configData.getList("machete_blacklisted_blocks", NbtElement.STRING_TYPE);
        this.macheteBlacklist.clear();
        for (int i = 0; i < macheteBlacklistedBlocks.size(); i++) {
            this.macheteBlacklist.add(macheteBlacklistedBlocks.getString(i));
        }
    }

    @SuppressWarnings("UnusedReturnValue")
    public boolean loadConfig() {
        try {
            return loadConfig(getJsonObject(readFile(new File(CONFIG_FILE))));
        } catch (Exception e) {
            LOGGER.info("Found error with config. Using default config.");
            setConfigData(getDefaults());
            createFile(toJson(this.configData), true);
            return false;
        }
    }

    private boolean loadConfig(JsonObject fileConfig) {
        try {
            setConfigData(toNbtCompound(fileConfig));
            return true;
        } catch (Exception e) {
            LOGGER.info("Found error with config. Using default config.");
            setConfigData(getDefaults());
            createFile(toJson(this.configData), true);
            return false;
        }
    }

    public boolean loadConfig(NbtCompound config) {
        try {
            setConfigData(config);
            return true;
        } catch (Exception e) {
            LOGGER.info("Found error with config. Using default config.");
            setConfigData(getDefaults());
            createFile(toJson(this.configData), true);
            return false;
        }
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void createFile(JsonObject contents, boolean overwrite) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        contents = getJsonObject(gson.toJson(contents));

        File file = new File(Config.CONFIG_FILE);
        if (file.exists() && !overwrite) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        file.setReadable(true);
        file.setWritable(true);
        file.setExecutable(true);
        if (contents == null) {
            return;
        }
        try (FileWriter writer = new FileWriter(file)) {
            String json = gson.toJson(contents).replace("\n", "").replace("\r", "");
            writer.write(gson.toJson(getJsonObject(json)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readFile(File file) throws FileNotFoundException {
        Scanner scanner;
        scanner = new Scanner(file);
        scanner.useDelimiter("\\Z");
        var result = scanner.next();
        scanner.close();
        return result;
    }


    public static JsonObject getJsonObject(String json) {
        return JsonParser.parseString(json).getAsJsonObject();
    }

}
