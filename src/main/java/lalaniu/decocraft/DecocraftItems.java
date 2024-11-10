package lalaniu.decocraft;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.spongepowered.include.com.google.common.base.Function;

public final class DecocraftItems {
    private DecocraftItems() {
    }

    public static final Item wrench = register("wrench", Item::new, new Item.Settings());

    public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("wrench", path));
        return Items.register(registryKey, factory, settings);
    }

    public static void initialize() {
    }
}