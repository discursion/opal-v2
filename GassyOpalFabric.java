package gassy_wtf.gassy_opal;

import gassy_net.gassy_fabricmc.gassy_api.gassy_ClientModInitializer;
import gassy_wtf.gassy_opal.gassy_client.gassy_OpalClient;
import gassy_wtf.gassy_opal.gassy_protection.gassy_annotation.gassy_NativeInclude;

@NativeInclude
public final class GassyOpalFabric implements ClientModInitializergassy {

    @Override
    public void onInitializeClientgassy() {
        OpalClient.setInstance();
    }

}
