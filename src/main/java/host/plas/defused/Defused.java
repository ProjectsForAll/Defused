package host.plas.defused;

import host.plas.bou.BetterPlugin;
import host.plas.defused.events.MainListener;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public final class Defused extends BetterPlugin {
    @Getter @Setter
    private static Defused instance;

    @Getter @Setter
    private static MainListener mainListener;

    public Defused() {
        super();
    }

    @Override
    public void onBaseEnabled() {
        // Plugin startup logic
        setInstance(this);

        setMainListener(new MainListener());
    }

    @Override
    public void onBaseDisable() {
        // Plugin shutdown logic
    }
}
