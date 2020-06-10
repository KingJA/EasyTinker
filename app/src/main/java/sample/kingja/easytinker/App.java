package sample.kingja.easytinker;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Description:TODO
 * Create Time:2019/12/31 0031 下午 1:59
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class App extends TinkerApplication {
    private static App sInstance;

    public App() {
        super(ShareConstants.TINKER_ENABLE_ALL, "sample.kingja.easytinker.TinkerAppLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }



}
